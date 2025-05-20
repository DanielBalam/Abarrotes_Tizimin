import java.io.*;
import java.util.Map;

public class Persistencia {
    public static void guardarClientes(Map<Integer, Cliente> clientes, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Integer, Cliente> cargarClientes(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Map<Integer, Cliente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new java.util.HashMap<>();
        }
    }

    public static void guardarArticulos(Map<Integer, Articulo> articulos, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(articulos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Integer, Articulo> cargarArticulos(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Map<Integer, Articulo>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new java.util.HashMap<>();
        }
    }
}
