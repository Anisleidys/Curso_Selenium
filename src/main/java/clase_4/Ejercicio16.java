package clase_4;

public class Ejercicio16 {
    public static void main(String[] args) {
        boolean[] boleanos = new boolean[5];
        imprimirArregloBoleano(boleanos);


    }
    public static void imprimirArregloBoleano (boolean[] letras){

        for (int i = 0; i < letras.length; i++) {
            System.out.println("Posicion " + i + "es: " + letras[i]);
        }

    }
}
