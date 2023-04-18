package clase_1;

import java.time.Year;
import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year of birth");
        int birth = input.nextInt();
        int year = 2023-birth;
        /*Sobreecribir variables
        year = 2022-birth;*/
        /* Ingresar year
        int year = Year.now().getValue()-birth;
         */
        System.out.println("Your age is " +year);


    }
}
