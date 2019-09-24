package co.edu.sena.poo.tema20realizacion;

import co.edu.sena.poo.tema18polimorfismo.reglasconversiones.Animal;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.caminar();
        p1.escuchar();
        p1.hablar();
        p1.ver();
        p1.comer();
        p1.dormir();
        p1.leerBraille();

        Ciego p2 = new Persona();

        SordoMudo p3 = new Persona();

        Sordo p4 = new Persona();

        Paraplejico p5 = (Paraplejico) p4;

        HumanoInterface p6 = p5;






    }


}
