package Clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.List;

public class cssSelectorTest {

    @Test
    public void spotifyTest() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/uy/signup");

        //Thread.sleep(5000);

        WebElement cookiesButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button"));
        cookiesButton.click();



        driver.findElement(By.cssSelector("#email")).sendKeys("any88pereira@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Anyyoa.12");



        driver.findElement(By.cssSelector("#displayname")).sendKeys("Any");
        driver.findElement(By.cssSelector("#day")).sendKeys("05");

        WebElement mesElement = driver.findElement(By.cssSelector("#month"));
        Select mesSelect = new Select(mesElement);
        mesSelect.selectByVisibleText("Agosto");

        driver.findElement(By.cssSelector("#year")).sendKeys("1988");

        Thread.sleep(5000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("[for='gender_option_male']")).click();

        driver.findElement(By.cssSelector("[for='marketing-opt-checkbox']")).click();

    }

    @Test
    public void spotifyTestName() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/uy/signup");

        //Thread.sleep(5000);

        WebElement cookiesButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button"));
        cookiesButton.click();



        driver.findElement(By.cssSelector("[name='email']")).sendKeys("any88pereira@gmail.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("Anyyoa.12");



        driver.findElement(By.cssSelector("[name='displayname']")).sendKeys("Any");
        driver.findElement(By.cssSelector("[name='day']")).sendKeys("05");

        WebElement mesElement = driver.findElement(By.cssSelector("#month"));
        Select mesSelect = new Select(mesElement);
        mesSelect.selectByVisibleText("Agosto");

        driver.findElement(By.cssSelector("#year")).sendKeys("1988");

        Thread.sleep(5000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("[for='gender_option_male']")).click();

        driver.findElement(By.cssSelector("[for='marketing-opt-checkbox']")).click();

    }

}
