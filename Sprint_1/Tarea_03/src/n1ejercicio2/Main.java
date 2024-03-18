package n1ejercicio2;

import n1ejercicio1.Month;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();

        lista1.add(0,60);
        lista1.add(1,61);
        lista1.add(2,62);
        lista1.add(3,63);

        List<Integer> lista2 = new ArrayList<>();

        ListIterator<Integer> intIterator = lista1.listIterator();

        System.out.println("Elementos en lista uno:");

        while(intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        while(intIterator.hasPrevious()) {
            lista2.add(intIterator.previous());
        }
        System.out.println("Elementos en lista dos en orden inverso:");

        for (int i: lista2){
            System.out.println(i);
        }
    }
}
