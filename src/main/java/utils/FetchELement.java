package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FetchELement {
    public WebElement getWebElement(String type, String value){
        return switch (type) {
            case "ID" -> Browser.driver.findElement(By.id(value));
            case "CSS" -> Browser.driver.findElement(By.cssSelector(value));
            case "TAGNAME" -> Browser.driver.findElement(By.tagName(value));
            case "XPATH" -> Browser.driver.findElement(By.xpath(value));
            default -> null;
        };
    }
    public List<WebElement> getWebElements(String type, String value){
        return switch (type) {
            case "ID" -> Browser.driver.findElements(By.id(value));
            case "CSS" -> Browser.driver.findElements(By.cssSelector(value));
            case "TAGNAME" -> Browser.driver.findElements(By.tagName(value));
            case "XPATH" -> Browser.driver.findElements(By.xpath(value));
            default -> null;
        };
    }
    public boolean isElementPresent(String type, String value){
        try {
            getWebElement(type, value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean areElementsPresent(String type, String value){
        try {
            getWebElements(type, value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
