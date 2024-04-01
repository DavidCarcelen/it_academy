package n1ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Bob", "el", "loro", "verde"));

        System.out.println("La lista inicial"+ lista);

        Interface1 inter = (s) -> System.out.println("Lista de palabras que cotienen la letra o : " + s);
        metodoContieneO(inter, lista);

    }
    static void metodoContieneO (Interface1 inter, ArrayList<String> lista){
        lista.removeIf(str -> !str.contains("o"));
        inter.metodo1(lista);

    }
}
