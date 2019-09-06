package co.edu.sena.poo.tema09sobrecargamethods;

public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }

    public int suma2(int a, int b) {
        return a + b;
    }

    public float suma(float a, float b) {
        return a + b;
    }


    public double suma(double a, double b) {
        return a + b;
    }

    public double suma(String a, String b) {
        return Double.parseDouble(a) + Double.parseDouble(b);
    }
}
