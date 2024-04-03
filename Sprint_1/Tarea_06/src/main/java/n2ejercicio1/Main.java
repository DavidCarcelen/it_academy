package n2ejercicio1;


public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Bob", "Gonzales", 35);
        String str = "Capitan";
        int i = 2024;

        GenericMethods genericMethods = new GenericMethods();

        genericMethods.genericMethod(str,persona,i);

    }
}
