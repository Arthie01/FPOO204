import java.util.Scanner;

public class Practica3_1 {
    public static void main(String[] args) throws Exception {
        //Preguntar al usuario por coste de horas y horas trabajadas

        double costeHora = 0, horasTrabajadas = 0, salario = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el coste por hora: ");
        costeHora = sc.nextDouble();
        System.out.print("Introduce las horas trabajadas: ");
        horasTrabajadas = sc.nextDouble();

        salario = costeHora * horasTrabajadas;

        System.out.println("Tu pago correspondiete es de: " + salario + " pesos");

        sc.close();
        
    }
}
