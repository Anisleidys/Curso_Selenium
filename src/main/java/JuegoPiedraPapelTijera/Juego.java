package JuegoPiedraPapelTijera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Seleccione una opcion valida");
            System.out.println("1 - Ver instrucciones");
            System.out.println("2 - Ir al juego");
            System.out.println("3 - Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: mostrarInstrucciones(); break;
                case 2: juego();break;
                case 3: despedida();
                default: break;
            }
        }
    }

    public static void mostrarInstrucciones() {
        System.out.println("===========================");
        System.out.println("Este es el juego piedra papel tijera ....");
        System.out.println("===========================");
    }

    public static void juego() {

        String jugadaUsuario = juegaUsuario();
        String jugadaComputadora = juegaCompu();

        if (jugadaComputadora.equals("P") && jugadaUsuario.equals("T")) {
            System.out.println("Piedra aplasta tijera. Gana Compu");
            return;
        }

        if (jugadaUsuario.equals("P") && jugadaComputadora.equals("T")) {
            System.out.println("Piedra aplasta tijera. Gana Usuario");
            return;
        }

        if (jugadaComputadora.equals("L") && jugadaUsuario.equals("P")) {
            System.out.println("Papel envuelve a piedra. Gana Compu");
            return;
        }

        if (jugadaUsuario.equals("L") && jugadaComputadora.equals("P")) {
            System.out.println("Papel envuelve a piedra. Gana Usuario");
            return;
        }

        if (jugadaComputadora.equals("T") && jugadaUsuario.equals("L")) {
            System.out.println("Tijera corta a papel. Gana Compu");
            return;
        }

        if (jugadaUsuario.equals("L") && jugadaComputadora.equals("P")) {
            System.out.println("Tijera corta a papel. Gana Usuario");
        }

        System.out.println("Jugaron lo mismo, hay que repetir");

    }

    public static String juegaUsuario() {
        Scanner input = new Scanner( System.in);
        System.out.println("Ingrese P (Piedra), L (Papel), T (Tijera), S (Salir)");
        String jugada = input.next();
        if(jugada.equals("S")){
            despedida();
            System.exit(0);
        }
        System.out.println("Jugaste: " + jugada);
        return jugada;
    }

    public static String juegaCompu() {
        List<String> jugadasPosibles = new ArrayList<>();
        jugadasPosibles.add("P");
        jugadasPosibles.add("L");
        jugadasPosibles.add("T");

        int posicion = (int) (Math.random()%3);
        System.out.println("La compu jugo : " + jugadasPosibles.get(posicion));
        return jugadasPosibles.get(posicion);
    }

    public static void despedida (){
        System.out.println("Good bye");
    }
}
