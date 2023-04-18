package clase_4;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        String[] diasLaborables = new String[5];
        diasLaborables[0]= "Lunes";
        diasLaborables[1]= "Martes";
        diasLaborables[2]= "Miercoles";
        diasLaborables[3]= "Jueves";
        diasLaborables[4]= "Viernes";

        int[] horasDiarias = new int[5];
        Scanner input = new Scanner(System.in);

        for(int i =0; i<horasDiarias.length; i++){
            System.out.println("Ingrese las horas trabajadas");
            int horas = input.nextInt();
            horasDiarias[i] = horas;
        }
        for(int i = 0; i<diasLaborables.length; i++){
            System.out.println("El dia " +diasLaborables[i] + " trabajo " + horasDiarias[i]+ " horas");
        }

    }
}
