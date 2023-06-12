package Clase4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FacebookTest {

    @Test
    public void checkboxFacebook() throws InterruptedException {
        System.setProperty("webdriver,firefox.driver", "drivers/firefoxdriver");


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


        driver.findElement(By.xpath("//*[@ajaxify='/reg/spotlight/']")).click();

        Thread.sleep(3000);

        List<WebElement> botones=driver.findElements(By.xpath("//*[@name='sex']"));
        botones.get(1).click();
        for(int i =0; i<botones.size(); i++){
            if(botones.get(i).isSelected()){
            System.out.println("Selecccionado" +botones.get(i).getAttribute("value"));
        } else{
                System.out.println("No selecionado");
            }
        }




    }
}
