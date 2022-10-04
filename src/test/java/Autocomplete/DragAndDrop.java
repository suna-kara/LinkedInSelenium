package Autocomplete;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");

        //Maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void ScrollTest() {
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image= driver.findElement(By.id("image"));

        WebElement box= driver.findElement(By.id("box"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();



    }
    }
