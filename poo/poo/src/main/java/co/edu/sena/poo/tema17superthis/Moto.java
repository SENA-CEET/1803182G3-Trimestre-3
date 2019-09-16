package co.edu.sena.poo.tema17superthis;

public class Moto {
    private String color;
    private String marca;
    private String placa;
    private String maleta;


    public Moto(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMaleta() {
        return maleta;
    }

    public void setMaleta(String maleta) {
        this.maleta = maleta;
    }
}
