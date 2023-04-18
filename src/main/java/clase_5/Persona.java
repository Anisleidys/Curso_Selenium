package clase_5;

public class Persona {
    private String nombre;
    private String apellidos;
    private int documento;
    private int edad;

    public Persona(String unNombre, String unApellidos, int unDocumento){
        this.nombre=unNombre;
        this.apellidos=unApellidos;
        this.documento=unDocumento;
        this.edad =0;
    }

   /* public void setNombre(String unNombre){
        this.nombre= unNombre;
    }

    public String getNombre(){
        return this.nombre;

    }

    public void setApellidos(String unApellidos){
        this.apellidos= unApellidos;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public void setDocumento(int unDocumento){
        this.documento=unDocumento;
    }

    public int getDocumento(){
        return this.documento;
    }*/

    public void setEdad(int unEdad){
        this.edad=unEdad;
    }

  /*  public int getEdad(){
        return this.edad;
    }*/


    public String toString(){
        return this.nombre + " " + this.apellidos + " " +this.documento + " " + this.edad;
    }

    public void mostrarAnioNacimiento(){
        int year = 2023-this.edad;
        System.out.println(year);

    }



}

