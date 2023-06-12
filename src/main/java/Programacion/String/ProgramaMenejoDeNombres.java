package Programacion.String;

import java.util.Scanner;

public class ProgramaMenejoDeNombres {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de mama");
        String mama = scaner.nextLine();
        String mama2 = mama.toUpperCase().charAt(1) + "." + mama.substring(mama.length()-2);


        System.out.println("Ingrese el nombre de papa");
        String papa = scaner.nextLine();
        String papa2 = papa.toUpperCase().charAt(1) + "." + papa.substring(papa.length()-2);

        System.out.println("Ingrese el nombre de hermano/a");
        String hermano = scaner.nextLine();
        String hermano2 = hermano.toUpperCase().charAt(1) + "." + hermano.substring(hermano.length()-2);
        
        String datosDeFamilia = mama2 +"_" + papa2 + "_" + hermano2;
        System.out.println("datosDeFamilia = " + datosDeFamilia);
    }
}
