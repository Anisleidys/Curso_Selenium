package Programacion.Variables;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
         //char caracter = 'A';
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal == carcater " +(decimal==caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo == carcater " +(simbolo==caracter));

        System.out.println("Char corresponde en byte " + Character.BYTES);//2
        System.out.println("Char corresponde en bites " + Character.SIZE);//16
        System.out.println("Char maximo " + Character.MAX_VALUE);
        System.out.println("Char minimo " + Character.MIN_VALUE);


        /*
        var caracters = '\u0040';
        var decimals = 64;
        System.out.println("caracter = " + caracters);
        System.out.println("decimal = " + decimals);
        System.out.println("decimal == carcater " +(decimals==caracters));
        var simbolos = '@';
        System.out.println("simbolo = " + simbolos);
        System.out.println("simbolo == carcater " +(simbolos==caracters));*/

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("Char corresponde en byte: "  + espacio    +Character.BYTES);
        System.out.println("Char corresponde en byte: "  + System.getProperty("line.separator")    +Character.BYTES);
        System.out.println("Char corresponde en byte: "  + retroceso + retroceso + retroceso +Character.BYTES);
        System.out.println("Char corresponde en \t byte: "  + tabulador  +Character.BYTES);
        System.out.println("Char corresponde en byte: "  + nuevaLinea  +Character.BYTES);
        System.out.println("Char corresponde en byte: "  + retornoCarro  +Character.BYTES);





    }
}
