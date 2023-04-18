package Clase_4_2;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas14 {
    public static void main(String[] args) {
        List<Boolean> listaBooleanos = new ArrayList<>();
        listaBooleanos.add(true);
        listaBooleanos.add(false);
        listaBooleanos.add(true);
        listaBooleanos.add(true);

        boolean esVerdadero = recibeBoleanosEnTrue(listaBooleanos);

        System.out.println(esVerdadero);

    }

    public static Boolean recibeBoleanosEnTrue(List<Boolean> listaBooleanos) {

        for (int i = 0; i < listaBooleanos.size(); i++) {

            if (listaBooleanos.get(i) == false) {
                return false;
            }

        }
        return true;
    }

}


