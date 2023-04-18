package Clase_4_2;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas11 {
    public static void main(String[] args) {
        List<Integer> listaDeEnteros = new ArrayList<>();
        listaDeEnteros.add(37);
        listaDeEnteros.add(67);
        listaDeEnteros.add(84);
        listaDeEnteros.add(91);
        listaDeEnteros.add(49);

        System.out.println("El promedio total es "+sumaDeEnteros(listaDeEnteros));

    }
    public static Integer sumaDeEnteros(List<Integer> listaDeEnteros ){
        int sumaTotal=0;
        int promedio= 0;
        for(int i =0; i<listaDeEnteros.size(); i++){
            sumaTotal = sumaTotal+ listaDeEnteros.get(i);
        }
        promedio = sumaTotal/listaDeEnteros.size();
        return promedio;
    }
}
