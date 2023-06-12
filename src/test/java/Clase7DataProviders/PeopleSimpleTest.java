package Clase7DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PeopleSimpleTest {
    @Test(dataProvider = "personas", dataProviderClass = testngSalesforce.class)
    public void datosDePersonas(String unNombre, int unaEdad){
        System.out.println("la edad de " +unNombre+ " es " + unaEdad);

    }


}
