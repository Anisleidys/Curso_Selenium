package Clase_4_2;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas8 {
    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<>();
        enteros.add(67);
        enteros.add(84);
        enteros.add(91);
        enteros.add(49);

        listaDeEnteros(enteros);
        System.out.println(enteros.size());
    }

    public static Integer listaDeEnteros(List<Integer> enteros) {

        return enteros.size();
    }

}
