package co.edu.sena.poo.tema22asociacion.ejemplo03asociacion;

import co.edu.sena.poo.tema22asociacion.ejemplo02asociacion.Caballo;
import javafx.application.Application;
import javafx.stage.Stage;

public class App {
    public static void main(String[] args) {
        Canasta canasta = new Canasta(30);
        canasta.agregarBotella(new Cerveza("poker",3000));
        canasta.agregarBotella(new Cerveza("andina",5000));
        canasta.agregarBotella(new Cerveza("asteca",3000));
        canasta.agregarBotella(new Cerveza("chicha",3000));
        canasta.agregarBotella(new Cerveza("red",3000));
        canasta.agregarBotella(new Cerveza("club colombia",3000));
        canasta.agregarBotella(new Cerveza("poker",3000));
        canasta.quitarTodasBotella(new Cerveza("poker",3000));
        System.out.println(canasta.getPrecio());

        for (Cerveza c:canasta.getCervezas()
             ) {

            System.out.println(c.getNombre());
            System.out.println(c.getPrecio());
        }

        System.out.println(canasta.getCervezas().size());


    }
}
