package testeCorretor;
import java.util.Scanner;
public class Ex26 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite suas notas em sequência!: ");
        System.out.println("Nota 1: ");
        int num1 = ler.nextInt();
        System.out.println("Nota 2: ");
        int num2 = ler.nextInt();
        System.out.println("Nota 3: ");
        int num3 = ler.nextInt();

        System.out.println("Qual média quer fazer?");
        System.out.println("1 - ARITMÉTICA ou 2 - PONDERADA?");
        int media = ler.nextInt();
        if (media == 1) {
            double mediaAritmética = (num1 + num2 + num3) / 3;
            System.out.println("A média é: "+mediaAritmética);
        } else {
            double mediaPonderada = (num1 * 3) + (num2 * 3) + (num3 * 4) / (3 + 3 + 4);
            System.out.println("A média é: "+mediaPonderada);
        }
    }
}
