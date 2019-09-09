package co.edu.sena.poo.tema08constructores;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Cable c1 = new Cable();

        Cable c2 = new Cable("rojo", 6,7);

        Cable c3 = new Cable("negro");

        Cable c4 = new Cable(8);


    }
}
