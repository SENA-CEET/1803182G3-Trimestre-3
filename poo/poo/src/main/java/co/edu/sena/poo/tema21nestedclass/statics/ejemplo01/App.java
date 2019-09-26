package co.edu.sena.poo.tema21nestedclass.statics.ejemplo01;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Clase01 obj1 = new Clase01();
        Clase01.Clase02 obj2 = new Clase01.Clase02();
        Clase01.Clase02.Clase03.Clase04.Clase05 obj5 = new Clase01.Clase02.Clase03.Clase04.Clase05();

        ArrayList arreglo = new ArrayList();
        arreglo.spliterator();
    }
}
