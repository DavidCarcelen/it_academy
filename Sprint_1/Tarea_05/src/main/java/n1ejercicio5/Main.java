package n1ejercicio5;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        MiObjeto miObjeto = new MiObjeto("bob", 6);

        serializarObjeto(miObjeto);
        desSerializarObjeto();

    }
    public static void serializarObjeto(MiObjeto miObjeto){
        try {
            FileOutputStream archivoSalida = new FileOutputStream("objeto_serializado.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);

            objetoSalida.writeObject(miObjeto);

            objetoSalida.close();
            archivoSalida.close();

            System.out.println("Objeto serializado correctamente en objeto_serializado.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void desSerializarObjeto(){
        try {
            FileInputStream entrada = new FileInputStream("objeto_serializado.ser");
            ObjectInputStream objetoEntrada = new ObjectInputStream(entrada);

            MiObjeto miObjeto = (MiObjeto) objetoEntrada.readObject();

            objetoEntrada.close();
            entrada.close();

            System.out.println("Objeto desserializado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
