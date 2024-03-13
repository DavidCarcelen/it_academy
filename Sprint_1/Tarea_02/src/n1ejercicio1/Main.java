package n1ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //psvm

        int num = 0;
        String nombre = "";
        double precio = 0;
        String mensaje = "";
        Venta venta = new Venta();

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome");
        while (num != 4) {

            System.out.println("Seleccione opción:\n" +
                    "1 añadir producto\n" +
                    "2 suma total\n" +
                    "3 lista productos\n" +
                    "4 salir");
            num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Introduce nombre");
                    nombre = input.next();
                    System.out.println("Introduce precio");
                    precio = input.nextDouble();
                    mensaje = crearProducto(nombre, precio, venta);
                    break;
                case 2:
                    mensaje = venta.calcularTotal();
                    break;
                case 3:
                    mensaje = listaProductos(venta);
                    break;
                case 4:
                    mensaje= "adiós";
                    break;
            }

            System.out.println(mensaje);

        }

    }

     public static String crearProducto(String nombre, double precio, Venta venta) {
        Producto producto = new Producto(nombre, precio);
        venta.lista.add(producto);
        return "Producto "+ nombre + " añadido a la lista.";

    }
    public static String listaProductos(Venta venta){
        String nombre = "";
        String lista = "";
        for(Producto a: venta.lista){
            nombre = a.getNombre();
            lista = lista + " " + nombre;
        }
        return lista;
    }
}
