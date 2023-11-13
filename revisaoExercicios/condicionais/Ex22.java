package testeCorretor;
import java.util.Scanner;
public class Ex22 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = ler.nextLine();
        System.out.println("Categoria: ");
        String categoria = ler.nextLine();
        System.out.println("Salário: ");
        int salario = ler.nextInt();

        if (categoria.equals("A") || categoria.equals("C") || categoria.equals("F") || categoria.equals("H")) {
            int dezPerc = (salario * 10) / 100;
            salario+= dezPerc;
        } else if (categoria.equals("B") || categoria.equals("D") || categoria.equals("E") || categoria.equals("I") || categoria.equals("J") || categoria.equals("T")) {
            int quinPerc = (salario * 15) / 100;
            salario+= quinPerc;
        } else if (categoria.equals("K") || categoria.equals("R")) {
            int vintcPerc = (salario * 25) / 100;
            salario+= vintcPerc;
        } else if (categoria.equals("L") || categoria.equals("M") || categoria.equals("N") || categoria.equals("O") || categoria.equals("P") || categoria.equals("Q") || categoria.equals("S")) {
            int trintcPerc = (salario * 35) / 100;
            salario+= trintcPerc;
        } else {
            int cincPerc = (salario * 50) / 100;
            salario+= cincPerc;
        }
        System.out.println("Nome: "+nome);
        System.out.println("Categoria: "+categoria);
        System.out.println("Salário reajustado: "+salario);
    } 
}
