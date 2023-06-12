package Clase5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSpotify {
    private static WebDriver driver;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/uy/");
    }

    @Test (priority = 1)
    public void verifySpotifyTitle() {
        String expectedTitle= "Spotify - Web Player: Music for everyone";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 2)
    public void verifySingUrl() throws InterruptedException {


        Thread.sleep(4000);

        driver.findElement(By.cssSelector("#onetrust-close-btn-container")).click();

        //driver.findElement(By.xpath("//*[contains(tex(),'Sign up free')]")).click();

        driver.findElement(By.xpath("//*[@class='ButtonInner-sc-14ud5tc-0 iIKcFo encore-inverted-light-set XkXPpDRWozMF6G8_GlLQ']")).click();

       // System.out.println(driver.getCurrentUrl());
        //Assert.assertEquals(driver.getCurrentUrl(), "https://open.spotify.com/?", "Se esperaba otra url");

    }

    @Test(priority = 3)
    public void invalidEmailTest() throws InterruptedException {

        Thread.sleep(4000);

        driver.findElement(By.cssSelector("#onetrust-close-btn-container")).click();

        driver.findElement(By.xpath("//*[@class='ButtonInner-sc-14ud5tc-0 iIKcFo encore-inverted-light-set XkXPpDRWozMF6G8_GlLQ']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@test.com");
        Assert.assertEquals("test.com", "test@test.com", "La direccion de email que proporcionaste no es valida");
    }


}
