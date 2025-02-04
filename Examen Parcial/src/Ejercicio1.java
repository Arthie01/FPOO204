import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Numeros multiplos de 10 del 10 al 100

        for (int i = 10; i <= 1000; i+=10) {
            System.out.print(i + ", ");

        }


        sc.close();
    }
}
