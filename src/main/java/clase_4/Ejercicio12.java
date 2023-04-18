package clase_4;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] numerosDeElementos = new int [5];
        int positivo = 0;
        int negativo = 0;
        int ceros= 0;

        for(int i =0; i< numerosDeElementos.length; i++){
            if(numerosDeElementos[i]>0){
                positivo++;
            }else if (numerosDeElementos[i] < 0){
                negativo++;
            } else {
                ceros++;
            }
        }
        System.out.println("Se encontraron " +positivo + " Mayores a 0");
        System.out.println("Se encontraron " +negativo + " Menores a 0");
        System.out.println("Se encontraron " +ceros + " Iguales a 0");
    }
}
