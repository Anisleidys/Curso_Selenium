package clase_3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();
        boolean compara = mayorDeEdad(num1);
        if(mayorDeEdad(num1)== true){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }


    }
    public static boolean mayorDeEdad(int num1){
      if (num1 >= 20){
          return true;
      } else {
          return false;
      }
    }
}
