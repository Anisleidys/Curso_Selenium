package clase_4;

public class arregloBooleanos {
    public static void main(String[] args) {
        // true -> libre
        //  false -> ocupado

        boolean[] asientosLibres = new boolean[3];
        asientosLibres[2]= false;

        for(int i =0; i<asientosLibres.length; i++){
            System.out.println(asientosLibres [i]);
        }
        boolean hayLugar = hayAsientosDisponibles(asientosLibres);
        if (hayLugar ==true){
            System.out.println("Hay asientos disponibles!!");
        } else{
            System.out.println("Esta todo ocupado");
        }
    }

    //crear metodo que retorne si hay asiento diponibles
    public static boolean hayAsientosDisponibles(boolean[] asientos){

        for(int i = 0; i< asientos.length; i++){
            if (asientos[i]==true){
                return true;
            }
        }
        return false;


    }
}
