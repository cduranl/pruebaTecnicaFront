package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class CartPage extends BasePage {

    public CartPage() { PageFactory.initElements(Driver.getDriver(), this); }

    //Getters and setters of CartPage WebElements
    @FindBy (xpath = "//div/span[@data-testid='name']")
    private WebElement airPodsProProduct;

    //Validate if the cart contains our selected product 'Airpods Pro'
    public boolean validateCartContainsAirpodsProduct(){ return isDisplayedWebElement(airPodsProProduct); }



}