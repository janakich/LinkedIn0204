import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.nio.file.Files;
/**
 * Created by venkata on 21/03/2019.
 */
public class FakeWebsite {
    public static void main(String[] args) {

        //lassLoader classLoader = new FakeWebsite().getClass().getClassLoader();
        //File file = new File(classLoader.getResource("config.properties").getFile());
        //File propertyFile = new File ("C:\\Dev_Janaki\\FakeWebsiteOne\\src\\main\\resources\\config.properties");
        //FileInputStream fi = new FileInputStream(propertyFile) throws FileNotFoundException;

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.linkedin.com");
        driver.findElement(By.id("login-email")).sendKeys("j_chitta@hotmail.com");
        driver.findElement(By.id("login-password")).sendKeys("sarath507");
        driver.findElement(By.id("login-submit")).click();
    }
}
