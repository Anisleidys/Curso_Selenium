package clase_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionarProductos {
    public static void main(String[] args) {

        List<Producto> listaproductos = new ArrayList<>();

        for(int i =0; i<3; i++){

            Scanner input = new Scanner(System.in);

            System.out.println("Ingrese el nombre del producto");
            String NombreP1= input.next();

            System.out.println("Ingrese el codigo");
            int CodigoP1= input.nextInt();

            System.out.println("Es importado Si o No?");
            String ImportadoPx = input.next();
            boolean ImportadoP1=false;
            if(ImportadoPx.equalsIgnoreCase("SI")){
                ImportadoP1 = true;
            }

            Producto P1 = new Producto(NombreP1, CodigoP1, ImportadoP1);
            listaproductos.add(P1);
        }
        for (int i = 0; i< listaproductos.size(); i++){
            System.out.println(listaproductos.get(i).toString());
        }


      /*  Scanner input = new Scanner(System.in);

        System.out.println("Ingresar primera linea de productos!!");

        System.out.println("Ingrese el nombre del producto");
        String NombreP1= input.next();

        System.out.println("Ingrese el codigo");
        int CodigoP1= input.nextInt();

        System.out.println("Es importado Si o No?");
        String ImportadoPx = input.next();
        boolean ImportadoP1=false;
        if(ImportadoPx.equalsIgnoreCase("SI")){
            ImportadoP1 = true;
        }*/



    }

}
