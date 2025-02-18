import javax.swing.JOptionPane;


public class CuentaPrincipal {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta();
        int op;


        cuenta1.numeroCuenta = 123456789;
        cuenta1.nombre = "Artemio";
        cuenta1.edad = 20;
        cuenta1.saldo = 500;


        cuenta2.numeroCuenta = 223456789;
        cuenta2.nombre = "Joaquin";
        cuenta2.edad = 20;
        cuenta2.saldo = 30000;


        //Creacion de menu

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n1. Consultar saldo\n2. Ingresar efectivo\n3. Retirar efectivo\n4. Transferencia\n5. Salir", "Menu", JOptionPane.INFORMATION_MESSAGE));

            switch (op) {
                case 1:
                    double cuenta = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta", "Consulta de saldo", JOptionPane.INFORMATION_MESSAGE));
                    if(cuenta == cuenta1.numeroCuenta || cuenta == cuenta2.numeroCuenta){
                        if(cuenta == cuenta1.numeroCuenta){
                            cuenta1.consultarSaldo();
                        } else{
                            cuenta2.consultarSaldo();
                            }
                    }else{
                        JOptionPane.showMessageDialog(null, "Cuenta no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 2:
                    double cuentaIngresar = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta", "Ingresar efectivo", JOptionPane.INFORMATION_MESSAGE));
                    if(cuentaIngresar == cuenta1.numeroCuenta || cuentaIngresar == cuenta2.numeroCuenta){

                        double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a depositar", "Ingresar efectivo", JOptionPane.INFORMATION_MESSAGE));
                        if(cuentaIngresar == cuenta1.numeroCuenta){
                            cuenta1.depositar(monto);
                        } else{
                            cuenta2.depositar(monto);
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Cuenta no encontrada", "Depositar", JOptionPane.NO_OPTION);
                    }
                    break;
                
                case 3:
                double cuentaRetirar = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta", "Retirar efectivo", JOptionPane.INFORMATION_MESSAGE));
                if(cuentaRetirar == cuenta1.numeroCuenta || cuentaRetirar == cuenta2.numeroCuenta){
                    double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a retirar", "Retirar efectivo", JOptionPane.INFORMATION_MESSAGE));
                    if(cuentaRetirar == cuenta1.numeroCuenta){
                        cuenta1.retirar(monto);
                    }else{
                        cuenta2.retirar(monto);
                    }
                }
                break;

                case 4:

                    double cuentaOrigen = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta origen", "Transferencia", JOptionPane.INFORMATION_MESSAGE));
                    double cuentaDestino = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta destino", "Transferencia", JOptionPane.INFORMATION_MESSAGE));
                    if(cuentaOrigen == cuenta1.numeroCuenta || cuentaOrigen == cuenta2.numeroCuenta){
                        if(cuentaDestino == cuenta1.numeroCuenta || cuentaDestino == cuenta2.numeroCuenta){
                            double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a transferir", "Transferencia", JOptionPane.INFORMATION_MESSAGE));
                            if(cuentaOrigen == cuenta1.numeroCuenta){
                                cuenta1.transferir(monto, cuenta2);
                            } else{
                                cuenta2.transferir(monto, cuenta1);
                            }
                        } else{
                            JOptionPane.showMessageDialog(null, "Cuenta destino no encontrada", "Transferencia", JOptionPane.NO_OPTION);
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Cuenta origen no encontrada", "Transferencia", JOptionPane.NO_OPTION);
                    }

                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo de las cuentas", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
                    break;        
            }
        } while(op != 5);
    }

}



