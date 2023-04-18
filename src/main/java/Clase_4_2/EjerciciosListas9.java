package Clase_4_2;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas9 {
    public static void main(String[] args) {
        List<Integer> listaDeEnteros = new ArrayList<>();
        //listaDeEnteros.add(37);
        //listaDeEnteros.add(67);
        //listaDeEnteros.add(84);
        //listaDeEnteros.add(91);
        //listaDeEnteros.add(49);

        boolean estaVacia = valoresVerdadero(listaDeEnteros);
        System.out.println(estaVacia);

    }

    public static boolean valoresVerdadero(List<Integer> listaDeEnteros) {

            if (listaDeEnteros.size() == 0) {
                return true;
            }
        return false;
    }
}


