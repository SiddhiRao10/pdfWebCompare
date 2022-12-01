package percy.test;

import io.percy.selenium.Percy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    public static WebDriver driver;
    public static Percy percy;

    @BeforeMethod
    public void setup()
    {
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        System.setProperty("webdriver.gecko.driver","/Users/siddhirao/SidProjects/Percy/figmaPDFweb/pdfWebCompare/src/main/resources/driver/geckodriver");
        driver = new FirefoxDriver(options);
        percy = new Percy(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }
}
