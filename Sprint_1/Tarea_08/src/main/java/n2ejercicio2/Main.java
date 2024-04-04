package n2ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaNum = Arrays.asList(1,4,34,5,75,3,7,88,44,6);

        String result = metodoParImpar(listaNum);
        System.out.println(result);

    }
    public static String metodoParImpar (List<Integer> listInt){
        List <String> lista = listInt.stream()
                .map(s->(s % 2 == 0)? "e" + s : "o" + s).toList();

        return lista.toString();
    }
}
