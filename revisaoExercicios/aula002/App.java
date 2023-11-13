package aula002;

public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Vermelho";
        c1.ponta = 0.5f;
        c1.modelo = "BIC";
        c1.status();

        Caneta c2 = new Caneta();
        c2.cor = "Azul";
        c2.ponta = 2.0f;
        c2.carga = 10;
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
}