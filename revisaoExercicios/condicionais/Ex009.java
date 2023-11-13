
package ex009;
import java.util.Scanner;
public class Ex009{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Corretor: ");
        String nomeCorretor1 = ler.next();
        System.out.println("Corretor "+nomeCorretor1+" - (valor de vendas): R$");
        double vendasCorretor1 = ler.nextDouble();
        
        System.out.println("Corretor: ");
        String nomeCorretor2 = ler.next();
        System.out.println("Corretor "+nomeCorretor2+" - (valor de vendas): R$");
        double vendasCorretor2 = ler.nextDouble();
        
        System.out.println("Corretor: ");
        String nomeCorretor3 = ler.next();
        System.out.println("Corretor "+nomeCorretor3+" - (valor de vendas): R$");
        double vendasCorretor3 = ler.nextDouble();

        double dozePer = 0;
        if (vendasCorretor1 > 5000000) {
                dozePer = (vendasCorretor1 * 12) / 100;
            } else if (vendasCorretor1 >= 3000000 && vendasCorretor1 <= 5000000) {
                dozePer = (vendasCorretor1 * 9.5) / 100;
            } else {
                dozePer = (vendasCorretor1 * 7) / 100;
            }
        if (vendasCorretor2 > 5000000) {
                dozePer = (vendasCorretor2 * 12) / 100;
            } else if (vendasCorretor2 >= 3000000 && vendasCorretor2 <= 5000000) {
                dozePer = (vendasCorretor2 * 9.5) / 100;
            } else {
                dozePer = (vendasCorretor2 * 7) / 100;
            }
        if (vendasCorretor1 > 5000000) {
                dozePer = (vendasCorretor3 * 12) / 100;
            } else if (vendasCorretor3 >= 3000000 && vendasCorretor3 <= 5000000) {
                dozePer = (vendasCorretor3 * 9.5) / 100;
            } else {
                dozePer = (vendasCorretor3 * 7) / 100;
            }
        System.out.println("Corretor: "+nomeCorretor1);
        System.out.println("Valor da venda: "+vendasCorretor1);
        System.out.println("Valor da comissão: "+ dozePer);

        System.out.println("Corretor: "+nomeCorretor2);
        System.out.println("Valor da venda: "+vendasCorretor2);
        System.out.println("Valor da comissão: "+ dozePer);

        System.out.println("Corretor: "+nomeCorretor3);
        System.out.println("Valor da venda: "+vendasCorretor3);
        System.out.println("Valor da comissão: "+ dozePer);
        
        // int contador = 0;
        // while (contador <=2) {
        //     System.out.println("Corretor: ");
        //     String nomeCorretor1 = ler.nextLine();
        //     System.out.println("Corretor "+nomeCorretor1+" - (valor de vendas): R$");
        //     double vendasCorretor1 = ler.nextDouble();

        //     double dozePer = 0;

        //     if (vendasCorretor1 > 5000000) {
        //         dozePer = (vendasCorretor1 * 12) / 100;
        //     } else if (vendasCorretor1 >= 3000000 && vendasCorretor1 <= 5000000) {
        //         dozePer = (vendasCorretor1 * 9.5) / 100;
        //     } else {
        //         dozePer = (vendasCorretor1 * 7) / 100;
        //     }
        //     contador++;
        // }
    }
}