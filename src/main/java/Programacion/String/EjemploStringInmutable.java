package Programacion.String;

public class EjemploStringInmutable {
    public static void main(String[] args) {


        String curso = "Programacion Java"; 
        String profesor = "Andres Guzmas";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso==resultado);

        //Expresion Landa
        curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        
        
        String resultado2 = curso.transform( u ->{
            return u + " con " + profesor;
            
        });
        System.out.println("resultado2 = " + resultado2);

        String resultado3 =resultado. replace("a", "A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);




    }
}
