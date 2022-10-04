package Autocomplete;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ScrollToElement {
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
    public  void  ScrollTest(){
        driver.get("https://formy-project.herokuapp.com/scroll");

         WebElement name= driver.findElement(By.id("name"));
         Actions actions=new Actions(driver);
         actions.moveToElement(name);
         name.sendKeys("Suna Kara");

         WebElement date= driver.findElement(By.id("date"));
         date.sendKeys("01/05/1988");

     }
}
