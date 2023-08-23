package sooper;

public interface IContenedores {
    String getReferencia();

    int getVolumen();
    int getVolumenDisponible();
    int getResistencia();

    Set<IProductos> getProductos();
    String getTipo();

    boolean meter (IProductos productos);
    boolean resiste (IProductos productos);
}
