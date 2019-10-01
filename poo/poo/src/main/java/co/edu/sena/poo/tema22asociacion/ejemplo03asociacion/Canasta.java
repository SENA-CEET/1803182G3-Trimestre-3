package co.edu.sena.poo.tema22asociacion.ejemplo03asociacion;

import java.util.ArrayList;
import java.util.List;

public class Canasta {
    private int size;
    private double precio;
    private double contenidoActual;

    private List<Cerveza> cervezas;

    public Canasta(int size) {
        this.contenidoActual = 0;
        this.size = size;
        this.cervezas = new ArrayList<>();
    }

    public void agregarBotella(Cerveza cerveza) {
        if (this.contenidoActual < this.size) {
            this.contenidoActual++;
            this.cervezas.add(cerveza);
            this.precio += cerveza.getPrecio();
        } else {
            System.out.println("canasta llena");
        }
    }

    public void quitarBotella(Cerveza cerveza) {
        if (this.contenidoActual > 0) {
            this.contenidoActual--;
            this.cervezas.remove(cerveza);
            this.precio -= cerveza.getPrecio();
        } else {
            System.out.println("canasta vacia");
        }
    }

    public void quitarTodasBotella(Cerveza cerveza){
        if (this.contenidoActual > 0) {
            int cont =0;
            for (Cerveza c:this.cervezas
                 ) {
                if(c.equals(cerveza)){
                    cont++;
                }
            }
            this.size-=cont;
            for (int i = 0; i < cont ; i++) {
                this.cervezas.remove(cerveza);
            }
            this.precio -= (cerveza.getPrecio()*cont);
        } else {
            System.out.println("canasta vacia");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Cerveza> getCervezas() {
        return cervezas;
    }

    public double getContenidoActual() {
        return contenidoActual;
    }

    public void setCervezas(List<Cerveza> cervezas) {
        this.cervezas = cervezas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
