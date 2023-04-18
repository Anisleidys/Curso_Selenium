package clase_3;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = input.nextInt();
        System.out.println("Ingrese un numero");
        int b = input.nextInt();

        if (mayorAlSegundo(a,b)==true){
            System.out.println("El numero a es mayor al numero b");
        } else {
            System.out.println("La condicion es falsa");
        }

    }

    public static boolean mayorAlSegundo (int a, int b){
        if(a>b){
            return true;
        } else{
            return false;
        }
    }
}
