
package ex008;
import java.util.Scanner;
public class Ex008{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número(A): ");
        int A = ler.nextInt();
        System.out.println("Digite um número(B): ");
        int B = ler.nextInt();
        System.out.println("Digite um número(C): ");
        int C = ler.nextInt();
        int soma = A + B;
        
        if (soma >= C) {
            System.out.println("A soma de "+A+"+"+B+" é maior ou igual a "+C+"!");
        } else {
            System.out.println("A soma de "+A+"+"+B+" é menor que "+C+"!");
        }
        
    }

}
