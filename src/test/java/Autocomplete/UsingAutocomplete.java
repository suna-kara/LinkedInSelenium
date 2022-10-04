package Autocomplete;

import Utilities.Driver;
import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UsingAutocomplete {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");

        //Maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public  void  selenium_test(){
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete= driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Ergenekon Mahallesi 1209 sokak no:8 kat:1");
    }


}