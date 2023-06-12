package Programacion.Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "Any";
        String password = "123456";
        String username2 = "Yoa";
        String password2 = "123456";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese el password");
        String pass = scanner.next();

        boolean esAutenticado = false;
        if( username.equals(usuario) && password.equals(pass) || username2.equals(usuario) && password2.equals(pass)){
            esAutenticado = true;
        }else{
            System.out.println("Usuario y contrasenia incorrecto");
        }


        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));

        }else {
            System.out.println("Lo siento, requiere autenticacion");

        }

    }
}
