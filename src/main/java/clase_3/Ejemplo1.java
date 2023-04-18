package clase_3;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese numeros hasta ingresar el 0");
        int num = -1;
        int suma = 0;
        int contador = 0;



        while (num != 0){
            System.out.println("Ingrese un numero");
            num= input.nextInt();
            suma= suma +num;
            contador++;
           // if(num != 0){
            //    contador++;
          //  }
        }


        System.out.println("La suma es " + suma);
        System.out.println("El programa ha finalizado");
        System.out.println("La cnatidad de numeros ingresados son " + contador);
        System.out.println("El promedio es " +(suma/contador));
    }
}
