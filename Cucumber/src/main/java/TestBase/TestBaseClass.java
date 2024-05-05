package TestBase;

import Utilities.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TestBaseClass {
    public static WebDriver driver;

    public void launchBrowserAndNavigate() throws Exception {

        String browser = ReadProperties.getPropertyy("browser");
        String url = ReadProperties.getPropertyy("url");

        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        driver.get(url);
    }
}

