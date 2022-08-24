package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import page.HomePage;

public class TestCase003 extends BaseTest{

    HomePage homePage = new HomePage();

    //Validate empty search bar process
    @Test
    public void test_validateEmptySearchBar() {
        homePage.clickCMR_PopUpAdButton();
        homePage.clickSearchBar();
        homePage.sendEnterKeyInSearchBar();
        Assert.assertTrue(homePage.validateErrorPopUpMessageAppears(), "Search Bar empty.");
        closeBrowser();
    }

}
