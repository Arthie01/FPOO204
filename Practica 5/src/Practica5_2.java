import java.util.Scanner;

public class Practica5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedir al usuario un numero positivo

        int num;

        System.out.print("Ingresa numero: ");
        num = sc.nextInt();


        for (int i = 1; i <= num; i++){
            System.out.print(i + ", ");
            
        }

        sc.close();


    }
    
}
