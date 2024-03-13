package n1ejercicio2;

public class Main {
    public static void main (String[] args){

        System.out.println(" Marca de clase (Coche.marca): " + Coche.marca + "\n Modelo de clase (Coche.modelo, se le asigna valor al generar objeto): " + Coche.modelo + "\n No puedo pedir Coche.potencia ya que aún no existe objeto");


        Coche coche = new Coche("bob", 200);
        Coche coche2 = new Coche("esponja",250);
        System.out.println("Objeto creado, llamo a toString");



        System.out.println(coche.toString());

        System.out.println(coche2.toString());

        System.out.println(Coche.frenar() + "tengo que llamar a la clase al ser static");

        System.out.println(coche.acelerar() + "llamo al objeto al no ser static");

    }
}
