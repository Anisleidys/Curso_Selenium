package clase_1;

import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        //Teclado
        Scanner input = new Scanner( System.in);
        System.out.println("Ingrese un numero");
        int numero = input.nextInt();
        int doble= numero *2;
        System.out.println("El doble del numero ingresado es igual " + doble);

    }
}
