package clase_3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la base");
        float base = input.nextFloat();

        System.out.println("Ingrese la altura");
        float altura = input.nextFloat();

        System.out.println("El area es " + paralelogramo(base, altura));

    }

    public static float paralelogramo(float base, float altura) {
        return base * altura;

    }
}
