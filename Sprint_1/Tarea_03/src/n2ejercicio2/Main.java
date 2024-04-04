package n2ejercicio2;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> lista= new HashSet<>();

        Restaurant restaurant1 = new Restaurant("Pepe", 5);
        Restaurant restaurant2 = new Restaurant("Pepe", 5);
        Restaurant restaurant3 = new Restaurant("Pepe", 7);
        Restaurant restaurant4 = new Restaurant("ElReyDeLaGamba", 8);
        Restaurant restaurant5 = new Restaurant("ElReyDeLaGamba", 5);
        Restaurant restaurant6 = new Restaurant("LosPollos",9);
        Restaurant restaurant7 = new Restaurant("FreshBob", 8);

        lista.add(restaurant1);
        lista.add(restaurant2);
        lista.add(restaurant3);
        lista.add(restaurant4);
        lista.add(restaurant5);
        lista.add(restaurant6);
        lista.add(restaurant7);

        for(Restaurant r: lista){
            System.out.println("Restaurant " + r.getName() + ", puntuacion " + r.getScore());
        }

        TreeSet<Restaurant> tree_set = new TreeSet<>(lista);

        System.out.println("Lista ordenada:");

        for(Restaurant r: tree_set){
            System.out.println("Restaurant " + r.getName() + ", puntuacion " + r.getScore());
        }

    }
}
