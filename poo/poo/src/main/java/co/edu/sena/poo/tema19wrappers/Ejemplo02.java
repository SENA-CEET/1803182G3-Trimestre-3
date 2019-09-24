package co.edu.sena.poo.tema19wrappers;

public class Ejemplo02 {
    public static void main(String[] args) {
        Integer a = 10;
        int b = (int) a; //unboxing


        int f = 10;
        Integer h = (Integer) f; // boxing

    }


    public static double sumar(String a, String b) {
        return  Double.parseDouble(a)+Double.parseDouble(b);

    }
}
