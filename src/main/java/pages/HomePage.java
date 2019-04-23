package pages;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseTest {

    @FindBy(css= "a.nav__button-secondary")
    private WebElement  signIn;

    @FindBy(css= "a.nav__button-tertiary")
    private WebElement joinNow;

    public HomePage(){

        PageFactory.initElements(driver, this);
    }
    public void signIn()
    {
        signIn.click();
    }

    public void joinNow(){
        joinNow.click();
    }

}
