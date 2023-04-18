package Clase_4_2;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas13 {
    public static void main(String[] args) {
        List<Integer> listaDeEnteros = new ArrayList<>();
        listaDeEnteros.add(37);
        listaDeEnteros.add(67);
        listaDeEnteros.add(84);
        listaDeEnteros.add(91);
        listaDeEnteros.add(49);

        mayorNumero(listaDeEnteros);

        System.out.println(mayorNumero(listaDeEnteros));

    }

    public static Integer mayorNumero(List<Integer> listaDeEnteros){
        int mayor=Integer.MIN_VALUE;
        for(int i =0; i< listaDeEnteros.size(); i++){
            if(listaDeEnteros.get(i)>mayor){
                mayor = listaDeEnteros.get(i);
            }

        }
        return mayor;

    }
}
