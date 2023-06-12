package Clase5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class FacebookTesting {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){

        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

    }
    @Test

    public void checkBoxAndComboboxTest() throws InterruptedException {

        driver.findElement(By.xpath("//*[@ajaxify='/reg/spotlight/']")).click();
        Thread.sleep(5000);

        driver.findElement(By.name("firstname")).sendKeys("Alan");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("tetsing@test.com");
        driver.findElement(By.id("password_step_input")).sendKeys("holamundo");


        WebElement elementoDias = driver.findElement(By.id("day"));
        Select comboDias = new Select(elementoDias);
        comboDias.selectByValue("20");

        WebElement elementoMeses = driver.findElement(By.id("month"));
        Select comboMeses = new Select(elementoMeses);
        comboMeses.selectByVisibleText("Aug");

        WebElement elementoAnio = driver.findElement(By.id("year"));
        Select comboAnio = new Select(elementoAnio);
        comboAnio.selectByIndex(15);



    }

    @Test

    public void birthdateTest() throws SQLException, InterruptedException {

        driver.findElement(By.xpath("//*[@ajaxify='/reg/spotlight/']")).click();
        Thread.sleep(5000);

        WebElement dias = driver.findElement(By.name("birthday_day"));
        Select comboDia = new Select(dias);
        comboDia.selectByVisibleText("20");

        WebElement mes = driver.findElement(By.name("birthday_month"));
        Select comboMes = new Select(mes);
        comboMes.selectByVisibleText("Dec");

        WebElement anio = driver.findElement(By.name("birthday_year"));
        Select comboAnio = new Select(anio);
        comboAnio.selectByIndex(33);



    }
    @AfterMethod
    public void close(){
        driver.close();
    }
}
