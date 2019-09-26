package co.edu.sena.poo.tema21nestedclass.statics.ejemplo02;

public class App {
    public static void main(String[] args) {
        Clase01 obj1 = new Clase01();
        InterfaceClase02 obj2 = Clase01.getClase2();

        InterfaceClase05 obj5 =  Clase01.Clase02.Clase03.Clase04.getClase05();

    }
}
