package Clase_4_2;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas4 {
    public static void main(String[] args) {
        List<String>nombreDeCalles=new ArrayList<>();
        nombreDeCalles.add("Yoandy");
        nombres(nombreDeCalles);
    }

    public static void nombres (List<String> nombreDeCalles){

        for (int i = 0; i< nombreDeCalles.size(); i++){
            System.out.println(nombreDeCalles.get(i));
        }
    }
}
