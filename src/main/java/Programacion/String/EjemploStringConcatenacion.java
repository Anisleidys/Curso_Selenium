package Programacion.String;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        //EJEMPLO 1 DE CONCATENACION//
        String curso = "Programacion Java"; 
        String profesor = "Andres Guzmas";
        
        String detalle = curso + " con el instructor "+ profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);//Se concatena como cadena, no realiza suma
        System.out.println(detalle + (numeroA + numeroB));//Suma y devuelve la cadena
        System.out.println(numeroA + numeroB + detalle);//Suma y devuelve la cadena

        //EJEMPLO 2 DE CONCATENACION//
        
        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);

        String detalle3 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle3 = " + detalle3);

    }
}
