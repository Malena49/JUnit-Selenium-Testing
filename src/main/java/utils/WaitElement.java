package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitElement {
    public WebElement waitWebElement(String type, long second, By locator){
        WebDriverWait wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(second));
        return switch (type) {
            case "clickable" -> wait.until(ExpectedConditions.elementToBeClickable(locator));
            case "visible" -> wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            default -> null;
    };
}

    public List<WebElement> waitWebElements(String type, long second, By locator){
        WebDriverWait wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(second));
        return switch (type) {
            case "visible" -> wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
            case "present" -> wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

            default -> null;
        };
    }
    public boolean isElementPresent(String type, long second, By locator){
        try {
            waitWebElement(type, second, locator);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean areElementsPresent(String type, long second, By locator){
        try {
            waitWebElements(type, second, locator);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
