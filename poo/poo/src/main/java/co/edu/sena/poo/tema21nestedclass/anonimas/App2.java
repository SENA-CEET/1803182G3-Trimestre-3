package co.edu.sena.poo.tema21nestedclass.anonimas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Cliente> clientesLista = new ArrayList<>();
        clientesLista.add(new Cliente("enrique","moreno",35));
        clientesLista.add(new Cliente("pedro","ramirez",20));
        clientesLista.add(new Cliente("juan","martinez",19));
        clientesLista.add(new Cliente("carlos","guzman",18));
        clientesLista.add(new Cliente("laura","pachon",18));

        Collections.sort(clientesLista, new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getNombres().compareTo(o2.getNombres());
            }
        });


        for (Cliente c:clientesLista
             ) {
            System.out.println(c.toString());
        }



    }
}
