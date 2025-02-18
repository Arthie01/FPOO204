import javax.swing.JOptionPane;

public class Cuenta {

    //Atributos de la cuenta

    public double numeroCuenta;
    String nombre;
    int edad;
    double saldo;
    
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

    


    }

