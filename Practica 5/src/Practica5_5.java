import java.util.Scanner;

public class Practica5_5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numV;
        String frase;

        System.out.print("Ingrese frase: ");
        frase = sc.nextLine();
        System.out.print("Cuantas veces deseas repetirlo: ");
        numV = sc.nextInt();

        for (int i = 0; i <= numV; i++){
            System.out.println(frase);
        }

        sc.close();


    }
    
}
