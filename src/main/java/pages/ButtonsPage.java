package pages;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Data
public class ButtonsPage extends BasePage{

    private By buttonsBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]/span");
    private By doubleClickBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/button");
    private By rightClickBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/button");
                    //id("rightClickBtn");
    private By clickMeBtn = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/button");
    private By doubleClickReport = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p");
    private By rightClickReport = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p[2]");
    private By clickBtnReport = By.id("dynamicClickMessage");

    public void pressButtons () {
        getDriver().findElement(buttonsBtn).click();
    }
    public void pressDoubleClick () {
        Actions act = new Actions (getDriver());
        act.doubleClick(getDriver().findElement(doubleClickBtn)).perform();
    }

    public void rightClick () {
        Actions act = new Actions(getDriver());
        act.contextClick(getDriver().findElement(rightClickBtn)).perform();
    }
    public void singleClick () {
        getDriver().findElement(clickMeBtn).click();
    }
    public boolean chkDoubleClick () {
        scroll();
        pressButtons();
        pressDoubleClick();
        rightClick();
        singleClick();
        boolean chk = false;
        if (getDriver().findElement(doubleClickReport).getText().contains("You have done a double click")){
            chk = true;
        }
        return chk;
    }
    public boolean chkRightClick () {

        boolean chk = false;
        if (getDriver().findElement(rightClickReport).getText().contains("You have done a right click")){
            chk = true;
        }
        return chk;
    }

    public boolean chkSingleClick () {
        singleClick();
        scroll();
        boolean chk = false;
        if (getDriver().findElement(clickBtnReport).getText().contains("You have done a dynamic click")){
            chk = true;
        }
        return chk;
    }
    public void scroll () {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
    }


    public ButtonsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
