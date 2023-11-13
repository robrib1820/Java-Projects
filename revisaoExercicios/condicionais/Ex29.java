package testeCorretor;
import java.util.Scanner;
public class Ex29 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
            System.out.println("Código do produto Preço unitário\r\n" + //
                    "1001 5,32\r\n" + //
                    "1324 6,45\r\n" + //
                    "6548 2,37\r\n" + //
                    "0987(colocar 1987) 5,32\r\n" + //
                    "7623 6,45");
                    double P1001 = 5.32;
                    double P1324 = 6.45;
                    double P6548 = 2.37;
                    double P0987 = 5.32;
                    double P7623 = 6.45;
        System.out.println("Que produto você quer comprar? ");
        int produto = ler.nextInt();
        System.out.println("Qual a quantidade? ");
        int quantidade = ler.nextInt();
        double total = 0;
        if (produto == 1001) {
            total = P1001 * quantidade;
        } else if (produto == 1324) {
           total = P1324 * quantidade;
        } else if (produto == 6548) {
            total = P6548 * quantidade;
        // } else if (produto == 0987) {
        //     total = P0987 * quantidade;
        } else if (produto == 1987) {
            total = P0987 * quantidade;
        }else {
            total = P7623 * quantidade;
        }
        System.out.println("Produto: "+ produto);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Valor total: "+total);
    }
}