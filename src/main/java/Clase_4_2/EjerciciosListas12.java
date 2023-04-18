package Clase_4_2;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas12 {
    public static void main(String[] args) {
        List<Integer> listaDeEnteros = new ArrayList<>();
        listaDeEnteros.add(37);
        listaDeEnteros.add(67);
        listaDeEnteros.add(84);
        listaDeEnteros.add(91);
        listaDeEnteros.add(49);

        menorNumero(listaDeEnteros);

        System.out.println(menorNumero(listaDeEnteros));

    }

    public static Integer menorNumero(List<Integer> listaDeEnteros){
        int menor=Integer.MAX_VALUE;
        for(int i =0; i< listaDeEnteros.size(); i++){
            if(listaDeEnteros.get(i)<menor){
                menor = listaDeEnteros.get(i);
            }

        }
        return menor;

    }
}
