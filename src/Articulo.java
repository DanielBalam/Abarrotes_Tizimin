import java.io.Serializable;

public class Articulo implements Serializable {
    private int id;
    private String nombre;
    private double precioPublico;
    private double precioProveedor;
    private int existencia;

    public Articulo(int id, String nombre, double precioPublico, double precioProveedor, int existencia) {
        this.id = id;
        this.nombre = nombre;
        this.precioPublico = precioPublico;
        this.precioProveedor = precioProveedor;
        this.existencia = existencia;
    }

    public boolean vender(int cantidad) {
        if (cantidad <= existencia) {
            existencia -= cantidad;
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public int getId() {
        return id;
    }

    public int getExistencia() {
        return existencia;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio: $" + precioPublico + ", Existencia: " + existencia;
    }
}