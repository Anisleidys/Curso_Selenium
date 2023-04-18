package clase_4;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 6;
        arr[1] = 5;
        arr[2] = 1;
        arr[3] = 4;
        arr[4] = 8;
        arr[5] = 2;

        int result=menor(arr);
        System.out.println("El menor numero es " +result );


    }


    public static int menor(int[] arr) {
        int menor = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(menor>arr[i]){
                menor=arr[i];
            }

        }
        return menor;




    }
}
