import fr.amazon.Pages;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        Assertions.assertTrue(Pages.homePage().isAt());
    }

}
