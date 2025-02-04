import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicitar numero al usuario

        int num;
        
        System.out.println("Bienvenido a la serie de Collatz");
        System.out.print("Ingresa numero: ");
        num = sc.nextInt();


        //Serie de Collatz

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
            System.out.print(num + ", ");
        }

        sc.close();


    }
    
}
