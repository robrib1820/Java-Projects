package testeCorretor;
import java.util.Scanner;
public class Ex28 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual é o saldo média do último ano? (De 0 a 600 / 601...)");
        int saldo = ler.nextInt();
        int credito = 0;
        if (saldo >= 0 && saldo <= 200) {
            System.out.println("Sem crédito disponível para você!");
            
        } else if(saldo > 201 && saldo <= 400) {
            int vintePerc = (saldo * 20) / 100;
            credito = vintePerc;
        } else if (saldo <= 600) {
            int trintaPerc = (saldo * 30) /100;
            credito = trintaPerc;
        } else {
            int quarentaPerc = (saldo * 40) / 100;
            credito = quarentaPerc;
        }
        System.out.println("Saldo médio: R$"+saldo);
        System.out.println("Valor do crédito: R$"+credito);
    } 
}
