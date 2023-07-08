package aula14;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String Sexo, String login) {
        super(nome, idade, Sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nLogin=" + login + ", Total Assistido=" + totAssistido + '}';
    }
}
