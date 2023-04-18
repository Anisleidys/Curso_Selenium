package clase_3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        boolean resultado = maximoMinimoDeUnNumero(num);
        if(resultado == true){
            System.out.println("El numero esta dentro del rango permitido");
        }else {
            System.out.println("El numero esta fuera de rango");
        }


    }
    public static boolean maximoMinimoDeUnNumero(int num){
        if (num<=10 & num>=5){
            return true;
        } else {
            return false;
        }

    }
}
