import fr.amazon.Browser;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    public static void Setup(){
        Browser.chromeSetup();
    }

    @AfterAll
    public static void CleanUp(){
        Browser.close();
    }
}
