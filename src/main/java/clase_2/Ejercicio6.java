package clase_2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese num1");
        int num1 = input.nextInt();
        System.out.println("Ingrese num2");
        int num2 = input.nextInt();
        System.out.println("Ingrese num3");
        int num3 = input.nextInt();

        if(num1==num2 || num1==num3 || num2 == num3){
            System.out.println("Hay numeros repetidos");
        }
    }
}
