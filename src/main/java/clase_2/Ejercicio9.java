package clase_2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese num1");
        int num1 = input.nextInt();
        System.out.println("Ingrese num2");
        int num2 = input.nextInt();

        for( int i = num1; i<=num2;i++){
            System.out.println(i+ "");
        }
    }
}
