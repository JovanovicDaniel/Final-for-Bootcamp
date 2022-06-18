package pages;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
public class RadioButtonPage extends BasePage{

    private By radioBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]/span");
    private By radioYes = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By radioImpressive = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]");
    private By radioYesText = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p/span");
    private By radioImpressiveText = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p/span");

    public void pressRadioBtn () {
        getDriver().findElement(radioBtn).click();
    }
    public void pressRadioYes (){
        getDriver().findElement(radioYes).click();
    }
    public  void pressRadioImpressive () {
        getDriver().findElement(radioImpressive).click();
    }
    public boolean chkYes () {
        pressRadioBtn();
        pressRadioYes();
        boolean chk = false;
        if (getDriver().findElement(radioYesText).getText().contains("Yes")){
            chk = true;
        }
        return chk;
    }
    public boolean chkImpressive () {
        pressRadioImpressive();
        boolean chk = false;
        if (getDriver().findElement(radioImpressiveText).getText().contains("Impressive")){
            chk = true;
        }
        return chk;
    }

    public RadioButtonPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
