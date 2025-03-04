import javax.swing.JOptionPane;

public class controlEntrega {
    private String numeroGuia;
    private String estado;

    // Constructor
    public controlEntrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    // Método para actualizar el estado
    public void actualizarEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito/Entregado):");
        if (nuevoEstado.equalsIgnoreCase("En tránsito") || nuevoEstado.equalsIgnoreCase("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Estado inválido. Solo se permite 'En tránsito' o 'Entregado'.");
        }
    }

    // Método para mostrar información de la entrega
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Número de Guía: " + numeroGuia + "\nEstado: " + estado);
    }
}

