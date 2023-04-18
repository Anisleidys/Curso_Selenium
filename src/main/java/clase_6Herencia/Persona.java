package clase_6Herencia;

public class Persona {

    protected String nombre;
    protected int dni;

    public Persona(String unNombre, int unDni){
        this.nombre = unNombre;
        this.dni= unDni;
    }



    public void setNombre(String unNombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(int unDni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public String toString(){
        return "El nombre es " +this.nombre+ "  su dni es " +this.dni;
    }
}
