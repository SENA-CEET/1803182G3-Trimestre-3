package co.edu.sena.poo.tema18polimorfismo;

public class AvionRescate extends Avion {

    @Override
    public void prender() {
        System.out.println("interruptor");
    }

    public void bajarCamilla(){
        System.out.println("baje la camilla");
    }

    public void subriCamilla(){
        System.out.println("subi la camilla");
    }
}
