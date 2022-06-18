package pages;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
public class TextBoxPage extends BasePage{

    private By elementsBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]");
    private By textBoxBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]/span");
    private By userName = By.id("userName");
    private By userEmail = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitBtn = By.id("submit");
    private By nameReport = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[1]");
            //By.id("name");
    private By emailReport = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[2]");
                    //id("email");
    private By currentAddressReport = By.xpath("//*[@id='output']/div/p[3]");
    private By permanentAddressReport = By.xpath("//*[@id='output']/div/p[4]");

    private static final String actualName = "Jovan Jovanovic";
    private static final String actualEmail = "jovan@jovanovic.rs";
    private static final String actualCurrentAddress = "Belgrade Waterfront";
    private static final String actualPermanentAddress = "Novi Sad Waterfront";

    public void selectElements (){
        getDriver().findElement(elementsBtn).click();
    }

    public void pressTextBoxBtn () {
        getDriver().findElement(textBoxBtn).click();
    }
    public void enterUserName (String username){
        getDriver().findElement(this.userName).sendKeys(username);
    }
    public void enterUsrEmail (String useremail){
        getDriver().findElement(userEmail).sendKeys(useremail);
    }
    public void enterCurrentAddress (String currentadress){
        getDriver().findElement(currentAddress).sendKeys(currentadress);
    }
    public void enterPermanentAddress (String permanentaddress){
        getDriver().findElement(permanentAddress).sendKeys(permanentaddress);
    }
    public void pressSubmitBtn () {
        getDriver().findElement(submitBtn).click();
    }

    public void scroll () {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
    }

    public boolean firstSelectElements () {
        selectElements();
        boolean chk = false;
        if (getDriver().getCurrentUrl().equals("https://demoqa.com/elements")){
            chk = true;
        }
        return chk;
    }
    public void  fillTextBox (){
        pressTextBoxBtn();
        enterUserName(actualName);
        enterUsrEmail(actualEmail);
        enterCurrentAddress(actualCurrentAddress);
        enterPermanentAddress(actualPermanentAddress);
        scroll();
        pressSubmitBtn();
    }
    public boolean chkUserName () {
        fillTextBox();
        boolean chk = false;
        if (getDriver().findElement(nameReport).getText().contains(actualName)){
            chk = true;
        }
        return chk;
    }
    public boolean chkUserEmail() {
        boolean chk = false;
        if (getDriver().findElement(emailReport).getText().contains(actualEmail)){
            chk = true;
        }
        return chk;
    }
    public boolean chkCurrentAddress () {
        //threadWait();
        boolean chk = false;
        if (getDriver().findElement(currentAddressReport).getText().contains(actualCurrentAddress)){
            chk = true;
        }
        return chk;
    }
    public boolean chkPermanentAddress () {
        //threadWait();
        boolean chk = false;
        if (getDriver().findElement(permanentAddressReport).getText().contains(actualPermanentAddress)){
            chk = true;
        }
        return chk;
    }
    public TextBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
