package Programacion.Variables;

import javax.swing.*;

public class SistemaNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr) ;

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero" );
            main(args);
            System.exit(0);
        }

        String resultadoDecimal = "numero binario de " + numeroDecimal + " = " +Integer.toBinaryString(numeroDecimal);
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println(resultadoDecimal);


        String numeroBinario = Integer.toBinaryString(numeroDecimal);//para los binarios se antepone el 0b
        String resultadoBinario= "numeroOctal = " + numeroDecimal + " = " +Integer.toOctalString(numeroDecimal);
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println(resultadoBinario);

        String numeroOctal= Integer.toOctalString(numeroDecimal);//para el octal se antepone un 0
        String resultadoOctal ="numero hexadecimal de " +numeroDecimal+ " = " +Integer.toHexString(numeroDecimal);
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println(resultadoOctal);

        String numeroHex = Integer.toHexString(numeroDecimal);//para el hexadecimal se antepone un 0x
        String resultadoHex= "numeroHex = " + numeroHex;
        System.out.println(resultadoHex);

        String mensaje = resultadoDecimal;
        mensaje += "\n" + resultadoBinario;
        mensaje += "\n" +resultadoOctal;
        mensaje += "\n" +resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
