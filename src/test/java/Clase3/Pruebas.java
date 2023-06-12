package Clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class Pruebas {
    public void spotifyTest() {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/uy/signup");

        driver.findElement(By.cssSelector("#email")).sendKeys("any88pereira@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Anyyoa.12");
        driver.findElement(By.cssSelector("#displayname")).sendKeys("Any");
        driver.findElement(By.cssSelector("#day")).sendKeys("05");

        WebElement mesElement = driver.findElement(By.cssSelector("#month"));
        Select mesSelect = new Select(mesElement);
        mesSelect.selectByVisibleText("Abril");

        // mesSelect.selectByValue("08");


        driver.findElement(By.cssSelector("#year")).sendKeys("1988");


    }
}
