import java.util.Scanner;

public class Practica5_1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);


        //Numero positivo

        int num;

        System.out.print("Ingresa un numero: ");
        num = sc.nextInt();

        //Cuenta desde 1 hasta ese numero ingresado, solo muestra impares
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }





        sc.close();

        
        
    }
}
