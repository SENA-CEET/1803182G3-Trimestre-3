package co.edu.sena.poo.tema10atributosestaticos;

public class Conectar {
    public static int conexiones =0;

    private String host;

    public Conectar(String host) {
        this.host = host;
        Conectar.conexiones++;
    }
}
