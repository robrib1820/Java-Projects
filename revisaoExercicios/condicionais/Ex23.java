package testeCorretor;
import java.util.Scanner;
public class Ex23 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Primeira nota do aluno: ");
        int nota1 = ler.nextInt();
        System.out.println("Segunda nota do aluno: ");
        int nota2 = ler.nextInt();
        System.out.println("Terceira nota do aluno: ");
        int nota3 = ler.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 7 && media >=4) {
            System.out.println("Em prova final!");
        } else {
            System.out.println("Reprovado!");
        }
        System.out.println("A média do aluno é: "+media+"!");
} 
}
