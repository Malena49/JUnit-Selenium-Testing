package fr.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browser {
    static WebDriver driver= new ChromeDriver();

    public static void chromeSetup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void goTo(String url){
        driver.get(url);
    }
    public static String title(){
        return driver.getTitle();
    }
    public static void close(){
        driver.close();
    }

}
