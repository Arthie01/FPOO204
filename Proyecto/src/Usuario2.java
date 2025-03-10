import javax.swing.*;
import java.util.ArrayList;

public class Usuario2 {

    private String nombre;
    private String departamento;
    private String contraseña;
    private String correo;

    private static ArrayList<Usuario2> usuarios = new ArrayList<>();


    //Agregamos un usuario administrador por defecto
    static {
        usuarios.add(new Usuario2("Artemio", "Admin", "admin123", "admin@empresa.com"));
    }

    public Usuario2(String nombre, String departamento, String contraseña, String correo) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    // Métodos Getter y Setter
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Departamento: " + departamento + ", Correo: " + correo;
    }

    //CRUD dentro de la misma clase
    public static void crearUsuario() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
        String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
        String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña:");
        String correo = JOptionPane.showInputDialog("Ingrese el correo:");

        if (nombre != null && departamento != null && contraseña != null && correo != null) {
            usuarios.add(new Usuario2(nombre, departamento, contraseña, correo));
            JOptionPane.showMessageDialog(null, "Usuario creado correctamente.");
        }
    }

    public static void leerUsuarios() {
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados.");
            return;
        }

        String lista = "Usuarios:\n";
        for (int i = 0; i < usuarios.size(); i++) {
            lista += (i + 1) + ". " + usuarios.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }

    public static void actualizarUsuario() {
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios para actualizar.");
            return;
        }

        String indexStr = JOptionPane.showInputDialog("Ingrese el número del usuario a actualizar:");
        try {
            int index = Integer.parseInt(indexStr) - 1;
            if (index >= 0 && index < usuarios.size()) {
                Usuario2 usuario = usuarios.get(index);

                usuario.setNombre(JOptionPane.showInputDialog("Nuevo nombre:", usuario.getNombre()));
                usuario.setDepartamento(JOptionPane.showInputDialog("Nuevo departamento:", usuario.getDepartamento()));
                usuario.setContraseña(JOptionPane.showInputDialog("Nueva contraseña:"));
                usuario.setCorreo(JOptionPane.showInputDialog("Nuevo correo:", usuario.getCorreo()));

                JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Índice inválido.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida.");
        }
    }

    public static void eliminarUsuario() {
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios para eliminar.");
            return;
        }

        String indexStr = JOptionPane.showInputDialog("Ingrese el número del usuario a eliminar:");
        try {
            int index = Integer.parseInt(indexStr) - 1;
            if (index >= 0 && index < usuarios.size()) {
                usuarios.remove(index);
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Índice inválido.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida.");
        }
    }

    // Método para validar el inicio de sesión
    public static Usuario2 validarCredenciales(String departamento, String contraseña) {
        for (Usuario2 u : usuarios) {
            if (u.getDepartamento().equalsIgnoreCase(departamento) && u.getContraseña().equals(contraseña)) {
                return u;
            }
        }
        return null;
    }
}