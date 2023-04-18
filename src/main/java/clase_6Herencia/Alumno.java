package clase_6Herencia;

public class Alumno extends Persona {
    private String curso;

    public Alumno(String unNombre, int unDni){
        super(unNombre, unDni);
        this.curso = "Sin asignar";
    }

    public Alumno(String unNombre, int unDni, String unCurso){
        super(unNombre, unDni);
        this.curso = unCurso;
    }


    public void setCurso(String unCurso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }


    public String toString(){
        if(this.curso.equalsIgnoreCase("Sin asignar")){
            return "El alumno " +this.nombre+ " tiene Dni: " +this.dni + " y no tiene curso asignado ";
        }else {
        return super.toString() + " cursa en " +this.curso;
        }
    }


}
