package n1ejercicio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> lista = Arrays.asList("Bob", 230, "John", 6, "Schwarawtikar",88, "Robson", 55, "Maracaton");

        lista.stream()
                .filter(s -> s instanceof String )
                .map(String.class :: cast)
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);


    }
}
