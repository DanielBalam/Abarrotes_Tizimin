import java.io.Serializable;

public class Direccion implements Serializable {
    private String calle;
    private int numero;
    private String colonia;
    private int cp;
    private String ciudad;
    private String estado;
    private String telefono;

    public Direccion(String calle, int numero, String colonia, int cp, String ciudad, String estado, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
    }
}