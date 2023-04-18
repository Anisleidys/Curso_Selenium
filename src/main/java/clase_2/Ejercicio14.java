package clase_2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println( "Ingrese el resultado del examen");
        int num1 = input.nextInt();

        if(num1 >=0 && num1 <=59 ){
            System.out.println("Ha desaprobado el examen");
        }

        if(num1 >=60 && num1 <=79 ) {
            System.out.println("Ha aprobado el examen");
        }

        if(num1 >=80 && num1 <=100 ) {
            System.out.println("Ha aprobado con Excelente");
        }

        if(num1 <=0 && num1 <100 ) {
            System.out.println("Ha ingresado una nota invalida");
        }


    }
}
