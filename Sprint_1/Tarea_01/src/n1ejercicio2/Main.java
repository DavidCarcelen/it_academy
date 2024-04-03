package n1ejercicio2;

public class Main {
    public static void main (String[] args){

        Coche coche = new Coche("bob", 200);
        Coche coche2 = new Coche("drop",250);
        System.out.println("2 objetos creados, la marca es comun para la clase\n" +
                " cada objeto puede tener valor diferente en potencia\n" +
                " el modelo asignado al segundo objeto afecta a la clase al ser static y cambia el valor de los dos");


        System.out.println(coche.toString());

        System.out.println(coche2.toString());

        System.out.println(Coche.frenar() + " tengo que llamar a la clase al ser static");

        System.out.println(coche.acelerar() + " llamo al objeto al no ser static");

    }
}
