import javax.swing.JOptionPane;

public class Usuario {

    private String nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String añoNacimiento;
    private String carrera;

    public Usuario(String nombre, String apellidoP, String apellidoM, String añoNacimiento, String carrera) {
        this.nombre = nombre;
        this.ApellidoP = apellidoP;
        this.ApellidoM = apellidoM;
        this.añoNacimiento = añoNacimiento;
        this.carrera = carrera;
    }


    public String generadorMatricula(String nombre, String apellidoP, String apellidoM, String añoNacimiento, String carrera) {

        java.util.Random genera = new java.util.Random();
        int numero = genera.nextInt(1000);

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        apellidoP = JOptionPane.showInputDialog(null, "Ingrese su apellido paterno");
        apellidoM = JOptionPane.showInputDialog(null, "Ingrese su apellido materno");
        añoNacimiento = JOptionPane.showInputDialog(null, "Ingrese su Año de Nacimiento");
        carrera = JOptionPane.showInputDialog(null, "Ingrese su carrera");

        String matricula = "";
        matricula += carrera.substring(0, 3);
        matricula += "25";
        matricula += añoNacimiento.substring(2, 4);
        matricula += nombre.substring(0, 1);
        matricula += apellidoP.substring(0, 3);
        matricula += apellidoM.substring(0, 3);
        matricula += numero;
        

        JOptionPane.showMessageDialog(null, "La matricula generada es: " + matricula.toUpperCase());

        return matricula;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoP() {
        return ApellidoP;
    }
    public void setApellidoP(String apellidoP) {
        ApellidoP = apellidoP;
    }
    public String getApellidoM() {
        return ApellidoM;
    }
    public void setApellidoM(String apellidoM) {
        ApellidoM = apellidoM;
    }
    public String getAñoNacimiento() {
        return añoNacimiento;
    }
    public void setAñoNacimiento(String añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
