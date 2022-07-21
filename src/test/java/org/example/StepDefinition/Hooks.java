package org.example.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks
{
    public static WebDriver driver = null;
    //Define Before and After methods for driver

    @Before
    public void openBrowser()
    {   //1-First step in code
        String path = "C:\\Users\\mosta\\IdeaProjects\\AutomationProjectUdacity\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        //2-New object from WebDriver
         driver = new ChromeDriver();
        //3-Configurations for the driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //4-Navigate to URL
        driver.navigate().to("https://demo.nopcommerce.com/");


    }

    @After
    public void closeBrowser() throws InterruptedException
    {
        Thread.sleep(3000);
       driver.quit();
    }
}
