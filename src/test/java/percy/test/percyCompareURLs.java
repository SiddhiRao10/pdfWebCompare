package percy.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Arrays;
import org.openqa.selenium.WebElement;
public class percyCompareURLs extends BaseTest {


    @Test
    public void snapshotCompare() {

        driver.get("https://dev-wev.pantheonsite.io/explore-entrepreneurship/");
      
        JavascriptExecutor js = (JavascriptExecutor) driver;
        percy.snapshot("home", Arrays.asList(375,1280));
       
    }

}
