package n1ejercicio1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DirectorySorter {

    public static void main(String[] args) {
        String ruta = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce ruta del directorio");//C:\Users\formacio\Desktop\David\IT_Academy
        ruta = input.next();
        
        File directorio = new File(ruta);

        if (!directorio.isDirectory()) {
            System.out.println("La ruta no es de un directorio");
        }

        File[] files = directorio.listFiles();
        Arrays.sort(files);


        System.out.println("Contenido del directorio " + ruta + ":");
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}

