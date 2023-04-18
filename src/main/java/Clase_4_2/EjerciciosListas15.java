package Clase_4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjerciciosListas15 {
    public static void main(String[] args) {

        List<Integer> numerosIngresos = new ArrayList<>();

        leerValores(numerosIngresos);

        System.out.println("La lista contiene los numeros: " +numerosIngresos);





    }
    public static Integer leerValores(List<Integer> numerosIngresos){
        Scanner input = new Scanner(System.in);
        int num=0;
        while(num!=-99){
            System.out.println("Ingrese un numero");
            num = input.nextInt();

            if(num!=-99){
                numerosIngresos.add(num);

            }

        }
        return num;
        }


}
