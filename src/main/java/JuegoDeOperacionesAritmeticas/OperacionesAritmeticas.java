package JuegoDeOperacionesAritmeticas;

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Seleccione una opcion valida");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            opcion = input.nextInt();

            switch (opcion){
                case 1: sumatoria(input); break;
                case 2: disminucion(input); break;
                case 3: multiplicacion(input); break;
                case 4: division(input);break;
                case 5: despedida();
                default:break;

            }
        }

    }
        public static void sumatoria(Scanner input) {
            int a = 0;
            System.out.println("Ingrese numero 1");
            a = input.nextInt();

            int b = 0;
            System.out.println("Ingrese un numero 2");
            b = input.nextInt();

            int suma = a + b;
            System.out.println("El resultado de la suma es " +suma);
        }

        public static void disminucion (Scanner input) {

            int a = 0;
            System.out.println("Ingrese numero 1");
            a = input.nextInt();

            int b = 0;
            System.out.println("Ingrese un numero 2");
            b = input.nextInt();

            int resta = a - b;
            System.out.println("El resultado de la resta es " + resta);
        }

        public static void multiplicacion (Scanner input) {

            int a = 0;
            System.out.println("Ingrese numero 1");
            a = input.nextInt();

            int b = 0;
            System.out.println("Ingrese un numero 2");
            b = input.nextInt();

            int multiplica = a * b;
            System.out.println("El resultado de la multiplicacion es " + multiplica);
        }

        public static void division(Scanner input){
            int a = 0;
            System.out.println("Ingrese numero 1");
            a = input.nextInt();

            int b = 0;
            System.out.println("Ingrese un numero 2");
            b = input.nextInt();
            if (a == 0 || b == 0) {
                System.out.println("No se puede ingresar 0 en la operacion");
                return;
            }

            int divide = a / b;
            System.out.println("El resultado de la division es " + divide);


        }

    public static void despedida (){
        System.out.println("Good bye");
    }

    }




