package clase_4;

public class Claseyoaarreglomayor {
    public static void main(String[] args) {
        int [] arreglomayor=new int[6];
        arreglomayor[0]=6;
        arreglomayor[1]=8;
        arreglomayor[2]=12;
        arreglomayor[3]=20;
        arreglomayor[4]=3;
        arreglomayor[5]=1;

        System.out.println(mayor(arreglomayor));

    }

    public static int mayor(int[] arreglomayor){
        int mayornumero =arreglomayor[0];
        for(int i =0; i<arreglomayor.length; i++){
            if(mayornumero<arreglomayor[i]){
                mayornumero=arreglomayor[i];
            }
        }
        return mayornumero;
    }
}
