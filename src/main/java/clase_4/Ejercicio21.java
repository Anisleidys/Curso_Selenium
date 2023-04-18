package clase_4;

public class Ejercicio21 {
    public static void main(String[] args) {
        boolean[] vacantes = new boolean[4];
        vacantes[0] = false;
        vacantes[1] = true;
        vacantes[2] = true;
        vacantes[3] = false;

        System.out.println(hayVacantes(vacantes));


    }

    public static int hayVacantes(boolean[] vacantes) {
        int cantidadvacante= 0;
        for (int i = 0; i < vacantes.length; i++) {
            if (vacantes[i] == true) {
                cantidadvacante++;
            }

            }

        return cantidadvacante;

    }
}


