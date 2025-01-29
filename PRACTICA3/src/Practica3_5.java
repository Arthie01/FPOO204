import java.util.Scanner;

public class Practica3_5 {
 
    
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedir payasos y muñecas al usario

        int peso;
        int payaso, muñeca;

        System.out.print("Payasos en el paquete: ");
        payaso = sc.nextInt();
        System.out.print("Muñecas en el paquete: ");
        muñeca = sc.nextInt();


        //Pedir al usuario cuantos payasos y muñecas van en ese pedido

        peso = ((payaso *112) + (muñeca *75));

        System.out.println("En el paquete van: " + payaso + " payaso(s) y " + muñeca + " muñeca(s) y tiene un peso de: " + peso + " gramos" );

        sc.close();
        
    }
}
