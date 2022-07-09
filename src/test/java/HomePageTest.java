
import org.junit.jupiter.api.Test;
import pageEvents.HomePageEvents;
import pageEvents.ResultPageEvents;

public class HomePageTest extends BaseTest {
    @Test
    public void canGoToHomePage(){
        HomePageEvents homePage = new HomePageEvents();

        homePage.clickOnRejectCookies();
        homePage.isHomePageOpened();
    }

    @Test
    public void canSearchByKeyword(){
        HomePageEvents homePage = new HomePageEvents();
        ResultPageEvents resultPage = new ResultPageEvents();
        //homePage.clickOnRejectCookies();
        canGoToHomePage();
        homePage.SearchByKeywordField("iphone");
        resultPage.isKeywordInTitle("iphone");

    }


}
