package Clase_4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejemplolista1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Juan");
        listaNombres.add("Maria");
        listaNombres.add("Ana");
        //System.out.println("Agregando elementos a la lista");


       //Agregar nombres a lista
       for(int i = 0; i < 2; i++) {
           System.out.println("Ingrese un nombre");
           String unNombre = input.next();
           listaNombres.add(unNombre);
       }
       //Mostrar los nombres de la lista
        for (int i = 0; i<listaNombres.size(); i++){
            System.out.println("***" +listaNombres.get(i));
        }


        //Buscar elemento de una lista y mostrar la posicion
        System.out.println("Ingrese el nombre a buscar");
        String nombreABuscar= input.next();

        int posicion = listaNombres.indexOf(nombreABuscar);

        if (posicion == -1){
            System.out.println("El elemento no esta");
        }else{
            System.out.println("El elemento esta en la posicion " +posicion);
        }


        //Eliminar elemento
        System.out.println("Quieres eliminar el elemento S/N ");
        String opcion = input.next();

        if (opcion.equals("S")){
            System.out.println("Eliminando elemento");
            listaNombres.remove(posicion);
        }else {
            System.out.println("El elemento no se ha eliminado");
        }

        //Mostrar la lista Final luego de eliminado la posicion y el elemento
        for(String nombre: listaNombres){
            System.out.println(nombre);
        }




        /*if(listaNombres.isEmpty() ==true){
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("Tiene elementos");
        }*/


    }
}

