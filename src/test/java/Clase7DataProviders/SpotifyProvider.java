package Clase7DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SpotifyProvider {

    WebDriver driver;

    @BeforeMethod
    public void driverSetup() {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/uy/signup");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#onetrust-close-btn-container")).click();

    }

    @Test(dataProvider = "spotify", dataProviderClass = DataProvider1.class)
    public void completeFormParciallyTest(String unEmail, String unaConfirmacion, String unPass, String unRename, String unGenero) {
        driver.findElement(By.id("email")).sendKeys(unEmail);
        driver.findElement(By.id("confirm")).sendKeys(unaConfirmacion);
        driver.findElement(By.id("password")).sendKeys(unPass);
        driver.findElement(By.id("displayname")).sendKeys(unRename);

        WebElement radioButton=null;

        if(unGenero.equals("Hombre")){
            radioButton=driver.findElement(By.xpath("//*[contains(text(), 'Hombre')]"));
            radioButton.click();

        } else if (unGenero.equals("Mujer")) {
            radioButton=driver.findElement(By.xpath("//*[contains(text(), 'Mujer')]"));
            radioButton.click();
        }



        }

    @Test(dataProvider = "spotifyError", dataProviderClass = DataProvider1.class)
    public void errorSpotify(String unEmail, String unaConfirmacion, String unPass, String unEscenario){
        driver.findElement(By.id("email")).sendKeys(unEmail);
        driver.findElement(By.id("confirm")).sendKeys(unaConfirmacion);
        driver.findElement(By.id("password")).sendKeys(unPass);

        List<WebElement> listaDeErrores=driver.findElements(By.xpath("//*[@aria-label='Indicador de error']"));
        Assert.assertEquals(listaDeErrores.size(), 1, "Error: Se esparaba un mensaje de error");

        WebElement elementoError=listaDeErrores.get(0);

        if(unEscenario.equals("INVALID_EMAIL")){
            Assert.assertEquals(elementoError.getText(), "Este correo electrónico no es válido. Asegúrate de que tenga un formato como este: ejemplo@email.com", "Error: Se esperaba otro mensaje");
            
        } else if (unEscenario.equals("DIFERENT_EMAIL")) {
            Assert.assertEquals(elementoError.getText(), "Las direcciones de correo electrónico no coinciden.", "Error: Se esperaba otro mensaje");
            
        }

    }


}

