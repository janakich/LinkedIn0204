package base;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.Constants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by venkata on 02/04/2019.
 */
public class BaseTest {

    protected static WebDriver driver;
    protected static Properties prop;

    public BaseTest(){

        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties");
            prop.load(fis);
        }catch (java.io.IOException e){
                e.printStackTrace();
        }
    }

    protected static void initBrowser(){
        String browser = prop.getProperty("browser");
        if (browser.equals("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            System.setProperty("webdriver.chrome.driver", prop.getProperty("webdriver.chrome.driver"));
            driver = new ChromeDriver();
        }
        else {System.out.println("No  browser ");}
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.IMPLICITLY_WAIT,TimeUnit.SECONDS);
        String url= prop.getProperty("ApplicationUrlUK");
        driver.get(url);
    }


}
