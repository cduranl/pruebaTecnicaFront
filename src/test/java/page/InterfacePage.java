package page;

import org.openqa.selenium.WebElement;

public interface InterfacePage {

    boolean isDisplayedWebElement(WebElement e);

    void sendKeysWebElement(WebElement e, String text);

    void clickWebElement(WebElement e);

    void waitDisplayedElement(WebElement e);

    boolean isElementContentEquals(WebElement e, String text);

    boolean isEnabledElement(WebElement e);

}
