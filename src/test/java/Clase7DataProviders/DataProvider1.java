package Clase7DataProviders;

import org.testng.annotations.DataProvider;

public class DataProvider1 {

    @DataProvider(name = "paises")
    public Object[][] capitalesDePaises() {
        return new Object[][]{
                {"Madrid", "Espania"},
                {"Santiago", "Chile"},
                {"Montevideo", "Uruguay"}
                };

    }

    @DataProvider(name= "spotify")
    public Object [] [] spotifyElementos(){
        return new Object[][]{
                {"anypereira65@gmail.com", "anypereira65@gmail.com", "pejhkjhjhteb", "ququito", "Mujer"},
                {"anyperefshsf58@gmail.com", "anyperefshsf58@gmail.com", "fhkjhkjafjh","pepitos", "Hombre"},

        };
    }


    @DataProvider(name= "spotifyError")
    public Object [] [] spotifyError(){
        return new Object[][]{
                {"anypereiragmail.com", "anypereiragmail.com", "pejhkjhjhteb", "INVALID_EMAIL" },
                {"anyperefshsf58@gmail.com", "anyperefshsf5@gmail.com", "fhkjhkjafjh", "DIFERENT_EMAIL"}

        };
    }

}
