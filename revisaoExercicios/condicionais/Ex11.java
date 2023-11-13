package ex11;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int salario = 2640;
        int comissaoVendas = 50;

        System.out.println("Quantos carros você vendeu esse mês? ");
        int carroVendido = ler.nextInt();
        //valor de comissão por quantidade de carros vendidos
        int comissao = comissaoVendas * carroVendido;
        System.out.println("Qual o valor total dos carros? ");
        double valorCarros = ler.nextDouble();

        double cincoPerc = (valorCarros * 5) / 100;
        double salarioTotal = salario + comissao + cincoPerc;

        System.out.println("O salário do funcionário é: R$"+ salarioTotal+"!");

}

}
