
package ex002;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int N = ler.nextInt();
        
        if (N <= 10) {
            System.out.println("F1");
        } else if (N > 10 && N <= 100) {
            System.out.println("F2");
        } else {
            System.out.println("F3");
        }
    }
    
}