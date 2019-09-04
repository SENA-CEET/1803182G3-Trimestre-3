package co.edu.sena.poo.tema04atributos;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class App2 {
    public static void main(String[] args) {
        Cuadro c1 = new Cuadro();
        c1.setLado(6);
        Cuadro c2 = c1;
        Cuadro c3 = c2;
        c3.setLado(10);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);







    }
}
