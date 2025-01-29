import java.util.Scanner;

public class Practica3_2 {
 
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre, apellidoP, apellidoM;


        //Pedir al usuario nombre completo

        System.out.print("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa tu apellido: ");
        apellidoP = sc.nextLine();
        System.out.println("Ingresa tu apellido Materno");
        apellidoM = sc.nextLine();

        //Mostrar al usuario tres veces, uno en minusculas, otro en mayusculas y otro con la primera letra de cada palabra en mayusculas

        System.out.println("Tu nombre en minusculas es: " + nombre.toLowerCase() + " " + apellidoP.toLowerCase() + " " + apellidoM.toLowerCase());
        System.out.println("TU nombre en mayusculas es: " +  nombre.toUpperCase() + " " + apellidoP.toUpperCase() + " " + apellidoM.toUpperCase());
        System.out.println("Primera letra de tu nombre y apellidos: " +  nombre.substring(0, 1).toUpperCase() + apellidoP.substring(0, 1).toUpperCase() + apellidoM.substring(0, 1).toUpperCase());
        

        sc.close();
    }   
}
