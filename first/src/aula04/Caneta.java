package aula04;

public class Caneta {

    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, String c, float p ) { // Este é o método construtor!
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.Tampar();
        this.cor = "Azul";
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    public void Tampar() {
        this.tampada = true;
    }
    public void Destampar() {
        this.tampada = false;
    }
    
    public void Status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("Tenho uma caneta " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

}
