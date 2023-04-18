package clase_4;

public class Ejercicio22 {
    public static void main(String[] args) {
        boolean[] vacantes = new boolean[4];
        vacantes[0] = true;
        vacantes[1] = false;
        vacantes[2] = true;
        vacantes[3] = true;

        System.out.println(hayVacantes(vacantes));


    }

    public static boolean hayVacantes(boolean[] vacantes) {
        for (int i = 0; i < vacantes.length; i++) {
            if (vacantes[i] != true) {
                return false;
            }
        }
        return true;
    }
}
