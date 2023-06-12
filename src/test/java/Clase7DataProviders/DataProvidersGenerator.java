package Clase7DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersGenerator {

    @DataProvider (name="datos personales")
    public Object [] [] datosDeLasPersonas(){
        return new Object[][]{
                {"Juan", 24, "Fisica"},
                {"Ana", 29, "Programacion"},
                {"Maria", 33, "Quimica"}
        };

    }
    @Test(dataProvider = "datos personales")
    public void personas(String unNombre, int unaEdad, String unaCarrera){
        System.out.println("La edad de " +unNombre + "es " +unaEdad + "estudia en la carrera de " + unaCarrera);
    }

    @Test(dataProvider = "paises", dataProviderClass = DataProvider1.class)
    public void mostrarPaises(String unaCapital, String unPais){
        System.out.println("La capital de " +unPais+ " es " +unaCapital);
    }

}
