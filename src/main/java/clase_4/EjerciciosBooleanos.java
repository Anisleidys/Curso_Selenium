package clase_4;

import java.util.Scanner;

public class EjerciciosBooleanos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*  System.out.println("Ingrese su edad" );
        int edad = input.nextInt();

        boolean esMayordeEdad = false;
        if (edad >=18){
            esMayordeEdad = true;
        //} else{
           // esMayordeEdad = false;
        }

        if(esMayordeEdad==true){
            System.out.println("usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }*/


        // Ingresar numeros hasta que se ingrese 0
        // buscar si se ingreso el numero 5...

        int num =-1;
        boolean seIngresoeElCinco=false;

        while (num != 0) {
            System.out.println("Ingrese un numero");
            num = input.nextInt();

            if (num == 5) {
                seIngresoeElCinco = true;
            }
        }


            if(seIngresoeElCinco == true){
                System.out.println("Se ingreso el cinco");
            } else {
                System.out.println("No se ingreso el cinco");
            }



    }
}
