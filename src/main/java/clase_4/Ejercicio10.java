package clase_4;

public class Ejercicio10 {
    public static void main(String[] args) {

        int[] cienNumeros = new int [100];

        for(int i =0; i<cienNumeros.length; i++){
            cienNumeros[i]=i;
        }
        int suma = 0;
        for(int i = 0; i<cienNumeros.length; i++){
            suma = suma + cienNumeros[i];
        }

        float promedio = suma/ cienNumeros.length;
        System.out.println("El total de la suma es: " +suma);
        System.out.println("El total del promedio es: " +promedio);

    }
}
