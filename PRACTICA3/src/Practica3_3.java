import java.util.Scanner;

public class Practica3_3 {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedir al usuario que ingrese un numero entero

        int x = 0;
        int suma = 0;

        System.out.print("Ingrese un numero entero hastas el cual desee sumar: ");
        x = sc.nextInt();

        //Sumar todos los numeros desde el 1 hasta x

        for(int i = 1; i<=x; i++){
            
            suma += i;
            System.out.println("La suma acumulada hasta " + i + " es: " + suma);
            
        }

        sc.close();

        
    }
}
