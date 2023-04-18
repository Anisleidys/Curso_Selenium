package clase_2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = input. next();
        System.out.println("Ingrese su ano de nacimiento");
        int ano = input. nextInt();

        int edad = 2023 - ano;
        System.out.println("Su nombre es " +nombre+ "y tiene " +edad);
    }
}
