package Clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FacebookTest {

    @Test
    public void checkBoxTest() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(5000);

        List<WebElement> listaGenero = driver.findElements(By.name("sex"));
        System.out.println("Elementos de la lista: " +listaGenero.size());
        WebElement generoMasculino= listaGenero.get(1);
        generoMasculino.click();







    }

}
