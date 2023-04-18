package clase_6Herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colegio {
    public static void main(String[] args) {

        //Se crean las listas
        List<Profesor> listaProfesores = new ArrayList<>();
        List<Alumno> listaAlumnos = new ArrayList<>();
        List<Persona> listaPersonas= new ArrayList<>();


        Persona profe1 = new Profesor();
        Persona profe2 = new Profesor("Juan Lopez", 123, "Quimica");

        //Agregar los porfesores a la lista persona

        listaPersonas.add(profe1);
        listaPersonas.add(profe2);

        //System.out.println(profe1);
       // System.out.println(profe2);

        Persona a1 = new Alumno("Ana Matinez", 123456);
        Persona a2 = new Alumno("Andres Gonzalez", 2222, "Informatica");

        listaPersonas.add(a1);
        listaPersonas.add(a2);


       // System.out.println(a1);
       // System.out.println(a2);

        Persona d1= new Director("Maria Perez", 4444);

        //listaPersonas.clear();

        if(listaPersonas.isEmpty()==false){
            System.out.println("****LISTAS PERSONAS****");



        }else{
            System.out.println("La lista se encuentra vacia");

        }

        //Otra forma de implementar el recorrido de las listas

        Profesor profeFisica = new Profesor("Analia Rowen", 9999, "Fisica");
        Profesor profeProgramacion = new Profesor("Joaquin Tun", 2323, "Programacion");
        listaProfesores.add(profeFisica);
        listaProfesores.add(profeProgramacion);

        System.out.println("**Profesores***");


        //foreach
        for(Profesor profe: listaProfesores){

            /*Para hacer una busqueda con equals(estricto)
            if(profe.getNombre().equalsIgnoreCase("Analia Rowen")){
                System.out.println("El profesor se encuentra en la lista");
            }*/

            /*Para hacer una busqueda con contains(flexible)
            if(profe.getNombre().contains("Analia")){
                System.out.println("Analia esta en la lista");

            }*/


            System.out.println(profe);

            // Imprimir algunos valores
            /*System.out.println(profe.getMateria());
            System.out.println(profe.getNombre());
            System.out.println(profe.getDni();*/

        }

        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos alumnos quiere ingresar");
        int cantidad= input.nextInt();
        //System.out.println("Ingrese el nombre del estudiante");
        for(int i =0; i<cantidad; i++){

            System.out.println("Ingrese el nombre del alumno");
            String nombre = input.next();

            System.out.println("Ingrese el DNI del alumno");
            int dni = input.nextInt();

            System.out.println("Ingrese el curso");
            String curso = input.next();

            Alumno alumnoNuevo = new Alumno(nombre, dni, curso);
            listaAlumnos.add(alumnoNuevo);
            System.out.println("Se a agregado al sistema" );

        }

        for(Alumno estudiante: listaAlumnos){
            System.out.println(estudiante);

        }






    }
}
