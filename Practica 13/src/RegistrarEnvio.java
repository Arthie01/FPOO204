import javax.swing.JOptionPane;

public class RegistrarEnvio {
        private String codigoEnvio;
        private String destino;
        private double peso;

        // Constructor sobrecargado
        public RegistrarEnvio(String codigoEnvio, String destino) {
            this.codigoEnvio = codigoEnvio;
            this.destino = destino;
            this.peso = 0; // Peso por defecto
        }

        public RegistrarEnvio(String codigoEnvio, String destino, double peso) {
            this.codigoEnvio = codigoEnvio;
            this.destino = destino;
            this.peso = peso;
        }

        // Métodos getter y setter
        public String getCodigoEnvio() {
            return codigoEnvio;
        }

        public String getDestino() {
            return destino;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        // Método estático para crear un envío
        public static RegistrarEnvio crearEnvio() {
            String codigo = JOptionPane.showInputDialog("Ingrese el código de envío:");
            String destino = JOptionPane.showInputDialog("Ingrese el destino del envío:");
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar el peso del envío?", "Peso", JOptionPane.YES_NO_OPTION);
            
            if (opcion == JOptionPane.YES_OPTION) {
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del envío (en kg):"));
                return new RegistrarEnvio(codigo, destino, peso);
            } else {
                return new RegistrarEnvio(codigo, destino);
            }
        }

        // Método para mostrar información del envío
        public void mostrarInformacion() {
            JOptionPane.showMessageDialog(null, "Código de Envío: " + codigoEnvio + "\nDestino: " + destino + "\nPeso: " + peso + " kg");
        }
    




}

