import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageEvents.ResultPageEvents;
import pageEvents.SingleProductPageEvents;
import java.util.concurrent.TimeUnit;


public class ResultPageTest extends BaseTest {

    @Test
    public void enterFirstResultPage(){
        HomePageTest homePage = new HomePageTest();
        ResultPageEvents resultPage = new ResultPageEvents();
        SingleProductPageEvents SingleProduct = new SingleProductPageEvents();
        homePage.canSearchByKeyword();
     try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        String title_in_result_page = resultPage.getFirstResultTitle();
        resultPage.clickOnFirstResult();
       String title_in_single_page = SingleProduct.getProductTitle();
       Assertions.assertEquals(title_in_result_page, title_in_single_page);
    }
}
