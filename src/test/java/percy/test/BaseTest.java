package percy.test;
import com.sun.net.httpserver.HttpServer;
import io.percy.selenium.Percy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sun.jvm.hotspot.HotSpotAgent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BaseTest {
    public static WebDriver driver;
    public static Percy percy;
    public static final String PROD_URL = "https://www.browserstack.com";
    public static final String Non_PROD_URL = "https://k8s.bsstag.com/";
    private static ExecutorService serverExecutor;
    private static HttpServer server;
    @BeforeMethod
    public void setup()
    {
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        System.setProperty("webdriver.gecko.driver","/Users/siddhirao/SidProjects/Assignments/percyAssignment1/src/main/resources/driver/geckodriver");
        driver = new FirefoxDriver(options);
        percy = new Percy(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }
}
