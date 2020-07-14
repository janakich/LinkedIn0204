import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginLogout extends BaseTest {

    @Test
    public void Login() {
        initBrowser();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.signIn();
        loginPage.dologin();


    }
}
