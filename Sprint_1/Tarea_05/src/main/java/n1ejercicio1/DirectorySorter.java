package n1ejercicio1;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DirectorySorter {

    public static void main(String[] args) {
        String ruta = "";
        boolean b = false;
        File directorio = null;

        Scanner input = new Scanner(System.in);

        while(!b) {
            System.out.println("Introduce la ruta del directorio");
            ruta = input.next();

            directorio = new File(ruta);

            if (!directorio.isDirectory()) {
                try {
                    throw new CustomException("La ruta especificada no corresponde a un directorio.");
                } catch (CustomException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                b = true;
            }
        }
        input.close();

        File[] files = directorio.listFiles();

        if (files != null){
            Arrays.sort(files);

            System.out.println("Contenido del directorio " + ruta + ":");
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}


