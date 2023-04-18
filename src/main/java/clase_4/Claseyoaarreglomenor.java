package clase_4;

public class Claseyoaarreglomenor {
    public static void main(String[] args) {
        int[] arreglo=new int[3];
        arreglo[0]=25;
        arreglo[1]=6;
        arreglo[2]=10;


        int resutado= menor(arreglo);

    }

    public static int menor(int[] arreglo){
        int menornumero=arreglo[0];
        for(int i=0; i<arreglo.length; i++){
            if(menornumero>arreglo[i]){
                menornumero=arreglo[i];
            }

        }
        return menornumero;

    }

}
