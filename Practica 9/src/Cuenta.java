import javax.swing.JOptionPane;

public class Cuenta {

    //Atributos de la cuenta

    private double numeroCuenta;
    private String nombre;
    private int edad;
    private double saldo;

    public Cuenta(double numeroCuenta, String nombre, int edad, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }
  
    //Metodos de cuenta

    //consultar saldo
    public double consultarSaldo(){
        JOptionPane.showMessageDialog(null, "Saldo: " + saldo, "Consulta de Saldo", JOptionPane.INFORMATION_MESSAGE);
        return saldo;
    }

    public void depositar(double monto){
        saldo += monto;
        JOptionPane.showMessageDialog(null, "Depoisto exitoso", "Depositar", JOptionPane.YES_OPTION);
    }

    public void retirar(double monto){

        if(saldo>= monto){
            saldo-=monto;
            JOptionPane.showMessageDialog(null, "Retiro exitoso", "Retiro", JOptionPane.YES_OPTION);
        } else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Retiro", JOptionPane.NO_OPTION);
        }
    }

    public void transferir(double monto, Cuenta cuentaDestino){
        if(saldo >= monto){
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Transferencia exitosa", "Transferencias", JOptionPane.YES_OPTION);
            
        } else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Transeferencias", JOptionPane.NO_OPTION);
        }
        
    }        
    
    public double getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(double numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    }

