package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.Driver;

public class BasePage implements InterfacePage{

    @Override
    public boolean isDisplayedWebElement(WebElement e) {
        Driver.getDriverWait(30).until(ExpectedConditions.visibilityOf(e));
        return e.isDisplayed();
    }

    @Override
    public void sendKeysWebElement(WebElement e, String text) {
        e.clear();
        e.sendKeys(text);
    }

    @Override
    public void clickWebElement(WebElement e) {
        e.click();
    }

    @Override
    public void waitDisplayedElement(WebElement e) {
        Driver.getDriverWait(30).until(ExpectedConditions.visibilityOf(e));
    }

    @Override
    public boolean isElementContentEquals(WebElement e, String text) {
        waitDisplayedElement(e);
        return e.getText().contains(text);
    }

    @Override
    public boolean isEnabledElement(WebElement e) {
        isDisplayedWebElement(e);
        return true;
    }
}
