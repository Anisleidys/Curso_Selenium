package Programacion.Operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.14e3;
        boolean m = false;

        //Los primitivos se comparan con el ==, sin embargo los objetos se comparan con el equal

        boolean b1 = i == j; // Compara los valores de las variables
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = " + b2);
        
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);
        
        boolean b4 = m == true;
        System.out.println("b4 = " + b4);
        
        boolean b5 = m != true;
        System.out.println("b5 = " + b5);

    }
}
