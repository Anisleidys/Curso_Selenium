package clase_3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();
        System.out.println("Ingrese un numero");
        double num2 = input.nextDouble();
        double multiplicacion= multiplicar(num1, num2);
        System.out.println("El resultado es "+ multiplicacion);

    }

    public static double multiplicar(int num1, double num2){
        return num1 * num2;
    }
}
