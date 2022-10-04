package Autocomplete;

import Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SwitchToAlert {
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
    public  void  ScrollTest() {
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alert=driver.findElement(By.id("alert-button"));
        alert.click();

        Alert alert1=driver.switchTo().alert();
        alert1.accept();

    }
    }
