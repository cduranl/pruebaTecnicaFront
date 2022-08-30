package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import page.*;
import util.Driver;

public class BaseTest {

    private HomePage homePage;
    private AirPodsProProductPage podsProProductPage;
    private CartPage cartPage;
    private RegisterPage registerPage;
    private ResultPage resultPage;

    @BeforeClass
    public void beforeTest(){ //Was static before
        if(Driver.getDriver() == null){
            Driver.initializeDriver();
        }
    }

    @BeforeTest
    public void init(){
        if(Driver.getDriver() != null){
            Driver.initializeDriver();
        }
    }

    @AfterTest
    public void closeBrowser() {
        Driver.closeDriver();
    }
}
