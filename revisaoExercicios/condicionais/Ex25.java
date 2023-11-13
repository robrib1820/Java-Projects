package testeCorretor;
import java.util.Scanner;
public class Ex25 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println(
                "  -----100 Cachorro quente 1,10/n\r\n" + //
                "  -----101 Bauru simples 1,30\r\n" + //
                "  -----102 Bauru c/ovo 1,50\r\n" + //
                "  -----103 Hamburger 1,10\r\n" + //
                "  -----104 Cheeseburger 1,30\r\n" + //
                "  -----105 Refrigerante 1,00");
        double cachorroQuente = 1.10;
        double bauruSimples = 1.30;
        double bauruOvo = 1.50;
        double hamburger = 1.10;
        double cheeseburger = 1.30;
        double refrigerante = 1.00;

        System.out.println("Digite o código do item que deseja comprar: ");
        int codigo = ler.nextInt();
        System.out.println("Quantos lanches você quer? ");
        int quantidade = ler.nextInt();
        double valorApagar = 0;
        if (codigo == 100) {
            valorApagar = cachorroQuente * quantidade;
        } else if (codigo == 101) {
            valorApagar = bauruSimples * quantidade;
        } else if (codigo == 102) {
            valorApagar = bauruOvo * quantidade;
        } else if (codigo == 103) {
            valorApagar = hamburger * quantidade;
        } else if (codigo == 104) {
            valorApagar = cheeseburger * quantidade;
        } else {
            valorApagar = refrigerante * quantidade;
        }
        System.out.println("Seu lanche vai custar: R$ "+valorApagar);
    }
}
