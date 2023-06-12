package Programacion.Operadores;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
        //Podría ser utilizando operador ternario.



        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2");
        int numero2 = scanner.nextInt();

       String max = (numero1 > numero2) ? numero1 + " y " + numero2 : numero2 + " y " + numero1;

        System.out.println("Orden es = " + max);






    }
}
