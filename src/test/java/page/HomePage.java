package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class HomePage extends BasePage{

    public HomePage(){ PageFactory.initElements(Driver.getDriver(), this);}

    Actions actions = new Actions(Driver.getDriver());

    //Getters and setters for HomePage
    @FindBy(xpath = "//div[@id='testId-UserAction-userinfo']")
    private WebElement loginUserHomeButton;

    @FindBy(xpath = "//div[@class='UserInfo-module_info__name__2L1i6 ']")
    private WebElement logInHiddenMenu;

    @FindBy(xpath = "//div[@class='Popover-module_popover__2BK5J UserInfo-module_loggedin-modal__RbQOQ']")
    private WebElement userInfoPopoverModule;

    @FindBy(xpath = "//*[@id='testId-loggedout-item-0']")
    private WebElement logInOption;

    @FindBy(xpath = "//*[@id='testId-loggedout-item-1']")
    private WebElement registerOption;

    @FindBy(xpath = "//input[@id='testId-cc-login-form-email-input']")
    private WebElement loginEmailTextBox;

    @FindBy(xpath = "//input[@id='testId-cc-login-form-password-input']")
    private WebElement loginPasswordTextBox;

    @FindBy(xpath = "//button[@id='testId-cc-login-form-submit']")
    private WebElement loginFormSubmitBtn;

    @FindBy(xpath = "//div[@id='testId-cc-login-form']")
    private  WebElement loginForm;

    @FindBy(xpath = "//div/p[@class='UserInfo-module_display1__1TD_E']")
    private WebElement userNameAccount;

    @FindBy( xpath = "//div[@class='jsx-55450280']")
    private WebElement registerPageTitleLabel;

    @FindBy(xpath = "//input[@id='testId-SearchBar-Input']")
    private WebElement searchBar;

    //@FindBy(xpath = "//header/div[@id='scrollable-content']")
    @FindBy(xpath = "//div/button[@class='SearchBar-module_searchBtnIcon__2L2s0 SearchBar-module_showFlatEdges__I5E-G SearchBar-module_overlap__26Avz']")
    private WebElement searchBarButton;

    @FindBy(xpath ="//div[@class='dy-lb-close']")
    private WebElement cmrPopUpAdBtn;

    @FindBy(xpath = "//button[@class='airship-btn airship-btn-deny']")
    private WebElement noThanksBestOffersBtn;

    @FindBy(xpath = "//li/a[@id='testId-userAction-orders']")
    private WebElement myOrdersButton;

    @FindBy(xpath = "//div[text()='Correo electrónico o contraseña incorrecta. Por favor, vuelve a intentarlo nuevamente.']")
    private WebElement errorMsgIncorrectEmailPassword;

    @FindBy(xpath="//div[@class='Zone-module_zone-select-wrapper__2NKEc']")
    private WebElement whereToDeliverProductLabel;

    @FindBy(xpath = "//div[@class='Search-module_header__1K8Ze']")
    private WebElement popUpSearchBarEmpty;

    //Validates if Register Page Title Label is displayed
    public boolean validateRegisterPageTitleLabelAppears() { return isDisplayedWebElement(registerPageTitleLabel); }

    //Validates if Login Form is displayed
    public boolean validateLoginFormIsDisplayed() { return isDisplayedWebElement(loginForm); }

    //Validates if Error Pop Up Message is displayed
    public boolean validateErrorPopUpMessageAppears() { return isDisplayedWebElement(popUpSearchBarEmpty); }

    //Validates if Error Message of Incorrect Email/Password is displayed
    public boolean validateErrorMsgIncorrectEmailPassword() { return isDisplayedWebElement(errorMsgIncorrectEmailPassword); }

    //Validates if Username of signed account is displayed
    public boolean validateUsernameIsDisplayedOnHomepage() { return isDisplayedWebElement(userNameAccount);}

    //Wait for element to be displayed
    public void waitNoThanksOfferBtn() {
        waitDisplayedElement(noThanksBestOffersBtn);
    }

    //Clicks register option in hidden menu
    public void clickRegisterOption() {
        clickWebElement(registerOption);
        new RegisterPage();
    }

    //Clicks exit button upon arrival of the web page.
    public void clickCMR_PopUpAdButton() {
        clickWebElement(cmrPopUpAdBtn);
    }

    //Clicks No thanks button for the best offer pop up.
    public void clickNoThanksBestOffersBtn() {
        clickWebElement(noThanksBestOffersBtn);
    }

    //Clicks on the searchBar
    public void clickSearchBar() {
        clickWebElement(searchBar);
    }

    //Sends keys 'AirPods Pro' to the search bar
    public void sendAirpodsProToSearchBar() {
        sendKeysWebElement(searchBar, "Airpods Pro");
    }

    //Sends keys 'duran.a.camilo@gmail.com' to login email text box
    public void sendEmailLoginForm() {
        sendKeysWebElement(loginEmailTextBox, "duran.a.camilo@gmail.com");
    }

    //Sends correct password to login password text box
    public void sendPasswordLoginForm() {
        sendKeysWebElement(loginPasswordTextBox, "Password123");
    }

    //Sends incorrect password to login password text box
    public void sendInvalidPasswordLoginForm() {
        sendKeysWebElement(loginPasswordTextBox, "password");
    }

    //Clicks WebElement myOrdersButton to navigate to my orders menu
    public void clickMyOrdersButton(){
        clickWebElement(myOrdersButton);
    }

    //Clicks WebElement loginFormSubmitBtn to login
    public void clickLoginFormSubmitBtn() {
        clickWebElement(loginFormSubmitBtn);
    }

    //Clicks on the search bar button
    public void clickSearchBarButton() {
        clickWebElement(searchBarButton);
        new ResultPage();
    }

    //Clicks on Log In Option from Pop Over Menu
    public void clickLogInOption() {
        clickWebElement(logInOption);
    }

    public void moveMouseToLoginHiddenMenu() {
        actions.moveToElement(logInHiddenMenu).perform();
    }

    //Sends ENTER key while on the search bar (Works as secondary option to click search button)
    public void sendEnterKeyInSearchBar() {
        sendKeysWebElement(searchBar, String.valueOf(Keys.ENTER));
        new ResultPage();
    }

    //Waits for WebElement loginForm to be displayed
    public void waitDisplayedLogInForm() {
        waitDisplayedElement(loginForm);
    }

    //Waits for User Module Pop Over
    public void waitDisplayedUserModule() { waitDisplayedElement(userInfoPopoverModule); }

    //Clicks CMR Pop Up Message if displayed
    public void clickCmrPopupMessageIfDisplayed() {
        if (cmrPopUpAdBtn.isDisplayed()){
            clickWebElement(cmrPopUpAdBtn);
        } else { clickSearchBar(); }
    }
}
