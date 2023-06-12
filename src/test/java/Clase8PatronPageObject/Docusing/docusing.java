package Clase8PatronPageObject.Docusing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class docusing {
    public WebDriver driver;

   @BeforeMethod
    public void setUp(){
       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.docusign.com");



   }

   @Test
   public void registerToDocusignTest() throws InterruptedException {

       DocusignLandingPage docusignLandingPage = new DocusignLandingPage(driver);

       DocusignRegistrationPage docusignRegistrationPage = docusignLandingPage.goToRegistrationPage();

       docusignRegistrationPage.fillingRegistrationDocusignForm();

   }



    }
