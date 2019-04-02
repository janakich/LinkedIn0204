package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by venkata on 02/04/2019.
 */
public class LoginPage extends BaseTest{

    @FindBy(id= "login-email") private WebElement userName;
    @FindBy(id= "login-password") private WebElement password;
    @FindBy(id= "login-submit") private WebElement submitButton;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public String getTitle(){

        return driver.getTitle();
    }

    public void dologin(){
        userName.sendKeys(prop.getProperty("userName"));
        userName.sendKeys(prop.getProperty("password"));
        submitButton.click();
        
    }
}
