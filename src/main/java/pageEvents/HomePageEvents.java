package pageEvents;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.Browser;
import org.junit.jupiter.api.Assertions;
import pageObjects.HomePageElements;
import utils.FetchELement;

public class HomePageEvents {
    FetchELement elementFetch = new FetchELement();
    public void clickOnRejectCookies(){
        if (elementFetch.isElementPresent("ID", HomePageElements.Reject_cookie_btn)){
        elementFetch.getWebElement("ID", HomePageElements.Reject_cookie_btn).click();}
    }
    public void isHomePageOpened(){
        Assertions.assertEquals(HomePageElements.HomePageTitle, Browser.title());
    }
    public void SearchByKeywordField(String item){
        WebElement search = elementFetch.getWebElement("ID", HomePageElements.searchField);
        search.sendKeys(item);
        search.sendKeys(Keys.ENTER);
    }

}
