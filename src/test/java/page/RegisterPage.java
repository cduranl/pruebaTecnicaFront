package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class RegisterPage extends BasePage {

    public RegisterPage(){PageFactory.initElements(Driver.getDriver(), this); }

    //Defines Register Title Label
    @FindBy( xpath = "//div[@class='jsx-55450280']")
    private WebElement registerPageTitleLabel;

    //Validates TRUE if the register title from the register page is displayed
    public boolean validateRegisterTitleIsDisplayed() { return isDisplayedWebElement(registerPageTitleLabel);}

    //Waits for the register page to be displayed
    public void waitRegisterPageIsDisplayed() {
        waitDisplayedElement(registerPageTitleLabel);
    }
}
