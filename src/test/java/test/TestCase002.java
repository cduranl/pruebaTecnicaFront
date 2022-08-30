package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.RegisterPage;

public class TestCase002 extends BaseTest{

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    //Test validates incorrect password while submitting a login form
    @Test
    public void test_RegisterPageIsDisplayed(){
        homePage.clickCMR_PopUpAdButton();
        homePage.moveMouseToLoginHiddenMenu();
        homePage.waitDisplayedUserModule();
        homePage.clickRegisterOption();
        registerPage.waitRegisterPageIsDisplayed();
        Assert.assertTrue(registerPage.validateRegisterTitleIsDisplayed(), "Register page displayed correctly");
        closeBrowser();
    }
}
