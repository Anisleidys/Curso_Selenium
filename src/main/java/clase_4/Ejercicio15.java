package clase_4;

public class Ejercicio15 {
    public static void main(String[] args) {

        int[] numeros = new int [5];
        imprimirArreglo(numeros);

    }

    public static void imprimirArreglo (int[] arreglo){

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posicion " + i + "es: " + arreglo[i]);
        }


    }
}


