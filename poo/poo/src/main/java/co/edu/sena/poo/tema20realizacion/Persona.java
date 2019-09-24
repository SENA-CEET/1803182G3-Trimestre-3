package co.edu.sena.poo.tema20realizacion;

public class Persona implements Ciego, Mudo, Sordo, Paraplejico, SordoMudo {
    @Override
    public void hablar() {
        System.out.println("hablo");
    }

    @Override
    public void ver() {
        System.out.println("veo");
    }

    @Override
    public void escuchar() {
        System.out.println("escucho");
    }

    @Override
    public void caminar() {
        System.out.println("camino");
    }

    @Override
    public void leerBraille() {
        System.out.println("leo braille");
    }


}
