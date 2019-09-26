package co.edu.sena.poo.tema21nestedclass.innerclass.ejemplo02;

public interface InterfaceClase05 {
    public void imprimir();
    public default void imprimir2(){
        System.out.println("este es el metodo imprimir de la interface");
    }

}
