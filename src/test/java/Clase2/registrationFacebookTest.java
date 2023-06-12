package Clase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class registrationFacebookTest {

    @Test
    public void facebookTesting() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(5000);

        driver.findElement(By.name("firstname")).sendKeys("Jhon");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");


        WebElement elementoDias= driver.findElement(By.id("day"));
        Select comboDias = new Select(elementoDias);
        comboDias.selectByValue("26");

        WebElement elementoMeses= driver.findElement(By.id("month"));
        Select comboMeses = new Select(elementoMeses);
        comboMeses.selectByVisibleText("jun");

        WebElement elementoAnio= driver.findElement(By.id("year"));
        Select comboAnio = new Select(elementoAnio);
        comboAnio.selectByIndex(15);

        Thread.sleep(5000);

        //Seleccionar un genero.Forma 1

       // driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();


        //Seleccionar un genero.Forma 2

        List<WebElement> listaGenero = driver.findElements(By.name("sex"));
        System.out.println("Elementos de la lista: " +listaGenero.size());

        WebElement generoMasculino= listaGenero.get(1);
        generoMasculino.click();

        //Seleccionar un genero.Forma 3
        driver.findElement(By.cssSelector("[name='sex'][value='1']")).click();



    }
}

