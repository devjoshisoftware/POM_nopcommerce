package FirstPageObjectModel;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProps props = new LoadProps();
    @BeforeMethod
    public void setupBrowser(){
        browserSelector.setUpBrowser();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get(props.getProperty("url"));
    }

    @AfterTest
    public void tearDown()
    {

        //driver.quit();
    }

}
