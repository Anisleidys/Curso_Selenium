package clase_2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        for(int i=1; i<=num; i++){
            System.out.println("Ciclo " + i);
        }
    }
}
