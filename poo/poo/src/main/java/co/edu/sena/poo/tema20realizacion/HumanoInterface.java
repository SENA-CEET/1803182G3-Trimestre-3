package co.edu.sena.poo.tema20realizacion;

public interface HumanoInterface {
    public default void comer(){
        System.out.println("como");
    }

    public default void dormir(){
        System.out.println("duermo");
    }
}
