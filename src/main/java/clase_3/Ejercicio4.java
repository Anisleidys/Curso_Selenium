package clase_3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();
        System.out.println("Ingrese un numero");
        int num2 = input.nextInt();
        int suma =sumaDosnumeros(num1, num2);
        System.out.println("El resultado de la suma es "+suma);
    }
    public static int sumaDosnumeros(int num1, int num2){
        return num1 +num2;
    }
}
