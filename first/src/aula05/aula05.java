package aula05;

public class aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        p1.Depositar(100);
        p2.Depositar(500);
        p2.Sacar(100);
        p2.Sacar(1000);
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
