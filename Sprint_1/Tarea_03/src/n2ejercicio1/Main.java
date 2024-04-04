package n2ejercicio1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> lista= new HashSet<>();

        Restaurant restaurant1 = new Restaurant("Pepe", 5);
        Restaurant restaurant2 = new Restaurant("Pepe", 5);
        Restaurant restaurant3 = new Restaurant("Pepe", 7);
        Restaurant restaurant4 = new Restaurant("elReyDeLaGamba", 8);

        lista.add(restaurant1);
        lista.add(restaurant2);
        lista.add(restaurant3);
        lista.add(restaurant4);

        //no se guarda el restaurant2 con mismos atributos que el restaurant1.

        for(Restaurant r: lista){
            System.out.println("Restaurant " + r.getName() + ", puntuacion " + r.getScore());
        }



    }
}
