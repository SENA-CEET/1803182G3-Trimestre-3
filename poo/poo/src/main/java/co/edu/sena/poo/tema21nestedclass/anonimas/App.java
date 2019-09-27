package co.edu.sena.poo.tema21nestedclass.anonimas;

public class App {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora() {
            @Override
            public double suma(int a, int b) {
                return a+b;
            }

            @Override
            public double resta(int a, int b) {
                return a-b;
            }

            @Override
            public double multiplicacion(int a, int b) {
                return a*b;
            }

            @Override
            public double division(int a, int b) {
                return a/b;
            }
        };

        System.out.println(c1);
        System.out.println(c1.suma(5,7));
        System.out.println(c1.resta(5,7));
        System.out.println(c1.multiplicacion(5,7));
        System.out.println(c1.division(5,7));
    }

}
