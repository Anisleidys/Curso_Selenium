package clase_3;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();
        System.out.println("Ingrese un numero");
        int num2 = input.nextInt();
        System.out.println("Ingrese un numero");
        int num3 = input.nextInt();

        String tipoDeTriangulo = triangulos(num1, num2, num3);
        System.out.println("El triangulo es " + tipoDeTriangulo);

    }

    public static String triangulos(int num1, int num2, int num3) {
       if (num1 == num2 & num1 == num3 & num2==num3){
           return "Equilatero";
       }
       if (num1 != num2 & num1 != num3 & num2!=num3){
           return "Escaleno";
       }
       return "Isoseles";

    }
}
