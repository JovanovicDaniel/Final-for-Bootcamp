package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPage extends BaseTest{

    //Verify that web app displays correct response for click on Elements box.
    @Test(priority = 1)
    public void testTC1 () {
        Assert.assertTrue(getTextBoxPage().firstSelectElements());
    }


    //Verify that web app displays correct response for user name input on Text box page.
    @Test(priority = 2)
    public void testTC2 () {
        Assert.assertTrue(getTextBoxPage().chkUserName());
    }


    //Verify that web app displays correct response for user email input on Text box page.
    @Test(priority = 3)
    public void testTC3 () {
        Assert.assertTrue(getTextBoxPage().chkUserEmail());
    }


    //Verify that web app displays correct response for current address input on Text box page.
    @Test(priority = 3)
    public void testTC4 () {
        Assert.assertTrue(getTextBoxPage().chkCurrentAddress());
    }


    //Verify that web app displays correct response for permanent address input on Text box page.
    @Test(priority = 3)
    public void testTC5 () {
        Assert.assertTrue(getTextBoxPage().chkPermanentAddress());
    }


    //Verify that web app displays correct response for input in check box on Check box page.
    @Test(priority = 4)
    public void testTC6 () {
        Assert.assertTrue(getCheckBoxPage().controlCheckBox());
    }


    //Verify that web app displays correct response for Yes input on Radio button page.
    @Test(priority = 5)
    public void testTC7 () {
        Assert.assertTrue(getRadioButtonPage().chkYes());
    }


    //Verify that web app displays correct response for Impressive input on Radio button page.
    @Test(priority = 6)
    public void testTC8 () {
        Assert.assertTrue(getRadioButtonPage().chkImpressive());
    }


    //Verify that web app displays correct response for double click input on Buttons page.
    @Test(priority = 7)
    public void testTC9 () {
        Assert.assertTrue(getButtonsPage().chkDoubleClick());
    }


    //Verify that web app displays correct response for right click input on Buttons page.
    @Test(priority = 8)
    public void testTC10 () {
        Assert.assertTrue(getButtonsPage().chkRightClick());
    }


    //Verify that web app displays correct response for single click input on Buttons page.
    @Test(priority = 9)
    public void testTC11 () {
        Assert.assertTrue(getButtonsPage().chkSingleClick());
    }

}

