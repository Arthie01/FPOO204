import javax.swing.JOptionPane;

public class Generador {
    //Atributos para generar las contraseñas
    private String longitud;
    private boolean mayusculas;
    private boolean minusculas;

    public Generador(String longitud, boolean mayusculas, boolean minusculas) {
        this.longitud = longitud;
        this.mayusculas = mayusculas;
        this.minusculas = minusculas;
    }
    
    //Metodo para generar contraseña, la longitud debe ser ingresada por el usuario y si no ingresa nada debe ser de longitud 8

    public String generador(String longitud, boolean mayusculas, boolean minusculas){
        longitud = JOptionPane.showInputDialog(null, "Ingrese la longitud de la contraseña");
        if(longitud == null || longitud.isEmpty()){
            longitud = "8";
        }

        int longitudEntero = Integer.parseInt(longitud);
        String contraseña = "";
        int incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Desea incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
        mayusculas = (incluirMayusculas == JOptionPane.YES_OPTION);
    
        
        int incluirEspeciales = JOptionPane.showConfirmDialog(null, "¿Desea incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean especiales = (incluirEspeciales == JOptionPane.YES_OPTION);
    
        String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
        if (mayusculas) {
            caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (especiales) {
            caracteres += "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
        }


        java.util.Random genera = new java.util.Random();
        for (int i = 0; i < longitudEntero; i++){
            int numero = genera.nextInt(caracteres.length());
            contraseña += caracteres.charAt(numero);
        }
        JOptionPane.showMessageDialog(null, "La contraseña generada es: " +  contraseña);
        return contraseña;
    }

    public void comprobarFortaleza(String contraseña){
        int longitud = contraseña.length();
        boolean mayusculas = false;
        boolean minusculas = false;
        boolean numeros = false;
        boolean especiales = false;

            for (int i = 0; i < longitud; i++) {
                char caracter = contraseña.charAt(i);
                if (Character.isUpperCase(caracter)) {
                    mayusculas = true;
                } else if (Character.isLowerCase(caracter)) {
                    minusculas = true;
                } else if (Character.isDigit(caracter)) {
                    numeros = true;
                } else {
                    especiales = true;
                }
            }
        
            if (longitud >= 8 && mayusculas && minusculas && numeros && especiales) {
                JOptionPane.showMessageDialog(null, "La contraseña es fuerte");
            } else if (longitud >= 6 && ((mayusculas && minusculas) || (mayusculas && numeros) || (minusculas && numeros))) {
                JOptionPane.showMessageDialog(null, "La contraseña es media");
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña es débil");
            }
        
        }    
        
    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public boolean isMayusculas() {
        return mayusculas;
    }

    public void setMayusculas(boolean mayusculas) {
        this.mayusculas = mayusculas;
    }

    public boolean isMinusculas() {
        return minusculas;
    }

    public void setMinusculas(boolean minusculas) {
        this.minusculas = minusculas;
    }
    }



