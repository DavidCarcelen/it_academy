package n1ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Bob", "Gonzales", 35);
        String str = "Capitan";
        int i = 2024;

        GenericMethods genericMethods = new GenericMethods();

        genericMethods.genericMethod(persona, str, i);

    }
}
