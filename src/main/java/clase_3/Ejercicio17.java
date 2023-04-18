package clase_3;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero maximo permitido");
        int maximo = input.nextInt();
        System.out.println("Ingrese el numero minimo permitido");
        int minimo = input.nextInt();
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        int numeroValido = validarNumero("Numero valido", "Numero fuera de rango", minimo, maximo, num);


    }

    public static int validarNumero (String mensaje, String error, int minimo, int maximo, int num){
        Scanner input = new Scanner(System.in);
        while ((num > maximo) || (num < minimo)){
            System.out.println(error);
            num = input.nextInt();
        }
        System.out.println(mensaje);
        return num;

    }
}
