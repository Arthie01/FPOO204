import java.util.Scanner;

public class Practica3_4 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedir al usuario que ingrese su nombre

        String nombre; 

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.println(nombre.toUpperCase() + " tiene " + nombre.length() + " letras");

        sc.close();
        
    }
}
