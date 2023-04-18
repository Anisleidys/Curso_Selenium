package clase_6Herencia;

public class Tester extends Empleado{

    //Agregando otros atributos
    private boolean manual;
    private boolean automatizador;


    //Constructor para los nuevos atributos con parametros
    public Tester(String unNombre, int unTelefono, int unSueldo, boolean unManual, boolean unAutomatizador){
        super(unNombre, unTelefono, unSueldo);
        this.manual=unManual;
        this.automatizador=unAutomatizador;
    }



    //metodos setter y getter para los nuevos atributos

    public void setManual(boolean manual) {
        this.manual = manual;
    }
    public boolean getManual(){
        return manual;
    }

    public void setAutomatizador(boolean automatizador){
        this.automatizador=automatizador;
    }
    public boolean getAutomatizador(){
        return automatizador;
    }

    //metodo toString

    public String toString() {
        if(this.automatizador==false & this.manual==false){
            return super.toString() + " No es tester";
        } else if (this.automatizador==true & this.manual == true){
            return super.toString() + " es tester automatizador y manual";
        } else if (this.automatizador==false) {
            return super.toString() + " es tester manual";
        }else{
            return super.toString() + " es tester automatizador";
        }
    }
}

