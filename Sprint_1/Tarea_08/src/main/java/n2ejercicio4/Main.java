package n2ejercicio4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> lista = Arrays.asList("Bob", 230, "John", 6, "Jeffrey", 88, "Robson", 55, "Reggie", "Paul", "Eleanor", "Jack");

        System.out.println("Orden alfabético: ");
        ordenAlfabetico(lista);

        System.out.println("\nPrimero las que contienen 'e':");
        primeroConE(lista);

        System.out.println("\nCambiar 'a' por 4: ");
        cambiarApor4(lista);

        System.out.println("\nSolo elementos numéricos: ");
        soloElementosNumericos(lista);
    }

    public static void ordenAlfabetico(List<Object> lista) {
        lista.stream()
                .map(Object::toString)
                .sorted()
                .forEach(s -> System.out.print(s + " "));
    }

    public static void primeroConE(List<Object> lista) {
        lista.stream()
                .map(Object::toString)
                .filter(s -> s.contains("e"))
                .forEach(s -> System.out.print(s + " "));
        lista.stream()
                .map(Object::toString)
                .filter(s -> !s.contains("e"))
                .forEach(s -> System.out.print(s + " "));
    }

    public static void cambiarApor4(List<Object> lista) {
        lista.stream()
                .map(Object::toString)
                .filter(s -> s.contains("a"))
                .map(s -> s.replace('a', '4'))
                .forEach(s -> System.out.print(s + " "));
    }

    public static void soloElementosNumericos(List<Object> lista) {
        lista.stream()
                .filter(s -> s instanceof Integer)
                .forEach(s -> System.out.print(s + " "));
    }
}

