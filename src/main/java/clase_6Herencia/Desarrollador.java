package clase_6Herencia;

public class Desarrollador extends Empleado {

    //Atributos
    private String lenguaje;

    //Constructor con parametros
    public Desarrollador(String unNombre, int unTelefono, int unSueldo, String unLenguaje){
        super(unNombre, unTelefono, unSueldo);
        this.lenguaje=unLenguaje;
    }
    //Metodos getter y setter
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getLenguaje(){
        return lenguaje;
    }

    public String toString(){
        return super.toString() + " utiliza el lenguaje " +this.lenguaje;
    }
}
