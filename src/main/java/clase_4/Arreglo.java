package clase_4;

import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arregloNumeros = new int[5];

        for(int i=0; i < arregloNumeros.length; i++){
            System.out.println("Ingrese un numero");
            int num = input.nextInt();
            arregloNumeros [i] = num;
        }

        for(int i=0; i < arregloNumeros.length; i++){
            //System.out.println(arregloNumeros[i]);
            System.out.println( "Posicion: " +i +  " " + arregloNumeros[i]);
        }



    }
}
