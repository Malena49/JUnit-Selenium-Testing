
import org.junit.jupiter.api.Test;
import pageEvents.HomePageEvents;
import pageEvents.ResultPageEvents;

public class HomePageTest extends BaseTest {
    HomePageEvents homePage = new HomePageEvents();
    ResultPageEvents resultPage = new ResultPageEvents();
    @Test
    public void canGoToHomePage(){
        homePage.clickOnRejectCookies();
        homePage.isHomePageOpened();
    }
    @Test
    public void canSearchByKeyword(){
        homePage.clickOnRejectCookies();
        homePage.SearchByKeywordField("iphone");
        resultPage.isKeywordInTitle("iphone");

    }


}
