import TestBase.TestBaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBaseClass {
    @BeforeMethod
    public void login() throws Exception {
        launchBrowserAndNavigate();
    }

    @Test
    public void logintest() {
        System.out.println(driver.getCurrentUrl());
    }
}

