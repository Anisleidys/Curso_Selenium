package Clase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.List;

import static java.sql.DriverManager.getDriver;
import static java.sql.DriverManager.getDrivers;

public class FacebookTest {
    @Test
    public void facebookTesting() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("testing@test.com");
        driver.findElement(By.name("pass")).sendKeys("holamundo");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(5000);

        driver.findElement(By.name("firstname")).sendKeys("Alan");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("tetsing@test.com");
        driver.findElement(By.id("password_step_input")).sendKeys("holamundo");


        WebElement elementoDias= driver.findElement(By.id("day"));
        Select comboDias = new Select(elementoDias);
        comboDias.selectByValue("20");

        WebElement elementoMeses= driver.findElement(By.id("month"));
        Select comboMeses = new Select(elementoMeses);
        comboMeses.selectByVisibleText("ago");

        WebElement elementoAnio= driver.findElement(By.id("year"));
        Select comboAnio = new Select(elementoAnio);
        comboAnio.selectByIndex(15);


    }
    @Test
    public void forgotAccountTest() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        System.out.println("Titulo es: " + driver.getTitle());
        driver.findElement(By.partialLinkText("Has olvidado la contraseña")).click();


        String actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle, "¿Has olvidado la contraseña? | No puedo entrar | Facebook",
                "Se deberia estar en la seccion olvidaste tu contrasenia");

        Assert. assertNotEquals(driver.getCurrentUrl(), "https:// www.facebook.com",
                "Se deberia estar en otra URL");

        Thread.sleep(5000);
        driver.close();

    }

    @Test
    public void forgotAccountPartialLisnkTest(){
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

       driver.findElement(By.partialLinkText("olvidado")).click();

      Assert.assertEquals(driver.getTitle(), "¿Olvidaste tu contraseña? | No puedo iniciar| sesión | Facebook",
              "Se deberia estar en la seccion olvidaste contrasenia");

    }


    @Test
    public void customSalesforceLink() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");

        driver.findElement(By.linkText("Utilizar dominio personalizado")).click();
        driver.findElement(By.id("mydomain")).sendKeys("as");
        driver.findElement(By.id("mydomainContinue")).click();

        Thread.sleep(5000);

        driver.findElement(By.name("username")).sendKeys("test@test.com");

    }

    @Test
    public void checkBoxAndComboboxTest() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");


        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(5000);

        driver.findElement(By.name("firstname")).sendKeys("Alan");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("tetsing@test.com");
        driver.findElement(By.id("password_step_input")).sendKeys("holamundo");


        WebElement elementoDias= driver.findElement(By.id("day"));
        Select comboDias = new Select(elementoDias);
        comboDias.selectByValue("20");

        WebElement elementoMeses= driver.findElement(By.id("month"));
        Select comboMeses = new Select(elementoMeses);
        comboMeses.selectByVisibleText("ago");

        WebElement elementoAnio= driver.findElement(By.id("year"));
        Select comboAnio = new Select(elementoAnio);
        comboAnio.selectByIndex(15);

    }
    @Test
    public void birthdateTest() throws SQLException, InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(5000);

        WebElement dias = driver.findElement(By.name("birthday_day"));
        Select comboDia = new Select(dias);
        comboDia.selectByVisibleText("20");

        WebElement mes = driver.findElement(By.name("birthday_month"));
        Select comboMes = new Select(mes);
        comboMes.selectByVisibleText("dic");

        WebElement anio = driver.findElement(By.name("birthday_year"));
        Select comboAnio = new Select(anio);
        comboAnio.selectByIndex(33);

    }
    @Test
    public void comboboxTest() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(5000);

        WebElement meses = driver.findElement(By.name("birthday_month"));
        Select combo = new Select(meses);

        List<WebElement> options = combo.getOptions();
        Assert.assertNotEquals(0,options.size());

        boolean encontrar= false;

        for(WebElement opt: options){
            System.out.println(opt.getText());
            if(opt.getText().contentEquals("jun")){
                encontrar=true;
                break;
            }
        }
        Assert.assertTrue(encontrar);


    }

    @Test
    public void completeRegistration() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(5000);

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Ania");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Perez");

        WebElement phone = driver.findElement(By.name("reg_email__"));
        phone.sendKeys("123456");

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("Casita.123456");


        setBirthdate(driver, "22", "jun", "1990");


    }
    @Test
    private void setBirthdate(WebDriver driver , String day, String month, String year){

        WebElement dias = driver.findElement(By.name("birthday_day"));
        Select comboDia= new Select(dias);
        comboDia.selectByVisibleText(day);

        WebElement mes = driver.findElement(By.name("birthday_month"));
        Select comboMes = new Select(mes);
        comboMes.selectByVisibleText(month);

        WebElement anio = driver.findElement(By.name("birthday_year"));
        Select comboAnio= new Select(anio);
        comboAnio.selectByVisibleText(year);


    }


}


