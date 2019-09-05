package co.edu.sena.poo.tema05methods;

public class App2 {
    public static void main(String[] args) {
        String [] nombres = {"pedor", "juan"};
        System.out.println(nombres);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        cambiarArreglo(nombres);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }



    }

    public static void cambiarArreglo(String [] nombresViejos){
        System.out.println("datos antes del cambio");
        for (int i = 0; i < nombresViejos.length ; i++) {
            System.out.println(nombresViejos[i]);
        }
        nombresViejos = new String[2];
        nombresViejos[0] ="miguel";
        nombresViejos[1] ="pedro";
    }
}
