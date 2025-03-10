import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Articulo2 {
 

    private String nombre;
    private String categoria;
    private int cantidad;
    private String estado; 

    public static ArrayList<Articulo2> articulos = new ArrayList<>();

    public Articulo2(String nombre, String categoria, int cantidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.estado = cantidad > 0 ? "Disponible" : "No disponible";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void modificarCantidad(int cambio) {
        this.cantidad += cambio;
        if (this.cantidad < 0) this.cantidad = 0; 
        actualizarEstado();
    }

    public String getEstado() {
        return estado;
    }

    private void actualizarEstado() {
        this.estado = (this.cantidad > 0) ? "Disponible" : "No disponible";
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Categoría: " + categoria + ", Cantidad: " + cantidad + ", Estado: " + estado;
    }

    // Crear Artículo
    public static void crearArticulo() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del artículo:");
        if (nombre == null || nombre.isEmpty()) return;

        String categoria = JOptionPane.showInputDialog("Ingrese la categoría:");
        if (categoria == null || categoria.isEmpty()) return;

        try {
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial:"));

            articulos.add(new Articulo2(nombre, categoria, cantidad));
            JOptionPane.showMessageDialog(null, "Artículo creado correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos inválidos.");
        }
    }

    
    public static void leerArticulos() {
        if (articulos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay artículos registrados.");
            return;
        }
        String lista = "Artículos:\n";
        for (int i = 0; i < articulos.size(); i++) {
            lista += (i + 1) + ". " + articulos.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    
    public static void actualizarArticulo() {
        if (articulos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay artículos para actualizar.");
            return;
        }

        try {
            int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice del artículo a actualizar:")) - 1;
            if (index < 0 || index >= articulos.size()) {
                JOptionPane.showMessageDialog(null, "Índice inválido.");
                return;
            }

            Articulo2 articulo = articulos.get(index);
            articulo.setNombre(JOptionPane.showInputDialog("Nuevo nombre:", articulo.getNombre()));
            articulo.setCategoria(JOptionPane.showInputDialog("Nueva categoría:", articulo.getCategoria()));

            JOptionPane.showMessageDialog(null, "Artículo actualizado correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida.");
        }
    }

    
    public static void modificarCantidadArticulo() {
        if (articulos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay artículos registrados.");
            return;
        }

        try {
            int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice del artículo a modificar:")) - 1;
            if (index < 0 || index >= articulos.size()) {
                JOptionPane.showMessageDialog(null, "Índice inválido.");
                return;
            }

            Articulo2 articulo = articulos.get(index);
            int cambio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a agregar (+) o quitar (-):"));

            articulo.modificarCantidad(cambio);
            JOptionPane.showMessageDialog(null, "Cantidad modificada correctamente.\nNuevo estado: " + articulo.getEstado());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida.");
        }
    }

    
    public static void eliminarArticulo() {
        if (articulos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay artículos para eliminar.");
            return;
        }

        try {
            int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice del artículo a eliminar:")) - 1;
            if (index < 0 || index >= articulos.size()) {
                JOptionPane.showMessageDialog(null, "Índice inválido.");
                return;
            }

            articulos.remove(index);
            JOptionPane.showMessageDialog(null, "Artículo eliminado correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida.");
        }
    }
}
