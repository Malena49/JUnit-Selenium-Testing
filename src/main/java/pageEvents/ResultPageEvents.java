package pageEvents;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.ResultPageElements;
import utils.Browser;
import utils.FetchELement;


public class ResultPageEvents {




    public void isKeywordInTitle(String item){
        Browser webBrowser = new Browser();
        Assertions.assertEquals(webBrowser.title(), "Amazon.fr : " + item);
    }

    public WebElement getFirstResult(){
        FetchELement elementFetch = new FetchELement();
       return elementFetch.getWebElement(
                "CSS", ResultPageElements.first_result
        );
    }
    public void clickOnFirstResult(){
        getFirstResult().findElement(
                By.cssSelector(ResultPageElements.All_result_links)
        ).click();

    }
    public String getFirstResultTitle(){
        WebElement first_title = getFirstResult().findElement(
            By.cssSelector(
                    ResultPageElements.All_Result_Titles));

        return first_title.getText();
    }
}
