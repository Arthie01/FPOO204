import java.util.Scanner;

public class Practica5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedir al usuario la tabla de multiplicar;

        int num;

        System.out.print("Ingrese tabla de multiplicar que se desea: ");
        num = sc.nextInt();

        //Tabla de multiplicar

        for(int i = 1; i<= num; i++){
            System.out.println(i + " * " + num + " = " + i * num);
        }

        sc.close();


    }
    
}
