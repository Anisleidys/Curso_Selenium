package sooper;

import java.util.Set;

public interface IPedido {

    String getReferecia();
    Set<IProductos> getProductos();
    Set<IContenedores> getContenedores();

    void addContenedores(IContenedores contenedores);

    IContenedores addProductos(IProductos productos);

}
