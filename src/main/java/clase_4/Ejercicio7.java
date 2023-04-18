package clase_4;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] diasDeLaSemana = new String[7];
        diasDeLaSemana[0]="Domingo";
        diasDeLaSemana[1]="Lunes";
        diasDeLaSemana[2]="Martes";
        diasDeLaSemana[3]="Miercoles";
        diasDeLaSemana[4]="Jueves";
        diasDeLaSemana[5]="Viernes";
        diasDeLaSemana[6]="Sabado";

        Scanner input = new Scanner(System.in);
        int[] ventasDiarias = new int[7];


        for(int i =0; i<ventasDiarias.length; i++){
            System.out.println("Ingrese el valor de la venta");
            int monto= input.nextInt();
            ventasDiarias[i] = monto;
        }

        for(int i =0; i < diasDeLaSemana.length; i++){
            System.out.println("Se vendio el dia  " +diasDeLaSemana[i] + " $" + ventasDiarias[i]);
        }


    }
}
