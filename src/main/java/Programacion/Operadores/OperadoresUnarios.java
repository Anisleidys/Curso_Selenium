package Programacion.Operadores;

public class OperadoresUnarios {

    //Operador unario se utiliza para invertir el signo
    public static void main(String[] args) {
        int i = -5;

        int j = +i; // j= (1)*i = -5
        System.out.println("j = " + j);

        int k = -i; //k= (-1) * i; 5
        System.out.println("k = " + k);

        i = 6;
        j = +6;
        System.out.println("j = " + j);

        k= -i;
        System.out.println("k = " + k);


    }
}
