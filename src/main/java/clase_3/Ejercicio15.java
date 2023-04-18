package clase_3;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = input.nextInt();
        if (esMayorDeEdad(edad)== true) {
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }

    }

    public static boolean esMayorDeEdad(int edad) {
        if (edad >=18){
            return true;
        } else{
            return false;
        }

    }
}
