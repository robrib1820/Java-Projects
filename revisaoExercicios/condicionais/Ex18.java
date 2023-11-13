package testeCorretor;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = ler.nextInt();
        System.out.println("Digite um último número: ");
        int num3 = ler.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("O menor número é o: "+num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O menor número é o: "+num2);
        } else {
            System.out.println("O menor número é o: "+num3);
        }


    }
}
