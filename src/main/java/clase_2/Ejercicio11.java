package clase_2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();
        int i =num1;

        while(i != 0){
            System.out.println("El numero no contiene 0, ingrese un numero");
            i = input.nextInt();
        }
    }
}
