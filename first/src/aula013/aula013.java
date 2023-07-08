package aula013;
public class aula013 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir(true);
        c.reagir(false);

        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}