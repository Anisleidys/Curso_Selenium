package clase_5;

public class Producto {
    
    //Atributos
    private String Nombre;
    private int Codigo;
    private boolean Importado;

    //Constructores

    //Con parametros
    public Producto(String unNombre, int unCodigo, boolean unImportado){
        this.Nombre=unNombre;
        this.Codigo=unCodigo;
        this.Importado=unImportado;
    }

    //Sin parametros
    public Producto(){
        this.Nombre="Desconocido";
        this.Codigo=0;
        this.Importado=false;
    }

    //Metodo get

    public String getNombre(){return this.Nombre;}
    public int  getCodigo(){return this.Codigo;}
    public boolean getImportado(){ return this.Importado;}

    //Metodo set

    public void setNombre(String unNombre) {this.Nombre = unNombre;}
    public void setCodigo(int unCodigo) {this.Codigo = unCodigo;}
    public void setImportado(boolean unImportado) {this.Importado = unImportado;}



    public String toString(){
        String mensaje = "El nombre del producto es: " +getNombre()+ " su codigo es: " +getCodigo();

        if(this.getImportado()==true){
            mensaje= mensaje + " es importado : SI";

        }else{
            mensaje =mensaje + " es importado: NO";
        }
        return mensaje;
    }

    
}
