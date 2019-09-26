package co.edu.sena.poo.tema21nestedclass.statics.ejemplo02;

public class Clase01 {
    public static InterfaceClase02 getClase2() {
        return new Clase01.Clase02();
    }

    public static class Clase02 implements InterfaceClase02{
        public static class Clase03{
            public static class Clase04{

                public static InterfaceClase05 getClase05(){
                    return new Clase01.Clase02.Clase03.Clase04.Clase05();
                }


                public static class Clase05 implements InterfaceClase05{

                }
            }
        }
    }
}
