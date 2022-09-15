package webdriverpool;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Initializer {

    public static ChromeDriver driver;

    public static void initialize(){
        // setup chromedriver
        WebDriverManager.chromedriver().setup();
        // run with incognito
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--start-maximized");
        // initialize webdriver
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void quit(){
        driver.quit();
    }

}
