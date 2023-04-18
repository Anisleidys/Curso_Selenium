package Clase_4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejemplolista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Juan");
        listaNombres.add("Maria");
        listaNombres.add("Ana");
       System.out.println("Agregando elementos a la lista");

       /* for (int i = 0; i<listaNombres.size(); i++){
            System.out.println(listaNombres.get(i));
        }*/

        // otra forma de imprimir los elementos de una lista
        for(String nombre: listaNombres){
            System.out.println(nombre);
        }

        if(listaNombres.isEmpty() ==true){
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("Tiene elementos");
        }


    }
}
