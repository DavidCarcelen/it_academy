package n2ejercicio4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> lista = Arrays.asList("Bob", 230, "John", 6, "Jeffrey",88, "Robson", 55, "Reggie", "Paul", "Eleanor", "Jack");

        System.out.println("Orden alfabético: ");
        lista.stream()
                .map(Object::toString)
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\nPrimero las que contienen 'e':");
        lista.stream()
                .map(Object::toString)
                .filter(s -> s.contains("e"))
                .forEach(s -> System.out.print(s + " "));
        lista.stream()
                .map(Object::toString)
                .filter(s -> !s.contains("e"))
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\nCambiar 'a' por 4: " );
        lista.stream()
                .map(Object::toString)
                .filter(s -> s.contains("a"))
                .map(s -> s.replace('a','4'))
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\nSolo elementos numéricos: ");
        lista.stream()
                .filter(s-> s instanceof Integer)
                .forEach(s -> System.out.print(s + " "));

    }
}
