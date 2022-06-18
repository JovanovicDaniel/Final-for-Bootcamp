package pages;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
public class CheckBoxPage extends BasePage{
    public By checkBoxBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]/span");
    private By checkBox = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/label/span[1]");
    private By checkBoxReport = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/span[1]");
    public void pressCheckBoxBtn () {
        getDriver().findElement(checkBoxBtn).click();
    }
    public void pressCheckBox () {
        getDriver().findElement(checkBox).click();
    }
    public  boolean controlCheckBox () {
        pressCheckBoxBtn();
        pressCheckBox();
        boolean control = false;
        if (getDriver().findElement(checkBoxReport).getText().contains("You have selected :")){
            control = true;
        }
        return control;
    }
    public CheckBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
