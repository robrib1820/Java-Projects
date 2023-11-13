package testeCorretor;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = ler.nextInt();
        System.out.println("Digite um último número: ");
        int num3 = ler.nextInt();
        
        if (num1 < num2 && num1 < num3 && num2 <num3) {
            System.out.println("A ordem dos números: "+num1+","+num2+","+num3);

        } else if (num2 < num1 && num2 < num3 && num1 < num3) {

            System.out.println("A ordem dos números: "+num2+","+num1+","+num3);

        } else if (num3 < num1 && num3 < num2 && num2 < num1) {

            System.out.println("A ordem dos números: "+num3+","+num2+","+num1);

        } else {
            System.out.println("A ordem dos números: "+num3+","+num1+","+num2);
        }
    }

}
