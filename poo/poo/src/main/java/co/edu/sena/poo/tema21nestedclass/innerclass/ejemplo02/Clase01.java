package co.edu.sena.poo.tema21nestedclass.innerclass.ejemplo02;

public class Clase01 {

    public InterfaceClase02 getClase02(){
        return new Clase02();
    }


    private class Clase02 implements InterfaceClase02{

        @Override
        public InterfaceClase03 getClase03(){
            return new Clase03();
        }

         private class Clase03 implements InterfaceClase03{
             @Override
             public InterfaceClase04 getClase04() {
                 return new Clase04();
             }

             private class Clase04 implements InterfaceClase04 {

                 @Override
                 public InterfaceClase05 getClase05(){
                     return new Clase05();
                 }

                private class Clase05 implements InterfaceClase05{

                    @Override
                    public void imprimir() {

                    }

                    @Override
                     public void imprimir2(){
                        System.out.println("estoy dentro del metodo imprimir 2 clase");
                     }




                }
            }
        }
    }
}
