package Clase4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class xpathTest {
    @Test
    public void facebookByIdPath() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testing@test.com");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("holamundo");
        driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();

        Thread.sleep(3000);

       driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Any");
       driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Pereira");
       driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("any88pereira@gmail.com");
       driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("any88pereira@gmail.com");
       driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("Anyyoa.12");

       //Forma 1
       driver.findElement(By.xpath("//input[@name='sex'][@value='1']")).click();

       Thread.sleep(3000);

        //forma 2
       driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

       //forma 4
        driver.findElement(By.xpath("//*[contains(text(),'Personalizado')]")).click();


        WebElement elementoDias= driver.findElement(By.xpath("//*[@name='birthday_day']"));
        Select comboDias = new Select(elementoDias);
        comboDias.selectByValue("26");

        WebElement elementoMeses= driver.findElement(By.xpath("//*[@name='birthday_month']"));
        Select comboMeses = new Select(elementoMeses);
        comboMeses.selectByVisibleText("nov");

        WebElement elementoAnio= driver.findElement(By.xpath("//*[@name='birthday_year']"));
        Select comboAnio = new Select(elementoAnio);
        comboAnio.selectByIndex(15);





        //driver.findElement(By.linkText("Crear cuenta nueva")).click();
        //Thread.sleep(5000);




    }




}
