package n1ejercicio2;

import n1ejercicio1.Interface1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Bob", "el", "guacamayo", "verde"));

        System.out.println("La lista inicial"+ lista);

        Interface1 inter = (s) -> System.out.println("Lista de palabras que cotienen la letra o y tienen 5 o mas letras: " + s);
        metodoContieneO(inter, lista);

    }
    static void metodoContieneO (Interface1 inter, ArrayList<String> lista){
        lista.removeIf(str -> !str.contains("o"));
        lista.removeIf(str -> str.length() <= 5);
        inter.metodo1(lista);

    }
}
