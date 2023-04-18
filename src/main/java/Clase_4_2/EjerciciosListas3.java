package Clase_4_2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjerciciosListas3 {
    public static void main(String[] args) {
        List<Integer> agregarNumero = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero diferente de 0");

        int num = -1;
        while (num != 0) {
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            if(num!=0) {
                agregarNumero.add(num);
            }

        }

        for(int i = 0; i< agregarNumero.size(); i++){
            System.out.println(agregarNumero.get(i));
        }


    }



    }
