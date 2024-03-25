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

        Scanner input = new Scanner(System.in); ///Users/davidcarcelen/Documents

        while(!b){
            System.out.println("Introduce la ruta del directorio");
            ruta = input.next();

            directorio = new File(ruta);

            if (!directorio.isDirectory()) {
                System.out.println("La ruta no es de un directorio");
            } else b = true;
        }

        File[] files = directorio.listFiles();
        Arrays.sort(files);

        System.out.println("Contenido del directorio " + ruta + ":");
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}

