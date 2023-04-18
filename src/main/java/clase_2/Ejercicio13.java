package clase_2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();
         int i=num1;
         int contador = 1;

         while(i!=0){
             System.out.println("Ingrese un numero");
             i= input.nextInt();
             num1 = num1+i;
             contador++;
             int promedio = num1/contador;
             /*Para saber la cantidad de numeros ingresados
             System.out.println("Los numeros ingresados son " +contador);*/
             System.out.println("El promedio es igual " + promedio);

         }
    }
}
