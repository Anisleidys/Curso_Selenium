package clase_2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = input.nextInt();

        if (numero > 0){
            System.out.println("El numero es mayor a 0");
        }
        if (numero<0){
            System.out.println("El numero es menor a 0");
        }
    }
}
