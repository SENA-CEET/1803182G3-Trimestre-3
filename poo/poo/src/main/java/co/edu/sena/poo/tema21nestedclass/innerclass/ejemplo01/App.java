package co.edu.sena.poo.tema21nestedclass.innerclass.ejemplo01;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Clase01 ob1 = new Clase01();
        Clase01.Clase02 ob2 = ob1.new Clase02();
        Clase01.Clase02.Clase03 ob3 = ob2.new Clase03();
        Clase01.Clase02.Clase03.Clase04 ob4 = ob3.new Clase04();
        Clase01.Clase02.Clase03.Clase04.Clase05 ob5 = ob4.new Clase05();

    }
}
