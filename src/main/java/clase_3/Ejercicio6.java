package clase_3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();
        System.out.println("Ingrese un numero");
        int num2 = input.nextInt();
        if (mayorNumero(num1,num2)== true){
            System.out.println("El pirmer numero ingresado es mayor");
        } else{
            System.out.println("El segundo numero ingresado es mayor");
        }

    }
    public static boolean mayorNumero (int num1, int num2){
       /* if (num1 > num2){
            return true;
        }else {
            return false;
        }*/
        return num1 > num2;
    }
}
