package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Browser {
    public static WebDriver driver= new ChromeDriver();



    public static void chromeSetup(){
        driver.manage().window().maximize();
        driver.get(Constants.url);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public static void goTo(String url){
        driver.get(url);
    }
    public  String title(){
        return driver.getTitle();
    }
    public static void close(){
        driver.close();
    }

}
