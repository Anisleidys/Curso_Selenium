package clase_4;

public class Ejercicio18 {
    public static void main(String[] args) {
        float[] promedio = new float[11];
        calcularPromedio(promedio);
        System.out.println("El promedio es " +calcularPromedio(promedio));

    }

    public static float calcularPromedio(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        float suma =0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma/ array.length;


    }
}
