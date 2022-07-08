package pageEvents;

import org.junit.jupiter.api.Assertions;
import pageObjects.ResultPageElements;
import utils.Browser;
import utils.FetchELement;

public class ResultPageEvents {
    FetchELement elementFetch = new FetchELement();

    public void isKeywordInTitle(String item){
        Assertions.assertEquals(Browser.title(), "Amazon.fr : " + item);
    }
    public void clickOnFirstResult(){
        elementFetch.getWebElement(
                        "CSS", ResultPageElements.first_result_link
                ).click();
    }
}
