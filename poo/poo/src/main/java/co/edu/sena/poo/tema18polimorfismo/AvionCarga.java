package co.edu.sena.poo.tema18polimorfismo;

public class AvionCarga extends Avion {
    @Override
    public void prender() {
        System.out.println("llave");
    }

    public void subirCarga(){
        System.out.println("recoge la carga");
    }

    public void dejarCarga(){
        System.out.println("ahi le va carga");
    }
}
