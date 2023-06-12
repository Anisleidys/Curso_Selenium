package Clase4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;



public class MercadoLiberYoa {

    private Integer value;

    @Test
    public void spotifyByPlaceHolder() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mercadolibre.com.uy/");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[contains(text(),'Entendido')]")).click();

        driver.findElement(By.name("as_word")).sendKeys("Autos Chevrolet", Keys.ENTER);

        /*(By.cssSelector(".price-tag-fraction"));


        }*/

        Thread.sleep(3000);


        List<WebElement> precios = driver.findElements(By.cssSelector(".price-tag-fraction"));

        System.out.println("La cantidad de autos encontrados es : " +precios.size());

        List<Integer> preciosList = new ArrayList<>();

        for (WebElement a : precios) {
            if (!a.getText().isEmpty())
            {
                // Eliminar el punto del String
                String numSinPunto = a.getText().replace(".","");

                // Eliminar espacio al inicio y al final de un String
                String numSinCaracterFinal = numSinPunto.trim();

                // Convertir un Strin a un Integer
                Integer num = Integer.parseInt(numSinCaracterFinal);

                // Agregar a la lista
                preciosList.add(num);
                System.out.println(num);
            }
        }

        Integer menor = preciosList.get(0);
        for (int i = 0 ; i < preciosList.size(); i++) {
            if (menor > preciosList.get(i))
                menor = preciosList.get(i);
        }

        System.out.println("El de menor precio es " + menor);
        
        }

    }



