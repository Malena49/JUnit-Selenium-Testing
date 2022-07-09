package pageEvents;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.Browser;
import org.junit.jupiter.api.Assertions;
import pageObjects.HomePageElements;
import utils.FetchELement;

public class HomePageEvents {


    public void clickOnRejectCookies(){
        FetchELement elementFetch = new FetchELement();
        if (elementFetch.isElementPresent("ID", HomePageElements.Reject_cookie_btn)){
        elementFetch.getWebElement("ID", HomePageElements.Reject_cookie_btn).click();}
    }
    public void isHomePageOpened(){
        Browser webBrowser= new Browser();
        Assertions.assertEquals(HomePageElements.HomePageTitle, webBrowser.title());
    }
    public void SearchByKeywordField(String item){
        FetchELement elementFetch = new FetchELement();
        WebElement search = elementFetch.getWebElement("ID", HomePageElements.searchField);
        search.sendKeys(item + Keys.ENTER);
    }

}
