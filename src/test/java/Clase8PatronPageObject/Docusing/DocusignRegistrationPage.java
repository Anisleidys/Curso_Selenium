package Clase8PatronPageObject.Docusing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocusignRegistrationPage {
    public WebDriver driver;


    public DocusignRegistrationPage(WebDriver remoteDriver) {

        driver = remoteDriver;

    }


    public void fillingRegistrationDocusignForm() throws InterruptedException {

        driver.findElement(By.name("email")).sendKeys("testing@test.com");

        driver.findElement(By.name("first_name")).sendKeys("Jhon");

        driver.findElement(By.name("last_name")).sendKeys("Smith");



    }
}
