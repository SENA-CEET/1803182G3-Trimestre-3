package co.edu.sena.poo.tema21nestedclass.metodos;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        class Perro{
            private String nombre;

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
        }

        Perro p1 = new Perro();
        p1.setNombre("pepe");
        System.out.println(p1.getNombre());


    }
}
