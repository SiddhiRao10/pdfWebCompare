package percy.test;

import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;
import java.util.Arrays;

public class percyCompareURLs extends BaseTest {


    @Test
    public void snapshotCompare() {

        driver.get("https://www.browserstack.com/docs/");
      
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var element = document.getElementsByTagName('BODY')[0];"+"var parent = element.parentNode;"+"var wrapper = document.createElement('div');"+"wrapper.className='canvasWrapper';"+"parent.replaceChild(wrapper, element);"+"wrapper.appendChild(element);");

        percy.snapshot("Home");
       
    }

}
