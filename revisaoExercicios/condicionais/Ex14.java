
package ex14;

import java.util.Scanner;
import java.lang.Math;
public class Ex14 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        double quadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);

        System.out.println("O quadrado de "+num+" é "+quadrado);
        System.out.println("O cubo de "+num+" é "+cubo);
}

}
