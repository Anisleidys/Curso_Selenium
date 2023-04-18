package clase_2;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        int suma = 0;
        int contador = 0;

        while(num>0){
            suma = suma + num;
            contador ++;
            System.out.println("Ingrese otro numero");
            num= input.nextInt();
            System.out.println(suma);
        }
        double promedio =0;
        if (promedio != 0){
            promedio = suma/promedio;
            System.out.println("El promedio es " +promedio);
        } else {
            System.out.println("El promedio es 0");
        }
    }
}
