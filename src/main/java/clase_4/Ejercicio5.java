package clase_4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] ventasDiarias = new int[7];

        for(int i =0; i<ventasDiarias.length; i++){
            System.out.println("Ingrese el valor de la venta");
            int monto= input.nextInt();
            ventasDiarias[i] = monto;
        }


       int suma = 0;
        for(int i = 0; i < ventasDiarias.length; i++){
            suma = suma + ventasDiarias [i];
        }
        System.out.println("La suma total de las ventas diarias fueron " +suma);
    }
}
