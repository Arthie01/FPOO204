import javax.swing.JOptionPane;

public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor; 


    public Vehiculo(String placa, String modelo, double capacidadCarga) {
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        this.capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo (en kg):"));
        this.conductor = asignarConductor(); 
    }

    // Métodos getter
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public Conductor getConductor() {
        return conductor;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    // Método para asignar un conductor (solo una vez)
    private Conductor asignarConductor() {
        JOptionPane.showMessageDialog(null, "Asignando conductor al vehículo...");
        return new Conductor(null,null,null);
    }

    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Placa: " + placa + "\nModelo: " + modelo + "\nCapacidad de Carga: " + capacidadCarga + " kg" + "\nConductor: " + conductor.getNombre());
    }



    }

