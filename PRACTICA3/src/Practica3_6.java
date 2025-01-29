import java.util.Scanner;

public class Practica3_6 {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Pedir al usuario la frase

        String frase1 = "";
        String frase2 = "";

        System.out.print("Ingrese frase: ");
        frase1 = sc.nextLine();

        //Invertir la frase

        for(int i = frase1.length() - 1; i>=0; i-- ){

            frase2 = frase2 + frase1.charAt(i);

        }

        System.out.println("La frase invertida del enunciado: " + frase1 + " es: " + frase2);

        sc.close();
  
        
    }
}
