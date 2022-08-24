package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class ResultPage extends BasePage{

    public ResultPage() { PageFactory.initElements(Driver.getDriver(), this); }

    //Getters and setters for ResultPage WebElements
    @FindBy (xpath = "//span/b[@id='testId-pod-displaySubTitle-15711944']")
    private WebElement airPodsProResult;

    //Validates if 'airPodsProResult' WebElement is displayed upon result search from HomePage.
    public boolean validateSearchBarResult() { return isDisplayedWebElement(airPodsProResult); }

    //Clicks on product result from search bar process
    public void clickProductName() {
        clickWebElement(airPodsProResult);
        new AirPodsProProductPage();
    }
}
