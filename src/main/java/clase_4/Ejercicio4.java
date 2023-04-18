package clase_4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Crear un arreglo de enteros de 7 posiciones y cargar las ventas diarias que vendió el
        //usuario. Solicitar los valores al usuario.

        Scanner input = new Scanner(System.in);
        int[] ventasDiarias = new int[7];

        for(int i =0; i<ventasDiarias.length; i++){
            System.out.println("Ingrese el valor de la venta");
            int monto= input.nextInt();
        }
    }
}
