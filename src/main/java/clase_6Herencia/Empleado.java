package clase_6Herencia;

public class Empleado {

    //***Atributos***
    private String nombre;
    private int telefono;
    private int sueldo;

    //***Constructores***

    // con parametros
    public Empleado(String unNombre, int unTelefono, int unSueldo){
        this.nombre=unNombre;
        this.telefono= unTelefono;
        this.sueldo=unSueldo;
    }

    //sin parametros
    public Empleado(){
        this.nombre="";
        this.telefono=94015699;
        this.sueldo=500;
    }

    //Metodos get y set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "El nombre del empleado es  " +this.nombre+ " su telefono es : " +this.telefono + " y su saliario es " +this.sueldo;

    }
}
