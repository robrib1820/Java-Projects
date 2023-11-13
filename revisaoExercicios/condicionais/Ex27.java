package testeCorretor;
import java.util.Scanner;
public class Ex27 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salário");
        int salario = ler.nextInt();
        int descPrevidencia = (salario * 11) / 100 ;

        if (descPrevidencia > 318.20) {
            System.out.println("O valor de desconto previdenciário é: R$318,20!");
        } else {
            System.out.println("O valor de desconto previdenciário é: R$"+descPrevidencia+"!");
        }
    }
}
