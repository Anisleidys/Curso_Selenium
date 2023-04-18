package clase_6Herencia;

public class Profesor extends Persona{
    private String materia;



    public Profesor(){
        super("Sin asignar", 0);
        this.materia = "Sin asignar";
    }
    public Profesor(String unNombre, int unDni, String unaMateria){
        super(unNombre, unDni);
        this.materia=unaMateria;
    }


    public void setMateria(String unaMateria) {
        this.materia = materia;
    }
    public String getMateria() {
        return materia;
    }




    public String toString(){
        String ret ="";
        if (this.dni==0){
            ret = "No hay informacion de este profesor";
        } else {
            ret = super.toString() +  " dicta la materia " + this.materia;
        }
        return ret;
    }
}
