import java.time.format.DateTimeFormatter;

public class Ticket {
    public static String generar(Compra compra) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- TICKET DE COMPRA ---\n");
        sb.append("Fecha: ").append(compra.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))).append("\n");
        sb.append("Cliente: ").append(compra.getCliente().getNombreCompleto()).append("\n");
        sb.append("Artículo: ").append(compra.getArticulo().getNombre()).append("\n");
        sb.append("Cantidad: ").append(compra.getCantidad()).append("\n");
        sb.append("Precio unitario: $").append(compra.getArticulo().getPrecioPublico()).append("\n");
        sb.append("Total: $").append(compra.getArticulo().getPrecioPublico() * compra.getCantidad()).append("\n");
        sb.append("------------------------\n");
        return sb.toString();
    }
}