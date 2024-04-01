package n1ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Seat",100,"Verde");
        Coche coche2 = new Coche("Ford",120,"Rojo");
        Coche coche3 = new Coche("Audi",150,"Azul");


        NoGenericMethods noGenericMethods = new NoGenericMethods(coche1, coche2, coche3);

        Coche coche = (Coche) noGenericMethods.getObj1();

        System.out.println(coche.getMarca());

        //hago nueva llamada al constructor con los argumentos cambiados de orden, compruebo que funciona al ser los tres del mismo tipo y recibo resultado de marca de nuevo objeto.

        NoGenericMethods noGenericMethods1 = new NoGenericMethods(coche2, coche3, coche1);

        coche = (Coche) noGenericMethods1.getObj1();

        System.out.println(coche.getMarca());
    }
}
