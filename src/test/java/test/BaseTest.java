package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import page.AirPodsProProductPage;
import page.HomePage;
import page.ResultPage;
import util.Driver;

public class BaseTest {

    private HomePage homePage;

    @BeforeClass
    public static void beforeTest(){
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
