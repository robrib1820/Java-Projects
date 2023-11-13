package testeCorretor;
import java.util.Scanner;
public class Ex24 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();

        if (num1 % 2 == 0) {
            if (num1 > 0) {
                System.out.println("Este número é Par e Positivo");
            } else {
                System.out.println("Este número é Par e Negativo");
            }
        } else {
            if (num1 < 0) {
                System.out.println("Este número é Ímpar e Negativo");
            } else {
                System.out.println("Este número é Ímpar e Positivo");
            }
        }
    } 

}
