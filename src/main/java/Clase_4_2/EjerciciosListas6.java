package Clase_4_2;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas6 {
    public static void main(String[] args) {

        List<Integer>listaDeEnteros= new ArrayList<>();
        listaDeEnteros.add(23);
        listaDeEnteros.add(67);
        listaDeEnteros.add(84);
        listaDeEnteros.add(91);
        listaDeEnteros.add(49);

        imprimirListaEnteros(listaDeEnteros);

    }

    public static void imprimirListaEnteros (List<Integer>listaDeEnteros){
        for(int i = 0; i<listaDeEnteros.size(); i++){
            System.out.println(listaDeEnteros.get(i));

        }


    }

}
