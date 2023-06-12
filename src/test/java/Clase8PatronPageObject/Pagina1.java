package Clase8PatronPageObject;

import org.openqa.selenium.WebDriver;

public class Pagina1 {

    public WebDriver driver;

    public Pagina1(WebDriver remoteDriver){
        this.driver=remoteDriver;
    }

    public void bienvenida(){
        System.out.println("Hola soy la pagina 1");
    }

    public void imprimirTitulo(){
        System.out.println("Soy el titulo 1");
    }

    public Pagina2 irPagina2(){
        System.out.println("Ir a la pagina 2");
        Pagina2 nextPage = new Pagina2(driver);
        return nextPage;

    }

}

