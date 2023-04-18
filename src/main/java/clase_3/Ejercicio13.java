package clase_3;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese un numero negativo");
        int num = input.nextInt();
        System.out.println("Su valor absoluto es " + valorAbsoluto(num));


    }
    public static int valorAbsoluto (int num){
        return num * -1;
    }
}
