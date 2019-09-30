package co.edu.sena.poo.tema22asociacion.ejemplo02asociacion;

public class Caballo {
    private Cola colita;
    private Montura montura;
    private Pata [] patas;
    private Pulmon [] pulmones;
    private Rinion [] riniones;

    public Caballo(Cola colita, Pata[] patas, Pulmon[] pulmones, Rinion[] riniones) {
        this.colita = colita;
        this.patas = patas;
        this.pulmones = pulmones;
        this.riniones = riniones;
    }

    public Cola getColita() {
        return colita;
    }

    public Montura getMontura() {
        return montura;
    }

    public Pata[] getPatas() {
        return patas;
    }

    public Pulmon[] getPulmones() {
        return pulmones;
    }

    public Rinion[] getRiniones() {
        return riniones;
    }

    public void setMontura(Montura montura) {
        this.montura = montura;
    }
}
