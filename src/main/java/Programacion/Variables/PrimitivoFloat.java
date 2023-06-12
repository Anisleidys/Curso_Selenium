package Programacion.Variables;

public class PrimitivoFloat {


    public static void main(String[] args) {
       
        //float realFloat= 1.0f;
       // float realFloat= 2120f;
       // float realFloat= 2.12e3f; correr la coma a la derecha
        //float realFloat= 1.5e4f;
        float realFloat= 0.00000000015f;//1.5e-10f; //correr la coma a la izquierda
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " +Float.BYTES);//4
        System.out.println("float corresponde en bites a = " +Float.SIZE);//32
        System.out.println("float tamanio maximo= " +Float.MAX_VALUE);
        System.out.println("float tamanio minimo= " +Float.MIN_VALUE);


        double realDouble= 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " +Double.BYTES);//8
        System.out.println("double corresponde en bites a = " +Double.SIZE);//64
        System.out.println("double tamanio maximo= " +Double.MAX_VALUE);
        System.out.println("double tamanio minimo= " +Double.MIN_VALUE);


        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
