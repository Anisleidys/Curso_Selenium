package clase_1;

import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Suma
        System.out.println("Enter number A" );
        int numeroA = input.nextInt();
        System.out.println("Enter number B " );
        int numeroB = input.nextInt();
        int suma =numeroA +numeroB;
        System.out.println("Result " + suma);

        //Resta
        System.out.println("Enter number1");
        int number1 = input.nextInt();
        System.out.println("Enter number2");
        int number2 = input.nextInt();
        int resta = number1 - number2;
        System.out.println("Result " + resta);

        //Suma *3
        int triple = suma * 3;
        System.out.println("Result triple " + triple);



    }
}
