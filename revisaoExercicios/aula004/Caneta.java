package aula004;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //toda classe tem um método construtor
    //No caso ele tem o mesmo nome da classe em tipo

    public Caneta() {

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

    //public boolean 

}
