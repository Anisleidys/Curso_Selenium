package clase_4;

public class Ejercicio17 {
    public static void main(String[] args) {
        float[] arreglo = new float[5];
        arreglo[1]=4;
        arreglo[3]=arreglo[1];
        arreglo[4]= arreglo[0];
        mostrarEnPantalla(arreglo);

    }
    public static void mostrarEnPantalla(float[] array){
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}
