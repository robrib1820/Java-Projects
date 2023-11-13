package testeCorretor;
import java.util.Scanner;
public class Ex30 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = ler.nextLine();
        System.out.println("Qual sua idade? ");
        int idade = ler.nextInt();
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        if (idade <= 10) {
            System.out.println("Categoria: Infantil!");
        } else if (idade <=15) {
            System.out.println("Categoria Juvenil!");
        } else if (idade <= 20) {
            System.out.println("Categoria Júnior!");
        } else {
            System.out.println("Categoria Profissional!");
        }
    } 
}
