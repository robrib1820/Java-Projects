package ex13;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Número da conta: ");
        int numConta = ler.nextInt();
        System.out.println("Saldo da conta:");
        int saldoConta = ler.nextInt();
        System.out.println("Tipo de operação(1 - Depósito | 2 - Retirada): ");
        int operaçao = ler.nextInt();
        System.out.println("Valor da operação: ");
        int valorOperacao = ler.nextInt();

        if (operaçao == 1) {
            saldoConta += valorOperacao;
            System.out.println("Saldo da conta: R$"+saldoConta);
        } else {
            saldoConta-= valorOperacao;
            System.out.println("Saldo da conta: R$"+saldoConta);
        }
        if (saldoConta < 0) {
            System.out.println("Conta Estourada!");
        }

}

}
