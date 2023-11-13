
package ex10;
import java.util.Scanner;
public class Ex10{
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        int parafusos = 10;
        int porcas = 15;
        int arruelas = 25;
        
        System.out.println("Bem vindo a loja, qual seu nome? ");
        String nome = ler.nextLine();
        System.out.println("Parafusos: R$ 10,00");
        System.out.println("Porcas: R$ 15,00");
        System.out.println("Arruelas: R$ 25,00");

        System.out.println("Quantos parafusos? ");
        int quantParafusos = ler.nextInt();
        System.out.println("Quantas porcas? ");
        int quantPorcas = ler.nextInt();
        System.out.println("Quantas arruelas? ");
        int quantArruelas = ler.nextInt();

        //valor e desconto - parafuso
        double valorParafuso = parafusos * quantParafusos;
        double descParafusos = (valorParafuso * 10) / 100;
        double totalParafuso = valorParafuso - descParafusos;
        //valor e desconto - porca
        double valorPorca = porcas * quantPorcas;
        double descPorcas = (valorPorca * 20) / 100;
        double totalPorca = valorPorca - descPorcas;
        //valor e desconto - arruela
        double valorArruela = arruelas * quantArruelas;
        double descArruelas = (valorArruela * 30) / 100;
        double totalArruela = valorArruela - descArruelas;

        System.out.println("Nome do comprador: "+nome);
        System.out.println("Comprou "+quantParafusos+" parafusos, "+quantPorcas+" porcas e "+quantArruelas+" arruelas!");
        System.out.println("Total de desconto: R$"+(descParafusos + descPorcas + descArruelas));
        System.out.println("Total da compra: R$"+(totalParafuso + totalPorca + totalArruela));
    }
}
