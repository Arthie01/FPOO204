
public class Spartan {

    // Atributos de la clase Spartan

    public String nombre;
    int salud;
    int escudo;
    String armaPrincipal;
    
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
}//Llave de la clase Spartan

