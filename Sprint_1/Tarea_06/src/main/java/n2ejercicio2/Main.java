package n2ejercicio2;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Bob", "Gonzales", 35);
        String str = "Capitan";
        int i = 2024;

        List<Object>lista = Arrays.asList(persona,str,i);

        GenericMethods genericMethods = new GenericMethods();

        genericMethods.genericMethod(lista);

    }
}
