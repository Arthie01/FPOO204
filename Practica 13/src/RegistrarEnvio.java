import javax.swing.JOptionPane;

public class RegistrarEnvio {
    private String codigoEnvio;
    private String destino;
    private String peso;
    
    public RegistrarEnvio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }

    public RegistrarEnvio(String codigoEnvio, String destino, String peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public void crearEnvio(int opcion){
        codigoEnvio = JOptionPane.showInputDialog("Ingresar el codigo del envio");
        destino = JOptionPane.showInputDialog("Ingrese el destino");
        opcion = JOptionPane.showOptionDialog(null, "Desea agregar peso", "Agregar Peso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(opcion == JOptionPane.YES_OPTION){
            peso = JOptionPane.showInputDialog("Ingrese el peso del envio");
            JOptionPane.showMessageDialog(null, "Envio registrado correctament");
        }else{
            JOptionPane.showMessageDialog(null, "Envio registrado correctament");

        }
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    




}
