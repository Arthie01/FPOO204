import javax.swing.JOptionPane;

public class controlEntrega {

    private String numeroGuia;
    private String estado;
    


    public controlEntrega(String numeroGuia, String estado) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

        public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
