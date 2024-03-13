package n1ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //psvm

        int num = 0;
        String nombre = "";
        double precio = 0;
        Scanner input = new Scanner(System.in);
        String mensaje = "";
        Venta venta = new Venta();

        System.out.println("Welcome");
        while (num != 4) {

            System.out.println("Seleccione opción:\n" +
                    "1 añadir producto" +
                    "2 suma total" +
                    "3 lista productos" +
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
            if (num!=4){
                System.out.println(mensaje);
            }
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
            lista = nombre + lista;
        }
        return lista;
    }
}
