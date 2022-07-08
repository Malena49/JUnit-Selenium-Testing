package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;

import java.time.Duration;

public class Browser {
    public static WebDriver driver= new ChromeDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public static void chromeSetup(){
        driver.manage().window().maximize();
        driver.get(Constants.url);
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
