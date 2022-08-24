package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class AirPodsProProductPage extends BasePage{

    public AirPodsProProductPage() { PageFactory.initElements(Driver.getDriver(), this); }


    //Getters and setters for AirPodsProProductPage
    @FindBy (xpath = "//div[@id='buttonForCustomers']")
    private WebElement addToCart;

    @FindBy (xpath = "//div[@class='jsx-1941891310 addToCart-btn mkp']")
    private WebElement goToCart;

    @FindBy (xpath = "//button[@class='jsx-1941891310']")
    private WebElement exitProductPopUPBtn;

    @FindBy (xpath = "//div/a[@id='testId-UserAction-basket']")
    private WebElement productPageGoToCartBtn;

    @FindBy (xpath = "//div[@class='jsx-1941891310 popup small']")
    private WebElement popUpProductPage;

    //Clicks the add to cart button
    public void clickAddToCartButton() {
        clickWebElement(addToCart);
    }

    //Clicks the goto cart button
    public void clickGoToCartButton() {
        clickWebElement(goToCart);
        new CartPage();
    }

    //Clicks the exit pop up product button
    public void clickExitPopUpProductBtn() {
        waitDisplayedElement(popUpProductPage);
        clickWebElement(exitProductPopUPBtn);
    }

    //Clicks the goto cart in home page button
    public void clickGoToCartMainPageBtn() {
        clickWebElement(productPageGoToCartBtn);
        new CartPage();
    }
}
