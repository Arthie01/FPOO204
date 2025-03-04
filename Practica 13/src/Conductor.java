import javax.swing.JOptionPane;

public class Conductor {
 // Atributos privados
        private String nombre;
        private String identificacion;
        private String licencia;

        // Constructor
        public Conductor(String nombre, String identificacion, String licencia) {
            this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
            this.identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
            this.licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
        }

        // Métodos getter
        public String getNombre() {
            return nombre;
        }

        public String getIdentificacion() {
            return identificacion;
        }

        public String getLicencia() {
            return licencia;
        }

        // Método setter solo para nombre
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        // Método para mostrar información del conductor
        public void mostrarInformacion() {
            JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nIdentificación: " + identificacion + "\nLicencia: " + licencia);
        }
    


}
