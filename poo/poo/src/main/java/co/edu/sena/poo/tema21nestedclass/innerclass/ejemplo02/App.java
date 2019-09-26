package co.edu.sena.poo.tema21nestedclass.innerclass.ejemplo02;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Clase01 obj1 = new Clase01();
        InterfaceClase02 obj2 = obj1.getClase02();
        InterfaceClase03 obj3 = obj2.getClase03();
        InterfaceClase04 obj4 = obj3.getClase04();
        InterfaceClase05 obj5 = obj4.getClase05();
        obj5.imprimir();
        obj5.imprimir2();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj4);

    }
}
