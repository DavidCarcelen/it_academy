package katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class KataAhorcado {

    public static void main(String[] args) {
        final int MAX_INTENTOS = 6;
        int intentos = 0;
        String mensaje = "";
        boolean ganador = false;
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("bob", "manzana", "loro", "jugar", "doctor",
                "bombilla", "esqueleto", "escalada", "aficionado", "marioneta", "albert",
                "especifico", "murcielago", "capitan", "ordenador", "pan", "perro", "estropajo", "hamster"));

        String solucion = palabras.get((int) (Math.random() * palabras.size()));

        HashSet<String> palabrasIntentadas = new HashSet<>();

        char[] palabraResuelta = new char[solucion.length()];
        Arrays.fill(palabraResuelta, '-');

        Scanner sc = new Scanner(System.in);

        System.out.println("Juguemos al ahorcado!\n" + ahorcado(intentos));

        while (intentos < MAX_INTENTOS && !ganador) {
            boolean acierto = false;
            boolean repetida = false;
            System.out.println("Palabra: " + String.valueOf(palabraResuelta) +
                            "\nIntentos restantes: " + (MAX_INTENTOS - intentos) +
                            "\nIntroduce una letra: ");

            String entrada = sc.next();

            if (entrada.length() != 1 && !palabrasIntentadas.contains(entrada)) {
                if (entrada.equals(solucion)){
                    ganador = true;
                }
            }else if(palabrasIntentadas.contains(entrada)){
                System.out.println("Ya la probaste, esta no está.");
                repetida = true;
            } else {
                palabraResuelta = comparador(entrada, solucion, palabraResuelta);
                acierto = (String.valueOf(palabraResuelta).contains(entrada));
                ganador = (String.valueOf(palabraResuelta).equals(solucion));
            }

            palabrasIntentadas.add(entrada);

            if (!acierto && !ganador && !repetida) {
                intentos++;
                mensaje = "Sigue intentándolo.\n" + ahorcado(intentos);
            } else if (acierto && !ganador){
                mensaje = "Acertaste!";
            } else if (ganador) {
                mensaje = "¡Has ganado! La palabra era: " + solucion;
            }
            if (intentos < MAX_INTENTOS){
                System.out.println(mensaje);
            }
        }
        if(!ganador){
            System.out.println("Has perdido, no mas intentos. La palabra era: " + solucion + "\n" + ahorcado(intentos));
        }
        sc.close();
    }
    public static char[] comparador (String entrada, String solucion, char[] palabraResuelta){
        for (int i = 0; i < solucion.length(); i++) {
            if (solucion.charAt(i) == entrada.charAt(0)) {
                palabraResuelta[i] = entrada.charAt(0);
            }
        }
        return palabraResuelta;
    }
    public static String ahorcado(int intentos) {
        String draw = "";
        switch (intentos) {
            case 0:
                draw = """
                        +---+
                        |   |
                            |
                            |
                            |
                            |
                      =======""";
                break;
            case 1:
                draw = """
                        +---+
                        |   |
                        O   |
                            |
                            |
                            |
                      =======""";
                break;
            case 2:
                draw = """
                        +---+
                        |   |
                        O   |
                        |   |
                            |
                            |
                      =======""";
                break;
            case 3:
                draw = """
                        +---+
                        |   |
                        O   |
                       /|   |
                            |
                            |
                      =======""";
                break;
            case 4:
                draw = """
                        +---+
                        |   |
                        O   |
                       /|\\  |
                            |
                            |
                      =======""";
                break;
            case 5:
                draw = """
                        +---+
                        |   |
                        O   |
                       /|\\  |
                       /    |
                            |
                      =======""";
                break;
            case 6:
                draw = """
                        +---+
                        |   |
                        O   |
                       /|\\  |
                       / \\  |
                            |
                      =======""";
                break;
        }
        return draw;
    }
}


