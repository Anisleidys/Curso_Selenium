package Clase_4_2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjerciciosListas5 {
    public static void main(String[] args) {
        List<String> nombreAnimales = new ArrayList<>();
        nombreAnimales.add("Perro");
        nombreAnimales.add("Gato");
        nombreAnimales.add("Conejo");
        nombreAnimales.add("Caballo");

        for(int i = 0; i<nombreAnimales.size(); i++){
            System.out.println(nombreAnimales.get(i));
        }
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese el nombre del animal que desea seleccionar");
        String animal= input.next();

        int posicionAnimal = -1;

        for(int i =0; i< nombreAnimales.size(); i++){
            if(nombreAnimales.get(i).equalsIgnoreCase(animal)){
                posicionAnimal=i;
            }
            }
        System.out.println(posicionAnimal);

        if(posicionAnimal== -1){
            System.out.println("El animal no se encuentra");
        }else{
            System.out.println("El animal " +nombreAnimales.get(posicionAnimal) + "esta en la poscion " +posicionAnimal);
        }
        }




    }

