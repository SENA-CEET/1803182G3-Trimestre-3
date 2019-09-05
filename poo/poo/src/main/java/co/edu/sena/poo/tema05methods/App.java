package co.edu.sena.poo.tema05methods;

public class App {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

        System.out.println(a.getClass());
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        cambiarArreglo(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int [][]b = new int[5][5];
        System.out.println(b.getClass());

    }

    public static void cambiarArreglo(int [] arreglo){
        arreglo = new int[5];
        arreglo[0]=9;
        arreglo[1]=8;
        arreglo[2]=7;
        arreglo[3]=6;
        arreglo[4]=5;
    }


}
