package co.edu.sena.poo.tema11atributofinal;

public class App {
    public static void main(String[] args) {
        Matematica m1 = new Matematica();
        int resultado = m1.sumar(4,6);

        System.out.println(Matematica.VELOCIDAD_LUZ);
        System.out.println(Math.PI);
        System.out.println(Math.E);

        final int CONSTATE = 10;
        System.out.println(CONSTATE);


    }
}
