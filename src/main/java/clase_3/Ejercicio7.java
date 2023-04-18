package clase_3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        System.out.println("la sumatoria desde 1 hasta el ingresado es " +sumatoria(num));

    }
    public static int sumatoria (int num){
        int sumatoria1 = 0;

        for(int i=1; i<=num; i++){
            sumatoria1 = sumatoria1 + i;
        }
        return sumatoria1;
    }
}
