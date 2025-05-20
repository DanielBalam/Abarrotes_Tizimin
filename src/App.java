import java.io.IOException;
import java.util.Map;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Menú:\n" +
                "1. Registrar un cliente\n" +
                "2. Registrar artículo\n" +
                "3. Realizar compra\n" +
                "4. Ver todos los clientes\n" +
                "5. Ver todos los artículos\n" +
                "6. Salir");

            if (opcion == null || opcion.equals("6")) break;

            switch (opcion) {
                case "1":
                    registrarCliente();
                    break;
                case "2":
                    registrarArticulo();
                    break;
                case "3":
                    realizarCompra();
                    break;
                case "4":
                    verClientes();
                    break;
                case "5":
                    verArticulos();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }

    private static void registrarCliente() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("ID Cliente:"));
            String nombre = JOptionPane.showInputDialog("Nombre:");
            String apellido = JOptionPane.showInputDialog("Apellido Paterno:");
            String direccion = JOptionPane.showInputDialog("Dirección:");

            String calle = JOptionPane.showInputDialog("Calle:");
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
            String colonia = JOptionPane.showInputDialog("Colonia:");
            int cp = Integer.parseInt(JOptionPane.showInputDialog("CP:"));
            String ciudad = JOptionPane.showInputDialog("Ciudad:");
            String estado = JOptionPane.showInputDialog("Estado:");
            String telefono = JOptionPane.showInputDialog("Teléfono:");

            Direccion dir = new Direccion(calle, numero, colonia, cp, ciudad, estado, telefono);
            Cliente cliente = new Cliente(id, nombre, apellido, dir);
            SistemaTienda.clientes.put(id, cliente);
            JOptionPane.showMessageDialog(null, "Cliente registrado.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar cliente.");
        }
    }

    private static void registrarArticulo() {
    try {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID Artículo:"));
        String nombre = JOptionPane.showInputDialog("Nombre del artículo:");
        double precioPub = Double.parseDouble(JOptionPane.showInputDialog("Precio al público:"));
        double precioProv = Double.parseDouble(JOptionPane.showInputDialog("Precio del proveedor:"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad en existencia:"));

        Articulo art = new Articulo(id, nombre, precioPub, precioProv, cantidad);
        SistemaTienda.articulos.put(id, art);
        JOptionPane.showMessageDialog(null, "Artículo registrado.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al registrar artículo.");
    }
}

    private static void realizarCompra() {
        try {
            int idCliente = Integer.parseInt(JOptionPane.showInputDialog("ID del cliente:"));
            int idArticulo = Integer.parseInt(JOptionPane.showInputDialog("ID del artículo:"));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));

            Cliente cliente = SistemaTienda.clientes.get(idCliente);
            Articulo articulo = SistemaTienda.articulos.get(idArticulo);

            if (cliente == null || articulo == null) {
                JOptionPane.showMessageDialog(null, "Cliente o artículo no encontrado.");
                return;
            }

            if (!articulo.vender(cantidad)) {
                JOptionPane.showMessageDialog(null, "No hay suficiente existencia.");
                return;
            }

            Compra compra = new Compra(cliente, articulo, cantidad);
            String ticket = Ticket.generar(compra);

            // SistemaTienda.ultimoTicket = ticket;
            guardarTicketEnArchivo(ticket); // Guardar ticket

            JOptionPane.showMessageDialog(null, ticket);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al realizar compra.");
        }
    }

    private static void guardarTicketEnArchivo(String ticket) {
        try {
            // Crear la carpeta 'tickets' si no existe
            java.nio.file.Path carpeta = java.nio.file.Paths.get("tickets");
            if (!java.nio.file.Files.exists(carpeta)) {
                java.nio.file.Files.createDirectory(carpeta);
            }

            // Ruta completa del archivo dentro de la carpeta
            String nombreArchivo = "ticket_" + System.currentTimeMillis() + ".txt";
            java.nio.file.Path archivo = carpeta.resolve(nombreArchivo);

            // Escribir el ticket en el archivo
            java.nio.file.Files.write(archivo, ticket.getBytes());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el ticket.");
        }
    }


    private static void verClientes() {
        StringBuilder listaClientes = new StringBuilder("Clientes registrados:\n");
        for (Map.Entry<Integer, Cliente> entry : SistemaTienda.clientes.entrySet()) {
            listaClientes.append(entry.getValue()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaClientes.toString());
    }

    private static void verArticulos() {
        StringBuilder listaArticulos = new StringBuilder("Artículos registrados:\n");
        for (Map.Entry<Integer, Articulo> entry : SistemaTienda.articulos.entrySet()) {
            listaArticulos.append(entry.getValue()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaArticulos.toString());
    }

    // private static void imprimirUltimoTicket() {
    //     if (SistemaTienda.ultimoTicket == null) {
    //         JOptionPane.showMessageDialog(null, "No hay tickets registrados.");
    //     } else {
    //         JOptionPane.showMessageDialog(null, SistemaTienda.ultimoTicket);
    //     }
    // }
}