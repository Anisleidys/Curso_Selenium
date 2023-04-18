package Clase1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium {
    @Test
    public void primerTest() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        System.out.println("El titulo es : " + driver.getTitle());
        if (driver.getTitle().equals("Sign up - Spotify")) {
            System.out.println("El titulo es correcto");
        } else {
            System.out.println("Error!!");
        }

        System.out.println("La URL es : " + driver.getCurrentUrl());

        driver.findElement(By.name("q")).sendKeys("que es selenium??");

    }

    @Test
    public void segundoTest() throws InterruptedException {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.netflix.com/uy/");

        List<WebElement> listah1 = driver.findElements(By.tagName("h1"));
        for (WebElement h1 : listah1) {
            System.out.println(" h1---> " + h1.getText());

        }


        List<WebElement> listah2 = driver.findElements(By.tagName("h2"));
        for (WebElement h2 : listah2) {
            System.out.println("h2---> " + h2.getText());

        }


        List<WebElement> listah3 = driver.findElements(By.tagName("h3"));

        int contadorh3vcaias=0;
        for (WebElement h3 : listah3) {
            if(h3.getText().isBlank()==false){
            System.out.println("h3---> " + h3.getText());
            }else{
                contadorh3vcaias++;
            }

        }
        System.out.println("La cantidad de h3 sin textos son " +contadorh3vcaias);

        List<WebElement> listalinks = driver.findElements(By .tagName("a"));
        boolean seEncontroLinkEmpleo=false;
        for(WebElement links: listalinks) {
            if (links.getText().equals("Empleo") == true) {
                seEncontroLinkEmpleo=true;
                System.out.println("El links empleo se encunetra presente ");
            }

        }

        if(seEncontroLinkEmpleo==true){
            System.out.println("El link esta presente!!");
        }else{
            System.out.println("El link no esta");
        }

        Thread.sleep(5000);
        driver.close();

    }

    @Test
    public void tercerTest() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/mundo");

        List<WebElement> listash1 = driver.findElements(By.tagName("h1"));
        for (WebElement h1 : listash1) {
            System.out.println("----> " + h1.getText());
        }

        List<WebElement> listash2 = driver.findElements(By.tagName("h2"));
        for (WebElement h2 : listash2) {
            System.out.println("----> " + h2.getText());
        }


    }

    @Test
    public void bbcMundo() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/mundo");

        //Mostrar el texto de todos los links

        List<WebElement> todosLosTextos = driver.findElements(By.tagName("a"));

        for (WebElement a : todosLosTextos) {
            System.out.println("----> " + a.getText());
        }
    }

    @Test
    public void spotifyTitleTest() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com");

        String title = driver.getTitle();

        if (title.equals("Escuchar es todo - Spotify")) {
            System.out.println("El test paso!!");

        } else {
            System.out.println("Es test fallo!!");
            System.out.println(title);
        }
    }

    @Test
    public void getWindowsSizetest() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://google.com");

        int altoDeLaPagina = driver.manage().window().getSize().getHeight();
        int anchoDelaPagina = driver.manage().window().getSize().getWidth();

        System.out.println("El alto de la pagina es " + altoDeLaPagina);
        System.out.println("El ancho de la pagina es " + anchoDelaPagina);

        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
        System.out.println("Actualizando datos");

        altoDeLaPagina = driver.manage().window().getSize().getHeight();
        anchoDelaPagina = driver.manage().window().getSize().getWidth();

        System.out.println("El alto es: " + altoDeLaPagina + " el ancho es: " + anchoDelaPagina);


    }

    @Test
    public WebDriver getGoogleDriver() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://google.com");
        return driver;
    }

    @Test
    public WebDriver getDriver(String URL) {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get(URL);
        return driver;

    }


    @Test
    public void serachInGoogle() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("WebElement" + Keys.ENTER);
    }

    @Test
    public void serachInGoogleAndGoBack() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("WebElement" + Keys.ENTER);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();


    }

    @Test
    public void facebookPageTest() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        System.out.println(driver.getTitle());
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("pass")).sendKeys("holamundo" + Keys.ENTER);



    }
@Test
    public void Miprueba() {
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.netflix.com");

        List<WebElement> listah1 = driver.findElements(By.tagName("h1"));
        System.out.println("Es h1");

        for (WebElement h1 : listah1) {
            System.out.println("---> " + h1.getText());

        }


        List<WebElement> listah2 = driver.findElements(By.tagName("h2"));
        System.out.println("Es h2");

        for (WebElement h2 : listah2) {
            System.out.println("---> " + h2.getText());

        }
        driver.navigate().refresh();
    List<WebElement> todosLosTextosBotones = driver.findElements(By.tagName("a"));
    for(WebElement a : todosLosTextosBotones){
        System.out.println(a.getText());
    }




    }
}

