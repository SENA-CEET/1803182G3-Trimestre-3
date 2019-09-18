package co.edu.sena.poo.tema18polimorfismo.reglasconversiones;

public class App {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Mamifero mamifero1 = perro1; // autocasting perro solo con los metodos del mamiferos
        Vertebradro vertebradro1 = perro1; // perro con los metodos de vertebrado
        Animal animal1 =(Animal)perro1; // perro con los metodos de animal
        Perro perro3 = (Perro) mamifero1; // casting


        Animal animal2 = new Animal();
        //Perro perro2 = (Perro) animal2;


        Animal animal10 = new Perro();
        Perro perro10 = (Perro) animal10;



    }
}
