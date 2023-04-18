package clase_5;

public class Libros {

    //Atributos
    private int isbn;

    private String titulo;
    private String autor;
    private int numerosDePaginas;


    //CONSTRUCTORES SIN PARAMETROS

    public Libros(){
        System.out.println("Constructor sin parametros!!");
        this.isbn=8808;
        this.titulo="Microservicios";
        this.autor="Yoandy Perez";
        this.numerosDePaginas= 300;


    }


    //CONSTRUCTORES CON PARAMETROS

    public Libros(int unIsbn, String unTitulo, String unAutor, int unNumerosDePaginas) {
        System.out.println("Constructor con parametros!!");
        this.isbn = unIsbn;
        this.titulo = unTitulo;
        this.autor = unAutor;
        this.numerosDePaginas = unNumerosDePaginas;
    }


    //METODO GET
    public int getIsbn(){
        return this.isbn;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getNumerosDePaginas() {
        return this.numerosDePaginas;
    }

    //METODO SET

   public void setIsbn(int unIsbn) {
        this.isbn = unIsbn;
    }

    public void setTitulo(String unTitulo){
        this.titulo=unTitulo;
    }

    public void setAutor(String unAutor) {
        this.autor = unAutor;
    }

    public void setNumerosDePaginas(int unNumerosDePaginas) {
        this.numerosDePaginas = unNumerosDePaginas;
    }

    //METODO toString()



    public String toString(){

        return "El libro con ISBN: " + getIsbn() + " creado por el autor: " +getAutor() + " tiene: " + getNumerosDePaginas();

    }





}
