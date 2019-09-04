package co.edu.sena.poo.tema04atributos;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class App {
    public static void main(String[] args) {
        Cuadro cuadro = new Cuadro();
        cuadro.setLado(5);
        System.out.println(cuadro.getArea());
        String a = "hola";
        String b = "hola mundo";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(cuadro);

    }
}
