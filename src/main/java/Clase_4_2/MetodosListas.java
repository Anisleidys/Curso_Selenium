package Clase_4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosListas {
    public static void main(String[] args) {
        List<Integer>listaDeNumeros = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        int num=0;
        System.out.println("Ingresar numeros hasta digitar -1");
        while(num !=-1){
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            if(num !=-1){
                listaDeNumeros.add(num);
            }
        }
        mostrarMayor(listaDeNumeros);
       int minimos = obtenerMenor(listaDeNumeros);
        System.out.println("El numero menor ingresado " + minimos);
        System.out.println("El doble del numero menor es "+ minimos * 2);

        System.out.println("Se duplicaron los numeros en la nueva lista " +duplicarlista(listaDeNumeros));




    }

    public static void mostrarMayor(List<Integer>listaDeNumeros) {
        int maximo =listaDeNumeros.get(0);
        for(int i = 0; i<listaDeNumeros.size(); i++){
            if(listaDeNumeros.get(i)>maximo){
                maximo=listaDeNumeros.get(i);
            }

        }
        System.out.println("El mayor numero ingresado fue " +maximo);

    }

    public static int obtenerMenor(List<Integer>listaDeNumeros) {
        int minimo = listaDeNumeros.get(0);
        for(int i = 0; i < listaDeNumeros.size();i++){
            if (listaDeNumeros.get(i) < minimo) {
                minimo=listaDeNumeros.get(i);
            }

            }
        return minimo;


        }

    public static List<Integer> duplicarlista(List<Integer> listaDeNumeros) {

        List<Integer> listaDuplicados= new ArrayList<>();

        for( int i =0; i<listaDeNumeros.size(); i++){
            int num = listaDeNumeros.get(i);
            int doble = num * 2;
            listaDuplicados.add(doble);

        }
        return listaDuplicados;

    }

    }

