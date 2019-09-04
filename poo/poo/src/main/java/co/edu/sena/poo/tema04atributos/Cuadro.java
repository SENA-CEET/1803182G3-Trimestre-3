package co.edu.sena.poo.tema04atributos;

public class Cuadro {
    private float lado;
    private float area;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
        this.area = this.lado* this.lado;
    }

    public float getArea() {
        return area;
    }


}
