
public class Spartan {

    // Atributos de la clase Spartan

    private String nombre;
    private int salud;
    private int escudo;
    private String armaPrincipal;

    public Spartan(String nombre, int salud, int escudo, String armaPrincipal) {
        this.nombre = nombre;
        this.salud = salud;
        this.escudo = escudo;
        this.armaPrincipal = armaPrincipal;
    }

    //Metodos del spartan
    public void mostrarInfo(){
        System.out.println("-------------------Información del Spartan-------------------------------");
        System.out.println("Nombre del Spartan: " + nombre);
        System.out.println("Salud: " + salud);
        System.out.println("Escudo: " + escudo);
        System.out.println("Arma principal: " + armaPrincipal);
        System.out.println("-------------------------------------------------------------------------");
    }

    public void atacarEnemigo(String enemigo){
        System.out.println("El Spartan " + nombre + " ataca al " + enemigo + " con su " + armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restante = 10;
        int total = restante + municiones;
        System.out.println("El arma " + armaPrincipal + " tiene " + total + " balas");
    }

    public void correr(boolean status){
        if(status){
            System.out.println("El Spartan " + nombre + " esta corriendo");
        } else{
            System.out.println("El Spartan " + nombre + " se detuvo");
        }
    }    

    private void consultarCortana(){
        System.out.println("Conversación privada.....");
    }
    
    
    //Zona de get y set
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }



}//Llave de la clase Spartan

