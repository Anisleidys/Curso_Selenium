package Programacion.Operadores;

import java.util.Scanner;

public class DesafioTanqueDeGasolina {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de litros que tiene el tanque");
        double cantidad = s.nextDouble();

      if(cantidad == 70){
          System.out.println("Suficiente");
      }
      if (cantidad<70 && cantidad>60){
          System.out.println("El tanque esta casi lleno" );
      }

      if (cantidad<60 && cantidad > 40){
          System.out.println("El estanque esta a 3/4");
      }

        if (cantidad<40 && cantidad >35){
            System.out.println("El estanque esta a la mitad");
        }

        if (cantidad<35 && cantidad> 20){
            System.out.println("El estanque es sufucuiente");
        }

        if (cantidad<20 && cantidad> 1){
            System.out.println("El estanque es insuficiente");
        }

    }
}
