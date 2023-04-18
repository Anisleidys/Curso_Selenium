package clase_5;

import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {


        Libros l1 = new Libros();
        l1.setTitulo("Sin titulo");
        System.out.println("ISBN: " +l1.getIsbn());
        System.out.println("Autor: " +l1.getAutor());
        System.out.println("Titulo: " +l1.getTitulo());
        System.out.println("Cantidad de paginas: " +l1.getNumerosDePaginas());



        Libros l2 = new Libros(5245, "Arquitectura Limpia", "Maria Perez", 500);
        System.out.println("ISBN: " +l2.getIsbn());
        System.out.println("Autor: " +l2.getAutor());
        System.out.println("Titulo: " +l2.getTitulo());
        System.out.println("Cantidad de paginas: " +l2.getNumerosDePaginas());


        //Ingresando datos por el usuario

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el isbn del libro");
        int isbnL2= input.nextInt();

        System.out.println("Ingrese el titulo del libro");
        String tituloL2= input.next();

        System.out.println("Ingrese el autor del libro");
        String autorL2 = input.next();

        System.out.println("Ingrese el numero de paginas del libro");
        int numerosDePaginasL2= input.nextInt();

        Libros L2 = new Libros(isbnL2, tituloL2, autorL2, numerosDePaginasL2);
        System.out.println("Se actualizaron los datos para el L2");
        System.out.println(L2.toString());


        /*System.out.println("ISBN: " +L2.getIsbn());
        System.out.println("Autor: " +L2.getAutor());
        System.out.println("Titulo: " +L2.getTitulo());
        System.out.println("Cantidad de paginas: " +L2.getNumerosDePaginas());*/



    }
}
