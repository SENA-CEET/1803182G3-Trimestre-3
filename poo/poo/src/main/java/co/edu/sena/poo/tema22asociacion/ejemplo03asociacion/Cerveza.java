package co.edu.sena.poo.tema22asociacion.ejemplo03asociacion;

import java.util.Objects;

public class Cerveza {
    private String nombre;
    private double precio;

    public Cerveza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cerveza cerveza = (Cerveza) o;
        return Double.compare(cerveza.precio, precio) == 0 &&
                Objects.equals(nombre, cerveza.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }
}
