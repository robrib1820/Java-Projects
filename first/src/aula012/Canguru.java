package aula012;

public class Canguru extends Mamifero {
    @Override
    public void locomover() {
        System.out.println("Saltando");
        usarbolsa();
    }
    public void usarbolsa() {
        System.out.println("Usando bolsa");
    }
}

