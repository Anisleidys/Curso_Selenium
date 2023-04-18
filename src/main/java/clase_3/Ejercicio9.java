package clase_3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su salario");
        int num = input.nextInt();
        cambioMoneda(num);


    }

    public static int cambioMoneda(int num) {
       int dolares = num/42 ;
       int euros =  num/50;

        System.out.println("El salario en dolares es " +dolares);
        System.out.println( "El salario en euros es " +euros);
        return dolares;
    }
}
