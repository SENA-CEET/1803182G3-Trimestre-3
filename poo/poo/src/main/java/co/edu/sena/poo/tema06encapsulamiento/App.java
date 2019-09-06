package co.edu.sena.poo.tema06encapsulamiento;

public class App {
    public static void main(String[] args) {
        Marcador m1 = new Marcador("pelicano");
        System.out.println(m1);
        m1= new Marcador("faber castel");
        System.out.println(m1);
        System.out.println(m1.getMarca());

    }
}
