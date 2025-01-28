import java.util.Scanner;

public class Condicionales4_2 {
    public static void main(String[] args) {
        //Par o impar

        Scanner sc =  new Scanner(System.in);

        int numero = 0;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if(numero % 2 ==0){
            System.out.print("El numero es par");
        }else{
            System.out.print("Numero impar");
        }

        sc.close();
    }
}
