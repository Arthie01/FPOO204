import java.util.Scanner;

public class Condicionales4_1 {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedir al usuari una contraseña

        String password;
        String password2 = "Hola123";

        System.out.print("Ingrese contraseña: ");
        password = sc.nextLine();


        if(password.equals(password2)){
            System.out.print("Contraseña correcta");
        } else{
            System.out.println("Contraseña incorrecta");
    
        }

        sc.close();
    }
}