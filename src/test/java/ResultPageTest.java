import org.junit.jupiter.api.Test;
import pageEvents.ResultPageEvents;

public class ResultPageTest extends BaseTest {
    ResultPageEvents resultPage = new ResultPageEvents();
    HomePageTest homePage = new HomePageTest();
    @Test
    public void enterFirstResultPage(){
        homePage.canSearchByKeyword();
        resultPage.clickOnFirstResult();
    }
}
