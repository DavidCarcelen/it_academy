package n1ejercicio4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectorySorter4 {

    public static void main(String[] args) {
        String ruta = "";
        boolean b = false;
        int num = 0;

        Scanner input = new Scanner(System.in); ///Users/davidcarcelen/Documents

        System.out.println("Elije una opción:\n" +
                "1 listar archivos de una carpeta\n" +
                "2 leer archivo txt y mostrar contenido por consola");
        num = input.nextInt();

        if (num == 1){
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
        } else if(num == 2){
            while (!b) {
                System.out.println("Introduce la ruta del archivo txt");
                ruta = input.next();

                File file = new File(ruta);

                try {
                    FileReader reader = new FileReader(ruta);
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    String line;

                    while((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b = true;

            }
        } else System.out.println("No es una opción válida.");
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



