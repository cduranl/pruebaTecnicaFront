package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.AirPodsProProductPage;
import page.CartPage;
import page.HomePage;
import page.ResultPage;

public class TestCase005 extends BaseTest{

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();
    CartPage cartPage = new CartPage();
    AirPodsProProductPage proProductPage = new AirPodsProProductPage();




    //Test to search 'AirPods Pro' and add the product into shopping car
    @Test
    public void test_searchAndAddProductToCart(){
        homePage.clickCMR_PopUpAdButton();
        homePage.clickSearchBar();
        homePage.sendAirpodsProToSearchBar();
        homePage.sendEnterKeyInSearchBar();
        resultPage.clickProductName();
        proProductPage.clickAddToCartButton();
        //proProductPage.clickGoToCartButton();
        proProductPage.clickExitPopUpProductBtn();
        proProductPage.clickGoToCartMainPageBtn();
        Assert.assertTrue(cartPage.validateCartContainsAirpodsProduct(), "Shopping cart products are correct.");
        closeBrowser();
    }
}
