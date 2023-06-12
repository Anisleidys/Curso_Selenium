package Clase8PatronPageObject;

import org.openqa.selenium.WebDriver;

public class Pagina2 {

        public WebDriver driver;

        public Pagina2(WebDriver remoteDriver) {
            this.driver = remoteDriver;
        }


    public void bienvenida() {
        System.out.println("Hola soy la pagina 2");
    }

    public void imprimirTitulo() {
        System.out.println("Soy el titulo 2");
    }

    public Pagina3 irPagina3(){
        System.out.println("Ir a la pagina 3");
        Pagina3 nextPage = new Pagina3(driver);
        return nextPage;

    }
}
