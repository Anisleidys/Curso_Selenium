package clase_5;

import java.util.Scanner;

public class GestionarUsuarios {
    public static void main(String[] args) {
       /*Persona p1= new Persona("Juan", "Lopez", 64016112);
       // Persona p2= new Persona("Pedro", "Garcias", 64016128);
        p1.setEdad(34);
        p2.setEdad(35);
        System.out.println(p1);
        System.out.println(p2);

        p1.mostrarAnioNacimiento();
        p2.mostrarAnioNacimiento();*/

        //Ingreso por teclado
       Scanner input = new Scanner(System.in);

        System.out.println("Primera persona");

        System.out.println("Ingrese el nombre de una persona");
        String nombreP1= input.next();

        System.out.println("Ingrese el apellido");
        String apellidosP1= input.next();

        System.out.println("Ingrese el documento");
        int documentoP1 = input.nextInt();

        System.out.println("Ingrese la edad");
        int edadP1 = input.nextInt();

        Persona P1 = new Persona(nombreP1, apellidosP1, documentoP1);
        P1.setEdad(edadP1);
        System.out.println(P1);
        P1.mostrarAnioNacimiento();




        System.out.println("Segunda persona");

        System.out.println("Ingrese el nombre de una persona");
        String nombreP2= input.next();

        System.out.println("Ingrese el apellido");
        String apellidosP2= input.next();

        System.out.println("Ingrese el documento");
        int documentoP2 = input.nextInt();

        System.out.println("Ingrese la edad");
        int edadP2 = input.nextInt();

        Persona P2= new Persona(nombreP2, apellidosP2, documentoP2);
        P2.setEdad(edadP2);
        System.out.println(P2);
        P2.mostrarAnioNacimiento();





    }
}
