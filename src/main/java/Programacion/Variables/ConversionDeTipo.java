package Programacion.Variables;

public class ConversionDeTipo {

    //De string a primitivo
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String notacionCientificaStr = "98765.43e-3";
        double notacionCientieficaDouble = Double.parseDouble(notacionCientificaStr);
        System.out.println("realDouble = " + notacionCientieficaDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);


        // Tambien se puede utilizar los tipos var
        /*var numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        var realStr = "98765.43";
        var realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        var notacionCientificaStr = "98765.43e-3";
        var notacionCientieficaDouble = Double.parseDouble(notacionCientificaStr);
        System.out.println("realDouble = " + notacionCientieficaDouble);

        var logicoStr = "true";
        var logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);*/

        //Conversion de primitivo entero a string se utiliza el metodo Integer.to String

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

       // Convertir de integer a string usando la clase String

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        /*double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);*/

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        //Conversion de primitivos a primitivos

        int i = 42768
                ;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);





    }
}
