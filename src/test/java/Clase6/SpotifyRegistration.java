package Clase6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SpotifyRegistration {

    WebDriver driver;

    @BeforeMethod
    public void driverSetup(){
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/uy/signup");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#onetrust-close-btn-container")).click();

    }
    @Test
    public void allEmptyFieldsTest() throws InterruptedException {

        //Thread.sleep(3000);


        driver.findElement(By.xpath("//button[@type='submit']")).click();

        boolean encontroErrorContrasenia=false;
        boolean encontroConfirmacionEmail= false;

        List<WebElement> listaDeErrores = driver.findElements(By.xpath("//*[@aria-label='Indicador de error']"));

        for(WebElement elementoError: listaDeErrores){
            System.out.println(elementoError.getText());


            if(elementoError.getText().equals("Es necesario que indiques una contraseña.")){
                encontroErrorContrasenia=true;

            }

            if(elementoError.getText().equals("Es necesario que confirmes tu correo electrónico.")){
                encontroConfirmacionEmail=true;

            }
        }
        Assert.assertTrue(encontroErrorContrasenia, "Error: no se encontro el mensaje de error de contrasenia");
        Assert.assertTrue(encontroErrorContrasenia, "Error: no se encontro el mensaje de confirmacion");

        Assert.assertEquals(listaDeErrores.size(), 8, "Se esperaban 8 mensajes de errores");


    }

    @Test
    public void alrreadyRegisterTest() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("password")).sendKeys("holamundo");

       // Thread.sleep(3000);
        List<WebElement> listaDeErrores=driver.findElements(By.xpath("//*[@aria-label='Indicador de error']"));
        Assert.assertEquals(listaDeErrores.size(), 1, "Error: Se esparaba un mensaje de error");

        WebElement elementoError=listaDeErrores.get(0);
        Assert.assertEquals(elementoError.getText(), "Este correo electrónico ya está conectado a una cuenta. Inicia sesión.", "Error: Se esperaba otro mensaje");

    }

    @Test
    public void invalidEmail(){
        driver.findElement(By.id("email")).sendKeys("dkasjdafj");
        driver.findElement(By.id("password")).sendKeys("holamundo");
        List<WebElement> listaDeErrores=driver.findElements(By.xpath("//*[@aria-label='Indicador de error']"));
        Assert.assertEquals(listaDeErrores.size(), 1, "Error: Se esparaba un mensaje de error");

        WebElement elementoError=listaDeErrores.get(0);
        Assert.assertEquals(elementoError.getText(), "Este correo electrónico no es válido. Asegúrate de que tenga un formato como este: ejemplo@email.com", "Error: Se esperaba otro mensaje");
    }

    @Test
    public void invalidConfirmationEmail(){
        driver.findElement(By.id("email")).sendKeys("any88pereira@gmail.com");
        driver.findElement(By.id("confirm")).sendKeys("pepehyhf@gmail.com");
        driver.findElement(By.id("password")).sendKeys("holamundo");


        List<WebElement> listaDeErrores=driver.findElements(By.xpath("//*[@aria-label='Indicador de error']"));
        Assert.assertEquals(listaDeErrores.size(), 1, "Error: Se esparaba un mensaje de error");

        WebElement elementoError=listaDeErrores.get(0);
        Assert.assertEquals(elementoError.getText(), "Las direcciones de correo electrónico no coinciden.", "Error: Se esperaba otro mensaje");
    }

    @Test
    public void completeFormParciallyTest(){
        driver.findElement(By.id("email")).sendKeys("any88pereira@gmail.com");
        driver.findElement(By.id("confirm")).sendKeys("any88pereira@gmail.com");
        driver.findElement(By.id("password")).sendKeys("holamundo");
        driver.findElement(By.id("displayname")).sendKeys("selenium");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        List<WebElement> listaDeErrores=driver.findElements(By.xpath("//*[@aria-label='Indicador de error']"));
        Assert.assertEquals(listaDeErrores.size(), 4, "Error: Se esparaba 4 mensaje de error");

        boolean errorMes= false;
        boolean errorDia= false;
        boolean errorAnio= false;


        for(WebElement elementoError: listaDeErrores){
            System.out.println(elementoError.getText());


            if(elementoError.getText().equals("Selecciona tu mes de nacimiento.")){
                errorMes=true;

            }

            if(elementoError.getText().equals("Indica un día válido del mes.")){
                errorDia=true;

            }

            if (elementoError.getText().equals("Indica un año válido.")){
                errorAnio=true;
            }
        }

        Assert.assertTrue(errorDia, "Error: no se encontro el mensaje de error de dia");
        Assert.assertTrue(errorMes, "Error: no se encontro el mensaje de error de mes");
        Assert.assertTrue(errorAnio, "Error: no se encontro el mensaje de error de anio");

    }

    @AfterMethod
    public void closedBrowser(){
        driver.close();
    }




}
