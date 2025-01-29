import java.util.Scanner;

public class Practica5_4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Introducir numero

        int num;

        System.out.print("Introduce la altura del triangulo ( numero positivo): ");
        num = sc.nextInt();


        //Muestre en pantalla un triangulo rectangulo con el de mas abajo hasta la altura introducida

        for(int i = 1; i <= num; i+=2) {

            for(int j = i; j> 0 ; j-=2){
                    System.out.print(j + " ");   
            
        }

        System.out.println();

    }

    sc.close();
    
}
}
