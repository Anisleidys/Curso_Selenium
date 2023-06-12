package Programacion.Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //PreIncremento

       int i = 1;
       int j = ++i;    // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //PosIncremento

        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        //PreDecremento

        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        //PosDecremento

        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);



    }
}
