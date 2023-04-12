package aula09;

public interface Publicação {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pagina);
    public abstract void avançarPag();
    public abstract void voltarPag();
}
