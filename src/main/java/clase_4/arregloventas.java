package clase_4;

import java.util.Scanner;

public class arregloventas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] diaSemana = new String[7];
        diaSemana[0] = "Domingo";
        diaSemana[1] = "Lunes";
        diaSemana[2] = "Martes";
        diaSemana[3] = "Miercoles";
        diaSemana[4] = "Jueves";
        diaSemana[5] = "Viernes";
        diaSemana[6] = "Sabado";

        int[] ventasDiarias = new int[7];

        for (int i = 0; i < ventasDiarias.length; i++) {
            System.out.println("Ingrese la venta del dia " + diaSemana[i]);
            int num = input.nextInt();
            ventasDiarias[i] = num;
           //System.out.println("Posicion: " + diaSemana[i] + " " + ventasDiarias[i]);
        }
        
        int ventasTotales = 0;
        for (int i = 0; i < ventasDiarias.length; i++){
            ventasTotales = ventasTotales + ventasDiarias [i];
        }
        System.out.println("El total vendido fue de $ " +ventasTotales);

        System.out.println("El promedio de ventas fue de $" + (ventasTotales/7));

    }

}
