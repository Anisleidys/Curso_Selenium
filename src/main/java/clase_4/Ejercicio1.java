package clase_4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       /* int [ ] horas = new int [10];
        horas [2] = 4;
        horas [3] = 7;
        System.out.println(horas.length);
        System.out.println(horas[3]);*/


        //Calcular la media de una serie de numeros que se leen por teclado
        Scanner input= new Scanner(System.in);
        int [ ] horas = new int [10];

        for(int i =0; i<horas.length; i++){
            System.out.println("Ingrese un numero");
            int numero= input.nextInt();
            horas[i] = numero;
        }
        for(int i=0; i< horas.length; i++){
            System.out.println(horas[i]);
        }



    }
}
