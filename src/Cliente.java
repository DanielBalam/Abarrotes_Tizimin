import java.io.Serializable;

public class Cliente implements Serializable {
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private Direccion direccion;

    public Cliente(int id, String nombre, String apellidoPaterno, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.direccion = direccion;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidoPaterno;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + getNombreCompleto();
    }
}