package Programacion.Operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArregloTernario {
    public static void main(String[] args) {

        String[] usernames = {"Any", "Yoa"};
        String[] passwords = {"123", "123456"};

       /* usernames[0] = "Any";
        passwords [0] = "123456";
        usernames[1] = "Yoa";
        passwords [1]= "123456";*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese el password");
        String pass = scanner.next();

        boolean esAutenticado = false;

        for (int i =0; i< usernames.length; i++){
            esAutenticado = (usernames[i].equals(usuario) && passwords[i].equals(pass))? true: esAutenticado;
        }

            /*if( usernames[i].equals(usuario) && passwords[i].equals(pass)){
                esAutenticado = true;
                break;
            }

        }*/

        String mensaje = esAutenticado ? "Bienvenido usuario ". concat(usuario).concat("!") :
                "Usuario y contrasenia incorrecto!\n Lo siento, requiere autenticacion";

        System.out.println("mensaje = " + mensaje);



      /*  if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));

        }else {
            System.out.println("Usuario y contrasenia incorrecto");
            System.out.println("Lo siento, requiere autenticacion");

        }*/



    }
}
