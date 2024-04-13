package n1ejercicio3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir")+ "/countries.txt");
        String text = "";
        HashMap <String, String> countryCapital = new HashMap<String, String>();
        String name = "";
        int num = 0;
        int puntuacion = 0;

        Scanner input = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((text = br.readLine()) != null) {
                String[] parts = text.split(" ");
                countryCapital.put(parts[0], parts[1]);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al leer/escribir en el archivo.", e);
        }


        Random random = new Random();
        List<String> keys = new ArrayList<String>(countryCapital.keySet());

        System.out.println("Introduce nombre de usuario:");
        name = input.next();
        System.out.println("Bienvenid@ " + name + "!");
        while (num != 10){
            String randomCountry = keys.get(random.nextInt(countryCapital.size()));
            System.out.println("Cuál es la capital de: " + randomCountry);
            String value = countryCapital.get(randomCountry);
            String respuesta = input.next();
            if (respuesta.equalsIgnoreCase(value)){
                puntuacion ++;
            }
            num ++;
        }
        System.out.println("Has conseguido " + puntuacion + " aciertos.");

        File archivo = new File(System.getProperty("user.dir") + "/classificacio.txt");
        try (FileWriter writer = new FileWriter(archivo, true)) {
            writer.write("Nombre: " + name + "\n");
            writer.write("Puntuacion: " + puntuacion + "\n\n");
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir el archivo", e);
        }

    }
}
