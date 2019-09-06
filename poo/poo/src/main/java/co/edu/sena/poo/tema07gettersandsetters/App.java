package co.edu.sena.poo.tema07gettersandsetters;

public class App {
    public static void main(String[] args) {
        Billetera b1 = new Billetera();
        b1.setColor("roja");
        System.out.println(b1.getColor());
        System.out.println(b1.getBolsillos());
    }
}
