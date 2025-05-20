import java.util.HashMap;
import java.util.Map;

public class SistemaTienda {
    public static Map<Integer, Cliente> clientes;
    public static Map<Integer, Articulo> articulos;

    static {
        clientes = Persistencia.cargarClientes("clientes.dat");
        articulos = Persistencia.cargarArticulos("articulos.dat");
    }

    public static void guardarTodo() {
        Persistencia.guardarClientes(clientes, "clientes.dat");
        Persistencia.guardarArticulos(articulos, "articulos.dat");
    }
}