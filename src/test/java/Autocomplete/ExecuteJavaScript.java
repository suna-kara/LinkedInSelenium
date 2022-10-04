package Autocomplete;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExecuteJavaScript {
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
        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton= driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton= driver.findElement(By.id("close-button"));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",closeButton);
    }
}