package n2ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob","John","SnoopDogg","Albert","Xamaco","Skinny", "Al-Jah Rar", "Ali", "Abe");

        List<String>lista2 = selector(names);
        System.out.println(lista2);

    }
    public static List<String> selector(List<String> lista){
        Stream<String> streamLista = lista.stream()
                .filter(s -> s.length() == 3 && s.startsWith("A"));

        return streamLista.collect(Collectors.toList());
    }

}
