package test;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.HomePage;
import page.ResultPage;

public class TestCase004 extends BaseTest{

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();



    //Test searches for 'AirPods Pro' product and validates the search results
    @Test
    public void test_SearchForAirpodsPro() {
        homePage.clickCMR_PopUpAdButton();
        homePage.clickSearchBar();
        homePage.sendAirpodsProToSearchBar();
        homePage.sendEnterKeyInSearchBar();
        Assert.assertTrue(resultPage.validateSearchBarResult(), "Product results are correct.");
        closeBrowser();
    }
}
