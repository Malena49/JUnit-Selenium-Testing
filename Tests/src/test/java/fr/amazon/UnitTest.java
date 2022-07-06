package fr.amazon;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UnitTest {
    @BeforeAll
    public static void Setup(){
        Browser.chromeSetup();
    }

    @AfterAll
    public static void CleanUp(){
        Browser.close();
    }

    @Test
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        Assertions.assertTrue(Pages.homePage().isAt());
    }

}
