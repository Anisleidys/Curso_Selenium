package Clase5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class SpotifyTesting {

    private static WebDriver driver;

    @BeforeMethod
    public void spotifyInicial() throws InterruptedException {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/uy/signup");

    }

    @Test
    @Parameters("tagName")
    public void printTags(@Optional("label") String tag){

        List<WebElement> listaElementos = driver.findElements(By.tagName(tag));

        for(WebElement e: listaElementos){
            System.out.println("----> " +e.getText());
        }
    }

    @Test
    public void spotifyTestingGeturl() throws InterruptedException {
        System.out.println("URL " + driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.spotify.com/uy/signup", "Se esperaba otra url");

    }

    @Test
    public void spotifyTestingGetTitle(){
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Sign up - Spotify");
        Assert.assertTrue(driver.getTitle().contains("Spotify"), "Error: el titulo debe contener la palabra Spotify");


    }

    @Test
    public void spotifyTestingRegister(){
        driver.findElement(By.cssSelector("#onetrust-close-btn-container")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anypereira88@gmail.com");

    }


    @AfterMethod
    public static void closeSystem() {
        driver.close();

    }


}
