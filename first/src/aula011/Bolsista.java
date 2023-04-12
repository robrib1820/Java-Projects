package aula011;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bola de" + " " + this.getNome());
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " " + "É bolsista! Pagamento facilitado!");
    }
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}

