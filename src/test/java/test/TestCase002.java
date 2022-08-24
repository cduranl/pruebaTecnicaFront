package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;

public class TestCase002 extends BaseTest{

    HomePage homePage = new HomePage();

    //Test validates incorrect password while submitting a login form
    @Test
    public void validate_IncorrectEmailAndPasswordLoginProcess(){
        homePage.clickCMR_PopUpAdButton();
        homePage.clickMyOrdersButton();
        homePage.waitDisplayedLogInForm();
        homePage.sendEmailLoginForm();
        homePage.sendInvalidPasswordLoginForm();
        homePage.clickLoginFormSubmitBtn();
        Assert.assertTrue(homePage.validateErrorMsgIncorrectEmailPassword(), "Incorrect password.");
        closeBrowser();
    }
}
