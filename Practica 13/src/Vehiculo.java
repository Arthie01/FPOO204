import javax.swing.JOptionPane;

public class Vehiculo {

    private String placa;
    private String modelo;
    private String capacidadCarga;
    private Conductor conductor;

    public Vehiculo(String placa, String modelo, String capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }


        public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Conductor getConductor() {
        return conductor;
    }


    public void asignarConductor(Conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
            JOptionPane.showMessageDialog(null, "Conductor asignado correctamente.");
        } else if (this.conductor.getNombre().equals(conductor.getNombre())) {
            JOptionPane.showMessageDialog(null, "Este conductor ya está asignado a este vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Este vehículo ya tiene un conductor asignado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }





    }

