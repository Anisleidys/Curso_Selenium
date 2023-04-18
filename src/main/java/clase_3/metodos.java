package clase_3;

import java.util.Scanner;

public class metodos {
    public static void main(String[] args) {
        bienvenida();

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numeroIngresado = input.nextInt();
        int doble = obtenerDoble(numeroIngresado);
        System.out.println("El doble es " +doble);

        int suma = sumatoria(5, 0, 0, doble);
        System.out.println("La sumatoria es " +suma);

        despedida();
    }

    public static int obtenerDoble(int num) {
        return num * 2;
    }

    public static int sumatoria (int num1, int num2, int num3, int num4){
        int suma = num1 + num2 + num3 + num4;
        return suma;
    }

    public static void bienvenida (){
        System.out.println("Bienvenidos al programa");
    }
    public static void despedida () {
        System.out.println("El programa a finalizado");
    }

}
