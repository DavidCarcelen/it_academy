package n1ejercicio2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectorySorter2 {

    public static void main(String[] args) {
        String ruta = "";
        boolean b = false;

        Scanner input = new Scanner(System.in);

        while(!b){
            System.out.println("Introduce la ruta de la carpeta");
            ruta = input.next();

            File file = new File(ruta);

            if (!file.isDirectory()) {
                System.out.println("La ruta no es de una carpeta");
            } else{
                System.out.println("Contenido del archivo " + ruta + ":");
                listarArchivos(file);
                b = true;
            }
        }
    }

    private static void listarArchivos(File file){
        File[] files = file.listFiles();
        if (files != null){
            Arrays.sort(files);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            for (File subFile : files) {
                String tipo = subFile.isDirectory()?"Carpeta":"Archivo";
                String fechaMod = sdf.format(subFile.lastModified());
                System.out.println(file.getName() + " tipo: " + tipo + " fecha de última modificación: " + fechaMod);
                if (subFile.isDirectory()){
                    listarArchivos(subFile);
                }
            }
        }
    }
}
