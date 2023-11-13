package testeCorretor;
import java.util.Scanner;
import java.lang.Math;
public class Ex16 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = ler.nextInt();

        double quociente = num1 / num2;
        double restoDivisao = num1 % num2;
        System.out.println("O quociente de "+num1+" divido por "+num2+" é "+ quociente);
        System.out.println("O resto da divisão de "+num1+" por "+num2+" é "+ restoDivisao);
    }
}
