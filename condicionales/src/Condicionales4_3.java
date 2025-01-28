import java.util.Scanner;

public class Condicionales4_3 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedri edad del usuario

        float edad;

        System.out.print("Edad del usuario: ");
        edad = sc.nextFloat();


        if(edad < 4){
            System.out.print("FELICIDADES! Puedes entrar gratis");
        }
        else if(edad >= 4 && edad <=18){
            System.out.print("Precio por entrada: $110");
        }
        else if(edad > 18){
            System.out.print("Precio por entrada: $190");
        }

        sc.close();
        
    }
}
