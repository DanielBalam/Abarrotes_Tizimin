public class VisualizadorDatos {
    public static void mostrarClientes() {
        System.out.println("\n--- CLIENTES REGISTRADOS ---");
        for (Cliente c : SistemaTienda.clientes.values()) {
            System.out.println(c);
        }
    }

    public static void mostrarArticulos() {
        System.out.println("\n--- ARTÍCULOS REGISTRADOS ---");
        for (Articulo a : SistemaTienda.articulos.values()) {
            System.out.println(a);
        }
    }
}