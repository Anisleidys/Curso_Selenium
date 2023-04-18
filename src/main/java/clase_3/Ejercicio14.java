package clase_3;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        System.out.println("Calcular pormedio " +calcularPromedio());

    }

    public static int ingresarNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        return num;
    }

    public static float calcularPromedio(){
        int num = ingresarNumero();
        int incremento=1;
        int suma = num;
        while (num != 0){
            incremento ++;
            num = ingresarNumero();
            suma= suma + num;
        }
        return suma/incremento;

        }

    }

