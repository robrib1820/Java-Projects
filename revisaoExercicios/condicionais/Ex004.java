
package ex004;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salário do colaborador: R$");
        int salario = ler.nextInt();
        int descontoPrevidencia = salario / 10;
        int desconto5Perc = (salario * 5) / 100;
        
        int salarioLiquido = salario - descontoPrevidencia - desconto5Perc;
        
        System.out.println("O salário líquido é: R$"+salarioLiquido+"!");
        
    }

}