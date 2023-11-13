package testeCorretor;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        double valorPicole1 = 0.50;
        double valorPicole2 = 0.60;
        double valorPicole3 = 0.75;

        System.out.println("Quantos picolés foram vendidos(tipo 1)? ");
        int picole1 = ler.nextInt();
        System.out.println("Quantos picolés foram vendidos(tipo 2)? ");
        int picole2 = ler.nextInt();
        System.out.println("Quantos picolés foram vendidos(tipo 3)? ");
        int picole3 = ler.nextInt();

        if (picole1 > 0 || picole2 > 0 || picole2 > 0) {
            double valorpicole1 = valorPicole1 * picole1; 
            double valorpicole2 = valorPicole2 * picole2; 
            double valorpicole3 = valorPicole3 * picole3;
            int quantVendida = picole1 + picole2 + picole3;
            double valorTotal = valorpicole1 + valorpicole2 + valorpicole3;
            System.out.println("Quantidade vendida: "+quantVendida);
            System.out.println("Valor total: R$"+valorTotal);
        }
    }
}
