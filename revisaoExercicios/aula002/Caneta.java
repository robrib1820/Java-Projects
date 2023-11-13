package aula002;

public class Caneta {
    /*Atributos que esse objeto caneta tem como modelo, cor, se abre ou fecha
    Tamanho da ponta e quanto de tinta ela tem...*/
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //Vamos criar alguns métodos, ou coisas que esse objeto pode fazer

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + " " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}