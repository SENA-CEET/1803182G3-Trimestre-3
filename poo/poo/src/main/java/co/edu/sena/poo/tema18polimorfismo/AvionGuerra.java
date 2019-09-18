package co.edu.sena.poo.tema18polimorfismo;

public class AvionGuerra extends Avion {
    @Override
    public void prender() {
        System.out.println("huella digital");
    }

    public void dispararAmetralladora(){
        System.out.println("bin bin bin");
    }

    public void dispararMisil(){
        System.out.println("bommm!");
    }
}
