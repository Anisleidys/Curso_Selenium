package Clase8PatronPageObject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class EjemploPom {

    public WebDriver driver;

    @Test
    public void testing(){
        Pagina1 page1 = new Pagina1(driver);
        page1.bienvenida();
        page1.imprimirTitulo();
        page1.irPagina2();
        Pagina2 page2= page1.irPagina2();

        //System.out.println("Hola soy la pagina 1");
        //System.out.println("Soy el titulo 1");
        //System.out.println("Ir a la pagina 2");



        page2.bienvenida();
        page2.imprimirTitulo();
        Pagina3 page3 = page2.irPagina3();

        //System.out.println("Hola soy la pagina 2");
        //System.out.println("Soy el titulo 2");
       // System.out.println("Ir a la pagina 3");

        page3.bienvenida();
        page3.imprimirTitulo();

       // System.out.println("Hola soy la pagina 3");
       // System.out.println("Soy el titulo 3");



    }
}
