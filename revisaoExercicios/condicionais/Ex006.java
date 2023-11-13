
package ex006;
import java.util.Scanner;
import java.lang.Math;
public class Ex006{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = ler.nextInt();
        double soma = num1 + num2;
        double exp = Math.pow(soma, 2);
        System.out.println("O quadrado da soma dos valores lidos é: "+exp+"!");
        
    }

}
