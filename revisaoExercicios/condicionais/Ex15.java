package testeCorretor;

import java.util.Scanner;
import java.lang.Math;
public class Ex15 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int valorDiaria = 60;
        double taxaDeServico = 0;
        System.out.println("Qual seu nome? ");
        String nome = ler.nextLine();
        System.out.println("Quantos dias você vai ficar no hotel? ");
        int dias = ler.nextInt();

        if (dias < 15) {
            taxaDeServico = 5.50;
        } else if (dias == 15) {
            taxaDeServico = 6;
        } else {
            taxaDeServico = 8;
        }
        double valorTotal = (valorDiaria + taxaDeServico) * dias;

        System.out.println("Nome: "+nome);
        System.out.println("Valor da hospedagem: "+valorTotal);
    }
}
