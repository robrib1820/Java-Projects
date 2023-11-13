
package ex003;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o resultado da primeira prova(peso 2): ");
        double nota1 = ler.nextDouble();
        System.out.println("Digite o resultado da segunda prova(peso 3): ");
        double nota2 = ler.nextDouble();
        System.out.println("Digite o resultado da terceira prova(peso 5): ");
        double nota3 = ler.nextDouble();
        
        double media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
        double mediaPonderada = media / (2 + 3 + 5);
        
        System.out.println("A média do aluno é: "+mediaPonderada+"!");
    }   
    
}
