import java.util.Scanner;

public class Condicionales4_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");

        String palabra = sc.nextLine().toLowerCase();
        String reverso = "";
  
            for(int i = palabra.length()-1; i>= 0;i--){
                reverso = reverso + palabra.charAt(i);

            }  

        if(palabra.equals(reverso)){
            System.out.print("La palabra es palindroma");
        }else{
            System.out.print("La palabra no es palindroma");
        }

        sc.close();
        }     
    }

