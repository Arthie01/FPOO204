import java.util.Scanner;

public class Condicionales4_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double num1;
        double num2;
        double suma = 0, resta = 0, multiplicacion = 0, division = 0;
        int operacion;

        System.out.println("CALCULADORA");
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextDouble();
        System.out.print("Ingrese la operacion (1: suma, 2: resta, 3:multiplicacion, 4: division): ");
        operacion = sc.nextInt();

        switch(operacion){

            case 1: 
                suma = num1 + num2;
                System.out.println("La suma es: "+suma);
                break;

            case 2:
                resta = num1 - num2;
                System.out.println("La resta es: "+resta);
                break;

            case 3: 
                multiplicacion = num1 * num2;
                System.out.println("La multiplicacion es: "+multiplicacion);
                break;

            case 4:

                if(num2 == 0){
                    System.out.println("No se puede dividir entre 0");
                }else{
                    division = num1 / num2;
                    System.out.println("La division es: "+division);
                }
                break;

            case 5: 

                System.out.println("La opcion no existe, ingresa otra");
                break;

        }

        sc.close();

    }
    
}
