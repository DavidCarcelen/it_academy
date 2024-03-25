package n1ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectorySorter3 {

    public static void main(String[] args) {
        String ruta = "";
        boolean b = false;

        Scanner input = new Scanner(System.in); ///Users/davidcarcelen/Documents

        while (!b) {
            System.out.println("Introduce la ruta de la carpeta");
            ruta = input.next();

            File file = new File(ruta);

            if (!file.isDirectory()) {
                System.out.println("La ruta no es de una carpeta");
            } else {
                try (FileWriter writer = new FileWriter("listaArchivos.txt")) {
                    listarArchivos(file, writer);
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b = true;
            }
        }
    }

    public static void listarArchivos(File file, FileWriter writer) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        File[] files = file.listFiles();
        Arrays.sort(files);

        writer.write("\nContenido de la carpeta " + file.getPath() + ":\n");

        for (File subFile : files) {
            String tipo = subFile.isDirectory() ? "Carpeta" : "Archivo";
            String fechaMod = sdf.format(subFile.lastModified());
            writer.write(tipo + " " + subFile.getName() + ", última modificación: " + fechaMod + "\n");
            if (subFile.isDirectory()) {
                listarArchivos(subFile, writer);
            }
        }

    }
}


