package clase_3;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        System.out.println("El factorial del numero es " +factorial(num));

    }

    public static int factorial (int num) {
        int multimplica = 1;
        ;
        for (int i = num; i >= 1; i--){
            multimplica = multimplica * i;
        }
        return multimplica;

        }
}
