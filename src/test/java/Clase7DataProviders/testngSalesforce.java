package Clase7DataProviders;

import org.testng.annotations.DataProvider;

public class testngSalesforce {
    @DataProvider(name="personas")
    public Object[] [] crearPersonas(){
        return new Object[][] {
                {"Jose", 25},
                {"Maria", 32}
        };

    }
}
