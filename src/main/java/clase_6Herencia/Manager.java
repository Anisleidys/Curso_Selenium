package clase_6Herencia;

public class Manager extends Empleado {

    //Atributos
    private String area;

    //Constructor con parametros
    public Manager(String unNombre, int unTelefono, int unSueldo, String unArea) {
        super(unNombre, unTelefono, unSueldo);
        this.area = unArea;
    }

    //Metodos getter y setter

    public String getArea() {
        return area;
    }

    public void setArea() {
        this.area = area;
    }


    //Metodo toString
    public String toString() {
        if (this.area.isEmpty()) {
            return super.toString() + " No tiene area";
        }
        return super.toString() + " trabaja en el area "+ this.area;


    }

}
