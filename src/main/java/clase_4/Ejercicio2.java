package clase_4;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Indicar el error en el codigo
        int [ ] horas = new int [ 3 ];
        //horas[0] = 12.3; //El tipo de dato del elemento difiere al definido en el arreglo.
        horas[3] = 4;
        System.out.println("El largo es" + horas.length );
    }
}
