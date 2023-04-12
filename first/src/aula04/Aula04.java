package aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
        c1.Status();
        System.out.println("--------------------------------");
        Caneta c2 = new Caneta("Trick", "Azul", 2.0f);
        c2.Status();
    };
};
