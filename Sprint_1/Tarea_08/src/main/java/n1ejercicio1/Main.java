package n1ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("Bob", "el", "loro", "verde"));

        System.out.println("La lista inicial"+ lista);

        List<String> listaO = metodoContieneO(lista);
        listaO.forEach(l -> System.out.println("Lista de palabras que cotienen la letra o : " + l));


    }
    static List<String> metodoContieneO (List<String> lista){
        return lista.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());


    }
}
