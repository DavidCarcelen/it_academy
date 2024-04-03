package n1ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String name = "";
        ArrayList<Month> year = new ArrayList<Month>();

        year.add (new Month("Enero"));
        year.add (new Month("Febrero"));
        year.add (new Month("Marzo"));
        year.add (new Month("Abril"));
        year.add (new Month("Mayo"));
        year.add (new Month("Junio"));
        year.add (new Month("Julio"));
        year.add (new Month("Septiembre"));
        year.add (new Month("Octubre"));
        year.add (new Month("Noviembre"));
        year.add (new Month("Diciembre"));

        System.out.println("Primera lista sin agosto:");

        for(Month m : year){
            System.out.print(m.getName() + " ");
        }

        year.add (7, new Month("Agosto"));
        System.out.println("\nAgosto añadido:");

        for(Month m : year){
            System.out.print(m.getName()+ " ");
        }

        year.add(year.get(0));
        System.out.println("\nAñado objeto que ya existe en la lista (enero):");

        for(Month m : year){
            System.out.print(m.getName()+ " ");
        }

        HashSet<Month> mapa = new HashSet<>(year);
        System.out.println("\nCreo HashSet y imprimo, ya no existe objeto duplicado:");

        for(Month m : mapa){
            System.out.print(m.getName() + " ");
        }
        // Iterador
        Iterator<Month> monthIterator = mapa.iterator();

        System.out.println("\nImprimo HashSet con iterador");

        while(monthIterator.hasNext()) {
            System.out.print(monthIterator.next().getName() + " ");
        }


    }
}
