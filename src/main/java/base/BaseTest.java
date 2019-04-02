package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * Created by venkata on 02/04/2019.
 */
public class BaseTest {

    public static WebDriver driver;
    public static Properties prop;

    public BaseTest(){

        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties");
            prop.load(fis);
        }catch (java.io.IOException e){
                e.printStackTrace();
        }
    }
    public static void initBrowser(){
        String browser = prop.getProperty("browser");
        if (browser.equals("chrome")){
            driver = new ChromeDriver();
        }
        else {System.out.println("No  browser ");}




    }

}
