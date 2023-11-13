
package ex005;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome do candidato: ");
        String candidato = ler.nextLine();
        System.out.println("Digite o resultado da prova(Português): ");
        double nota1 = ler.nextDouble();
        System.out.println("Digite o resultado da prova(Matemática): ");
        double nota2 = ler.nextDouble();
        System.out.println("Digite o resultado da prova(Conhecimentos Gerais): ");
        double nota3 = ler.nextDouble();
        double media = (nota1 + nota2+ nota3) / 3;
        
        if (media >= 7.0 && nota1 >=5 && nota2 >=5 && nota3 >=5 ) {
            System.out.println("Candidato Aprovado");
            } else {
                System.out.println("Candidato Reprovado");
            }
        System.out.println("A média foi: "+media);
        
    }

}
