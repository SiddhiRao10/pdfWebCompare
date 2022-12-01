package percy.test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Arrays;

public class percyWebURL extends BaseTest{

    @Test
    public void snapshotCompare() {
        driver.get("https://dev-wev.pantheonsite.io/explore-entrepreneurship/");

          JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("var element = document.getElementsByTagName('BODY')[0];"+"var parent = element.parentNode;"+"var wrapper = document.createElement('div');"+"wrapper.className='canvasWrapper';"+"parent.replaceChild(wrapper, element);"+"wrapper.appendChild(element);");

        percy.snapshot("Home", Arrays.asList(375,1280),null,false,null,".canvasWrapper");
    }
}