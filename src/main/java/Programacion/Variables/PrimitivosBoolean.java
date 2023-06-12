package Programacion.Variables;

public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean dataLogico = true;
        System.out.println("dataLogico = " + dataLogico);

        double d = 98765.43e-3;//98.76543
        System.out.println("d = " + d);

        float f = 1.23456e2f;//123.45
        System.out.println("f = " + f);

        dataLogico = d < f;
        System.out.println("dataLogico = " + dataLogico);
        
        boolean esIgual= 3-3==1;
        System.out.println("esIgual = " + esIgual);
    }
}
