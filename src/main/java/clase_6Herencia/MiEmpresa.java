package clase_6Herencia;

public class MiEmpresa {
    public static void main(String[] args) {

        Tester t1 = new Tester("Juan Perez", 994015699, 45000, true, false);
        Desarrollador d1 = new Desarrollador("Paola Sanchez", 987458, 90000, "java");
        Desarrollador d2 = new Desarrollador("Mathias Arcanrdini", 5698548, 150000, "javaScript");
        Manager m1 = new Manager("Victoria Bonelli", 2545321, 90000, "");

        System.out.println(t1.toString());
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(m1.toString());




    }
}
