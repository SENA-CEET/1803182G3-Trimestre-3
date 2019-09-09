package co.edu.sena.poo.tema10atributosestaticos;

public class Silla {
    public static int contador =0;
    private String color;

    public Silla(String color) {
        this.color = color;
        this.contador++;
    }
}
