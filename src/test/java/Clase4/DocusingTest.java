package Clase4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DocusingTest {


    @Test
    public void completeDousingnForm() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(" https://go.docusign.com/o/trial/");

        driver.findElement(By.xpath("//input[@name='workEmail']")).sendKeys("testing@test.com");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@type='submit'][@title='Comenzar']")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Any");
        driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Pereira");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("94015699");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@type='submit'][@title='Siguiente']")).click();

    }

    @Test
    public void spotifyByNametest() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/uy/signup/");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']")).click();

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("any88pereira@gamil.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("anyyoa.123456");

        Thread.sleep(5000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        driver.findElement(By.xpath("//input[@name='day']")).sendKeys("5");
        WebElement meses = driver.findElement(By.xpath("//*[@name='month']"));
        Select agosto= new Select(meses);
        agosto.selectByVisibleText("Agosto");
        driver.findElement(By.xpath("//input[@name='year']")).sendKeys("1988");

        driver.findElement(By.cssSelector("[for='gender_option_female']")).click();

        driver.findElement(By.xpath("//*[contains(text(),'No quiero recibir mensajes de marketing de Spotify')]")).click();

    }

    @Test
    public void spotifyByPlaceHolder() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/uy/signup");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@placeholder='Pon tu correo electrónico.']")).sendKeys("testing@test.com");







    }

}
