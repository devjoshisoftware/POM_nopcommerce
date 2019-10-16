package FirstPageObjectModel;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

import static FirstPageObjectModel.BasePage.driver;

public class Hooks extends BasePage{
    BrowserSelector browserSelector = new BrowserSelector();

    @Before   //take cucumber.api's dependency
    public void setUpBrowser() {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
    @After
    public void closeBrowser(){
        driver.close();
}}
