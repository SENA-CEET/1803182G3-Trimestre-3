package co.edu.sena.poo.tema18polimorfismo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.RandomAccess;

public class App {
    public static void main(String[] args) {
        AvionGuerra avionGuerra = new AvionGuerra();
        accionesAvion(avionGuerra);

        AvionCarga avionCarga= new AvionCarga();
        accionesAvion(avionCarga);

        AvionRescate avionRescate = new AvionRescate();
        accionesAvion(avionRescate);

        Avion avion1 = new AvionCarga();
        System.out.println(avion1.getClass().getCanonicalName());

        Avion avion2 = new AvionGuerra();
        System.out.println(avion2.getClass().getCanonicalName());
        Avion avion3 = new AvionRescate();

    }

    public static void accionesAvion(Avion avion){
        avion.prender();
        avion.apagar();
        if (avion instanceof AvionCarga){
            ((AvionCarga) avion).dejarCarga();
            ((AvionCarga) avion).subirCarga();
        }

        if(avion instanceof AvionGuerra){
            ((AvionGuerra) avion).dispararAmetralladora();
            ((AvionGuerra) avion).dispararMisil();
        }
        if(avion instanceof AvionRescate){
            ((AvionRescate)avion).subriCamilla();
            ((AvionRescate)avion).bajarCamilla();

        }
    }

}
