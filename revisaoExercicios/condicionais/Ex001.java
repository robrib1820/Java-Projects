
package ex001;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = ler.nextInt();
        
        if (num1 > num2){
            System.out.println("O número maior é "+num1);
        } else {
            System.out.println("O número maior é "+num2);
        }
    }
    
}
