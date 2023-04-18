package clase_2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1 " );
        int numero1 = input.nextInt();
        System.out.println("Enter number2  " );
        int numero2 = input.nextInt();
        System.out.println("Enter number3  " );
        int numero3 = input.nextInt();

        int suma =numero1 + numero2 + numero3;

        System.out.println("El resultado es " + suma);
    }
}
