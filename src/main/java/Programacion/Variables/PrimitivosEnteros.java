package Programacion.Variables;

public class PrimitivosEnteros {
    public static void main(String[] args) {
       
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " +Byte.BYTES);//1
        System.out.println("Tipo byte corresponde en bites a " +Byte.SIZE);//8
        System.out.println("valor maximo de un byte " +Byte.MAX_VALUE );
        System.out.println("valor minimo de un byte " +Byte.MIN_VALUE );
        
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " +Short.BYTES);//2
        System.out.println("Tipo short corresponde en bites a " +Short.SIZE);//16
        System.out.println("valor maximo de un short " +Short.MAX_VALUE );
        System.out.println("valor minimo de un short " +Short.MIN_VALUE );

        int numeroInt= 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " +Integer.BYTES); //4
        System.out.println("Tipo int corresponde en bites a " +Integer.SIZE);//32
        System.out.println("valor maximo de un int " +Integer.MAX_VALUE );
        System.out.println("valor minimo de un int " +Integer.MIN_VALUE );

        long numeroLong=2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo Long corresponde en byte a " +Long.BYTES);//8
        System.out.println("Tipo Long corresponde en bites a " +Long.SIZE);//64
        System.out.println("valor maximo de un Long " +Long.MAX_VALUE );
        System.out.println("valor minimo de un Long" +Long.MIN_VALUE );

        //var numeroVar = 127;
        //var numeroVar = 32768;
        //var numeroVar = 2147483648L;



    }
}
