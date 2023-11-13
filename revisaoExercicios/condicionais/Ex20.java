package testeCorretor;
import java.util.Scanner;
public class Ex20 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual a nota do aluno?(de 0 a 100) ");
        int nota = ler.nextInt();
        String conceito = "";
        if (nota <= 49) {
            conceito = "Insuficiente";
        } else if (nota <=64) {
            conceito = "Regular";
        } else if (nota <=84) {
            conceito = "Bom";
        } else {
            conceito = "Ótimo";
        }
        System.out.println("Conceito: "+conceito);
        System.out.println("Nota: "+nota);
    }
}
