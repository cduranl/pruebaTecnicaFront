package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.HomePage;

//@Listeners(test.TestListeners.class)
public class TestCase001 extends BaseTest{

    HomePage homePage = new HomePage();

    //Test validates the login process with an existing account
    @Test
    public void test_validateLogFormIsDisplayed() {
        homePage.clickCMR_PopUpAdButton();
        homePage.moveMouseToLoginHiddenMenu();
        homePage.waitDisplayedUserModule();
        homePage.clickLogInOption();
        homePage.waitDisplayedLogInForm();
        Assert.assertTrue(homePage.validateLoginFormIsDisplayed(), "Login form is displayed correctly.");
        closeBrowser();
    }
}
