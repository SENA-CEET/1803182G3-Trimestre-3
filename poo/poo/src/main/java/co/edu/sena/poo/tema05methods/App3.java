package co.edu.sena.poo.tema05methods;

public class App3 {
    public static void main(String[] args) {
        Numero [] numeros = new Numero[2];
        numeros[0]= new Numero(5);
        numeros[1]= new Numero(8);
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i].getContenido());
        }
        cambiarContenido(numeros);
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i].getContenido());
        }
    }

    public static void cambiarContenido(Numero [] nuevo){
        nuevo[0]= new Numero(1);
        nuevo[1]= new Numero(2);
    }
}
