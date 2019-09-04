package co.edu.sena.poo.tema04atributos;

public class App3 {
    public static void main(String[] args) {
        Integer a =5;
        Integer b =a;
        Integer c =b;
        c=10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Numero n1 = new Numero(5);
        Numero n2 = n1;
        Numero n3 = n2;
        n3.setContenido(10);
        System.out.println("---------------------------");
        System.out.println(n1.getContenido());
        System.out.println(n2.getContenido());
        System.out.println(n3.getContenido());

        String numero = "5";
        Integer numero2 = Integer.parseInt(numero);
        int numero3 = numero2;

        String asdf= "r";
        char io = asdf.charAt(0);

        System.out.println("hola mundo".charAt(5));









    }
}
