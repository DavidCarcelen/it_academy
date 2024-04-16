package n1ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("Bob", "el", "loro", "verde"));

        System.out.println("La lista inicial"+ lista + "\n" +
                "Lista de palabras que cotienen la letra o :");

        metodoContieneO(lista).forEach(System.out::println);
    }
    static List<String> metodoContieneO (List<String> lista){
        return lista.stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.contains("O"))
                .collect(Collectors.toList());

    }
}
