package co.edu.sena.poo.tema08constructores;

public class Cable {
    private String color;
    private float longitud;
    private double diametro;

    public Cable() {
        super();
    }

    public Cable(String color, float longitud, float radio) {
        super();
        this.color = color;
        this.longitud = longitud;
        this.diametro = radio*Math.PI;
    }

    public Cable(String color) {
        this.color = color;
    }

    public Cable(float longitud) {
        this.longitud = longitud;
    }
}
