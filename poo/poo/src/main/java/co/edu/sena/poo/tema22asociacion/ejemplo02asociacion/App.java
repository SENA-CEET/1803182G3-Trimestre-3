package co.edu.sena.poo.tema22asociacion.ejemplo02asociacion;

public class App {
    public static void main(String[] args) {
        Caballo caballo = new Caballo(new Cola(),new Pata[4],new Pulmon[2], new Rinion[2]);

        caballo.getColita().setCaballo(caballo);
        System.out.println(caballo.getColita().getCaballo());

        caballo.getPatas()[0]= new Pata();
        caballo.getPatas()[1]= new Pata();
        caballo.getPatas()[2]= new Pata();
        caballo.getPatas()[3]= new Pata();

        caballo.getPulmones()[0]= new Pulmon();
        caballo.getPulmones()[1]= new Pulmon();

        caballo.getRiniones()[0]= new Rinion();
        caballo.getRiniones()[1]= new Rinion();

        for (int i = 0; i <caballo.getPatas().length ; i++) {
            System.out.println(caballo.getPatas()[i]);
        }

        for (int i = 0; i <caballo.getPulmones().length ; i++) {
            System.out.println(caballo.getPulmones()[i]);
        }

        for (int i = 0; i <caballo.getRiniones().length ; i++) {
            System.out.println(caballo.getRiniones()[i]);
        }

        Montura m1 = new Montura();
        Montura m2 = new Montura();

        caballo.setMontura(m2);



    }
}
