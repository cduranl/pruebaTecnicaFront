package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;

public class TestCase001 extends BaseTest{

    HomePage homePage = new HomePage();


    //Test validates the login process with an existing account
    @Test
    public void test_validateLoginProcess() {
        homePage.clickCMR_PopUpAdButton();
        homePage.moveMouseToLoginHiddenMenu();
        homePage.waitDisplayedUserModule();
        homePage.clickLogInOption();
        homePage.waitDisplayedLogInForm();
        homePage.sendEmailLoginForm();
        homePage.sendPasswordLoginForm();
        homePage.clickLoginFormSubmitBtn();
        Assert.assertTrue(homePage.validateUsernameIsDisplayedOnHomepage(), "User logged in is correct.");
        closeBrowser();
    }
}
