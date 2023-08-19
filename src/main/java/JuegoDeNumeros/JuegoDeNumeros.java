package JuegoDeNumeros;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class JuegoDeNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Seleccione una opcion valida");
            System.out.println("1 - Ver instrucciones");
            System.out.println("2 - Ir al juego");
            System.out.println("3 - Salir");
            opcion = input.nextInt();

            switch (opcion){
                case 1: instrucciones(); break;
                case 2: jugada();

            }
        }

    }
        public static void instrucciones() {
            System.out.println("===========================");
            System.out.println("Este es el juego de los numeros");
            System.out.println("===========================");
        }


        public static void jugada () {

            int jugadaUsuario = juegaUsuario();
            int  jugadaComputadora = juegaCompu();


            if (jugadaComputadora > jugadaUsuario) {
                System.out.println(" Gana computadora");}

            if (jugadaComputadora < jugadaUsuario) {
                System.out.println(" Gana usuario");}


        }

    public static int juegaUsuario () {

        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero del 0 al 3");
        num = input.nextInt();

        return num;

    }


    public static int juegaCompu () {

        int randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);

        System.out.println("La compu jugo : " + randomNum);

        return randomNum;
    }



}
