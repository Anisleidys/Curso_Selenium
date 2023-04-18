package clase_2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese num1");
        int num1 = input.nextInt();
        System.out.println("Ingrese num2");
        int num2 = input.nextInt();
        System.out.println("Ingrese num3");
        int num3 = input.nextInt();
        System.out.println("Ingrese num4");
        int num4 = input.nextInt();

        int suma = num1 + num2 + num3 + num4;

        if (suma < 0){
            suma = suma * -1;
            System.out.println("El absoluto es  " +suma);
        } else {
            System.out.println("El numero es mayor a 0 y el ressultado es " +suma);
        }

    }
}
