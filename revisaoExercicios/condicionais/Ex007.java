
package ex007;
import java.util.Scanner;
import java.lang.Math;
public class Ex007{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = ler.nextInt();
        double exp1 = Math.pow(num1, 2);
        double exp2 = Math.pow(num2, 2);
        double soma = exp1 + exp2;
        System.out.println("A soma do quadrado de"+num1+" mais a soma do quadrado de"+num2+" é "+soma+"!");
        
    }

}
