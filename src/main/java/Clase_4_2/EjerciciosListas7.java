package Clase_4_2;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas7 {
    public static void main(String[] args) {
        List<String> listaDeString = new ArrayList<>();
        listaDeString.add("Laptop");
        listaDeString.add("Monitor");
        listaDeString.add("Teclado");
        listaDeString.add("Mouse");
        listaDeString.add("Tablet");

        imprimirListaString(listaDeString);


    }

    public static void imprimirListaString(List<String> listaDeString) {
        for (int i = 0; i < listaDeString.size(); i++) {
            System.out.println(listaDeString.get(i));
        }
    }
}
