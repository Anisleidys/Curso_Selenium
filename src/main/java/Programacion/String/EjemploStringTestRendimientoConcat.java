package Programacion.String;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); //mutable

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++){
            // c = c.concat(a). concat(b).concat("\n");//3ms 500
            //c+= a+b + "\n";// 13ms  500

            sb.append(a).append(b).append("\n");// 0ms 500
        }



        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
