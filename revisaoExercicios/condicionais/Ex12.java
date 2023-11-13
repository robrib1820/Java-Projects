package ex12;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo a loja de artigos!");
        System.out.println("Qual seu nome? ");
        String nome = ler.nextLine();
        System.out.println("Flores: R$ 30,00");
        System.out.println("Quadros: R$ 90,00");
        System.out.println("Abajur: R$ 150,00");
        System.out.println("Pratos: R$ 45,00");
        int flor = 30;
        int quadro = 90;
        int abajur = 150;
        int prato = 45;

        System.out.println("Quantas flores? ");
        int quantFlores = ler.nextInt();
        System.out.println("Quantos quadros? ");
        int quantQuadros = ler.nextInt();
        System.out.println("Quantos abajures? ");
        int quantAbajures= ler.nextInt();
        System.out.println("Quantos pratos? ");
        int quantPratos = ler.nextInt();
        //valor e desconto - flor
        double valorFlor = flor * quantFlores;
        double descFlor = (valorFlor * 6) / 100;
        double totalFlor = valorFlor - descFlor;
        //valor e desconto - quadro
        double valorQuadro = quadro * quantQuadros;
        double descQuadro = (valorQuadro * 10) / 100;
        double totalQuadro = valorQuadro - descQuadro;
        //valor e desconto - abajur
        double valorAbajur = abajur * quantAbajures;
        double descAbajur = (valorAbajur * 8) / 100;
        double totalAbajur = valorAbajur - descAbajur;
        //valor e desconto - prato
        double valorPrato = prato * quantPratos;
        double descPrato = (valorPrato * 3) / 100;
        double totalPrato = valorPrato - descPrato;

        double total = totalFlor + totalQuadro + totalAbajur + totalPrato;
        System.out.println("Nome do comprador: "+nome);
        System.out.println("Quantidade flor: "+quantFlores+" Valor total: R$ "+valorFlor+ " Valor final: R$ "+totalFlor);
        System.out.println("Quantidade quadro: "+quantQuadros+" Valor total: R$ "+valorQuadro+ " Valor final: R$ "+totalQuadro);
        System.out.println("Quantidade abajur: "+quantAbajures+" Valor total: R$ "+valorAbajur+ " Valor final: R$ "+totalAbajur);
        System.out.println("Quantidade prato: "+quantPratos+" Valor total: R$ "+valorPrato+ " Valor final: R$ "+totalPrato);
        System.out.println("Valor total da compra: R$ "+total+"!");
}

}
