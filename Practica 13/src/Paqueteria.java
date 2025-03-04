import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Paqueteria {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<Conductor> conductores = new ArrayList<>();
        ArrayList<RegistrarEnvio> envios = new ArrayList<>();
        ArrayList<controlEntrega> entregas = new ArrayList<>();

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Menú Principal:\n" +
                "1. Registrar Conductor\n" +
                "2. Registrar Vehículo\n" +
                "3. Editar Vehículo\n" +
                "4. Editar Conductor\n" +
                "5. Registrar Envío\n" +
                "6. Control de Entregas\n" +
                "7. Mostrar Información del Vehículo\n" +
                "8. Mostrar Información del Conductor\n" +
                "9. Salir\n" +
                "Ingrese una opción:");

            switch (opcion) {
                case "1":
                    String nombreConductor = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    Conductor nuevoConductor = new Conductor(null, null, null);
                    conductores.add(nuevoConductor);
                    JOptionPane.showMessageDialog(null, "Conductor registrado exitosamente.");
                    break;
                case "2":
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    String capacidadCarga = JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo:");
                    Vehiculo nuevoVehiculo = new Vehiculo(null, null, 0);
                    vehiculos.add(nuevoVehiculo);
                    JOptionPane.showMessageDialog(null, "Vehículo registrado exitosamente.");
                    break;
                case "3":
                    if (!vehiculos.isEmpty()) {
                        String nuevaPlaca = JOptionPane.showInputDialog("Ingrese la nueva placa del vehículo:");
                        String nuevoModelo = JOptionPane.showInputDialog("Ingrese el nuevo modelo del vehículo:");
                        double nuevaCapacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nueva capacidad de carga del vehículo (kg):"));
                        vehiculos.get(0).setPlaca(nuevaPlaca);
                        vehiculos.get(0).setModelo(nuevoModelo);
                        vehiculos.get(0).setCapacidadCarga(nuevaCapacidad);
                        JOptionPane.showMessageDialog(null, "Vehículo actualizado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vehículos registrados.");
                    }
                    break;
                case "4":
                    if (!conductores.isEmpty()) {
                        String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del conductor:");
                        conductores.get(0).setNombre(nuevoNombre);
                        JOptionPane.showMessageDialog(null, "Conductor actualizado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay conductores registrados.");
                    }
                    break;
                case "5":
                    RegistrarEnvio nuevoEnvio = RegistrarEnvio.crearEnvio();
                    envios.add(nuevoEnvio);
                    JOptionPane.showMessageDialog(null, "Envío registrado exitosamente.");
                    break;
                case "6":
                    if (!envios.isEmpty()) {
                        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía:");
                        controlEntrega nuevaEntrega = new controlEntrega(numeroGuia);
                        nuevaEntrega.actualizarEstado();
                        entregas.add(nuevaEntrega);
                        JOptionPane.showMessageDialog(null, "Estado de entrega actualizado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay envíos registrados.");
                    }
                    break;
                case "7":
                    if (!vehiculos.isEmpty()) {
                        String placaVehiculoInfo = JOptionPane.showInputDialog("Ingrese la placa del vehículo para mostrar información:");
                        Vehiculo vehiculoInfo = vehiculos.stream().filter(v -> v.getPlaca().equals(placaVehiculoInfo)).findFirst().orElse(null);
                        if (vehiculoInfo != null) {
                            JOptionPane.showMessageDialog(null, "Placa: " + vehiculoInfo.getPlaca() + "\nModelo: " + vehiculoInfo.getModelo() + "\nCapacidad de Carga: " + vehiculoInfo.getCapacidadCarga());
                        } else {
                            JOptionPane.showMessageDialog(null, "Vehículo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vehículos registrados.");
                    }
                    break;
                case "8":
                    if (!conductores.isEmpty()) {
                        String nombreConductorInfo = JOptionPane.showInputDialog("Ingrese el nombre del conductor para mostrar información:");
                        Conductor conductorInfo = conductores.stream().filter(c -> c.getNombre().equals(nombreConductorInfo)).findFirst().orElse(null);
                        if (conductorInfo != null) {
                            JOptionPane.showMessageDialog(null, "Nombre: " + conductorInfo.getNombre());
                        } else {
                            JOptionPane.showMessageDialog(null, "Conductor no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay conductores registrados.");
                    }
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        }
    }
}