package clase_6Herencia;

import clase_6Herencia.Camion;

import java.util.ArrayList;
import java.util.List;

public class Automotora {
    public static void main(String[] args) {

      Camion c1 = new Camion();

        System.out.println("El color del c1 es " +c1.getcolor());
        System.out.println("La chapa del c1 es " +c1.getchapa());

        Camion c2 = new Camion(199);
        c2.setAnioCompra(2014);

        System.out.println("El color del c2 es " +c2.getcolor());
        System.out.println("La chapa del c2 es " +c2.getchapa());

        Camion c3 = new Camion(700, "Verde");

        System.out.println("El color del c3 es " +c3.getcolor());
        System.out.println("La chapa del c3 es " +c3.getchapa());

       //Actualizacion del getter y setter ..ingresados por el usuario


      /*  Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el color del camion c3");
        String colorC3 = input.next();

        System.out.println("Ingrese la chapa del camion c3");
        int chapaC3= input.nextInt();

        System.out.println("Actualizando datos......!");

        c3.setChapa(chapaC3);

        c3.setColor(colorC3);*/
        System.out.println("El color del c3 es " +c3.getcolor());
        System.out.println("La chapa del c3 es " +c3.getchapa());

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);


        List<String> listaTitulos = new ArrayList<>();
        listaTitulos.add("Noticias");
        listaTitulos.add("Deportes");
        listaTitulos.add("Politica");

      for (String titulo:listaTitulos) {
        System.out.println(titulo);

      }










    }
}
