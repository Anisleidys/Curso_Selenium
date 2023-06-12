package Programacion.Variables;

import java.util.Scanner;

public class SistemaNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
       // String numeroStr= scanner.nextLine();

       int numeroDecimal = 0;
       try{
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr) ;

        } catch (Exception e){
            System.out.println("Debe ingresar un numero entero!!!");
            main(args);
            System.exit(0);
        }


        String resultadoDecimal = "numero binario de " + numeroDecimal + " = " +Integer.toBinaryString(numeroDecimal);
        String numeroBinario = Integer.toBinaryString(numeroDecimal);//para los binarios se antepone el 0b
        String resultadoBinario= "numeroOctal = " + numeroDecimal + " = " +Integer.toOctalString(numeroDecimal);
        String numeroOctal= Integer.toOctalString(numeroDecimal);//para el octal se antepone un 0
        String resultadoOctal ="numero hexadecimal de " +numeroDecimal+ " = " +Integer.toHexString(numeroDecimal);
        String numeroHex = Integer.toHexString(numeroDecimal);//para el hexadecimal se antepone un 0x
        String resultadoHex= "numeroHex = " + numeroHex;


        String mensaje = resultadoDecimal;
        mensaje += "\n" + resultadoBinario;
        mensaje += "\n" +resultadoOctal;
        mensaje += "\n" +resultadoHex;

        System.out.println(mensaje);

    }
}
