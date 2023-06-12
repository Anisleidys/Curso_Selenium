package Clase8PatronPageObject;

import org.openqa.selenium.WebDriver;

public class Pagina3 {

        public WebDriver driver;

        public Pagina3(WebDriver remoteDriver) {
            this.driver = remoteDriver;
        }

    public void bienvenida() {
        System.out.println("Hola soy la pagina 3");
    }

    public void imprimirTitulo() {
        System.out.println("Soy el titulo 3");
    }

}

