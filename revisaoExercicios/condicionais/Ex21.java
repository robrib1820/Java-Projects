package testeCorretor;
import java.util.Scanner;
public class Ex21 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = ler.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é o: "+num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é o: "+num2);
        }
    } 
}
