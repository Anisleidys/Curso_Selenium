package Clase8PatronPageObject.Docusing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocusignLandingPage {
    public WebDriver driver;

    public DocusignLandingPage(WebDriver remoteDriver) {

        driver = remoteDriver;

    }

    public DocusignRegistrationPage goToRegistrationPage(){

        driver.findElement(By.xpath("//*[@href='https://go.docusign.com/o/trial']")).click();

        DocusignRegistrationPage nextPage = new DocusignRegistrationPage(driver);

        return nextPage;

    }

}
