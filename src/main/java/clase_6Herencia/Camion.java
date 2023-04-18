package clase_6Herencia;

public class Camion {

    //1. Atributos de la clase camion...
    private String color;
    private int chapa;

    private int anioCompra;

    // 2. Constructores sin parametros....
    public Camion(){
        System.out.println("Constructor sin parametros...!");
        this.color="Rojo";
        this.chapa=1234;
        this.anioCompra = 2023;


    }

    //2.1 Construntores con parametros...
    public Camion(int unaChapa){
        System.out.println("Constructor con parametros chapa...!");
        this.chapa=unaChapa;
        this.color="Gris";
        this.anioCompra = 2023;

    }

    public Camion(int unaChapa, String unColor){
        System.out.println("Constructor con parametros chapa y color...!");
        this.chapa=unaChapa;
        this.color=unColor;
        this.anioCompra = 2023;
    }

    //metodo get
    public int getchapa(){
        return this.chapa;
    }

    public String getcolor(){
        return this.color;
    }

    public int getAnioCompra() {
        return this.anioCompra;
    }

    //metodo set
    public void setColor(String unColor) {
        this.color = unColor;
    }
    public void setChapa(int unaChapa) {
        this.chapa = unaChapa;
    }

    public void setAnioCompra(int unAnio) {
        this.anioCompra = unAnio;
    }

    public boolean leTocaRevision(){
        if(this.anioCompra<2015){
            return true;
        }else{
            return false;
        }

    }

    // metodo toString: para pimpir y corregir los errores de impresion(clase_6Herencia.Alumno.Camion@6acbcfc0)

    public String toString(){
        String mensaje = "El color del camion es: " +this.getcolor();
        mensaje = mensaje + " su chapa es: " +this.getchapa();
        mensaje = mensaje + " el aniocompra: " + this.getAnioCompra();

        if(this.leTocaRevision()==true){
            mensaje= mensaje + " LE TOCA REVISION!!";

        }else{
            mensaje =mensaje + "No le toca revision";
        }

        return mensaje;
    }
}

