package co.edu.sena.poo.tema10atributosestaticos;

public class App {
    public static void main(String[] args) {
        Conectar c1 = new Conectar("localhost");
        Conectar c2 = new Conectar("192.168.3.1");
        Conectar.conexiones++;

        System.out.println(Conectar.conexiones);
        System.out.println(c1.conexiones); // se puede hacer pero no se debe
        System.out.println(c2.conexiones);

        Silla s1 = new Silla("cafe");
        Silla s2 = new Silla("cafe");
        Silla s3 = new Silla("cafe");
        System.out.println(Silla.contador);


    }
}
