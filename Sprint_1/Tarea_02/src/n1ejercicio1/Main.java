package n1ejercicio1;

import java.util.Scanner;

public class Main {
    static Venta venta = new Venta();
    public static void main(String[] args) { //psvm
       // Venta venta = new Venta();

        int num = 0;
        String nombre = "";
        double precio = 0;
        String mensaje = "";
        //Venta venta = new Venta();

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome");
        while (num != 6) {

            System.out.println("Seleccione opción:\n" +
                    "1 añadir producto\n" +
                    "2 suma total\n" +
                    "3 lista productos\n" +
                    "4 provocar error OutOfBounds\n" +
                    "5 provocar Index out of bounds\n" +
                    "6 salir");
            num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Introduce nombre");
                    nombre = input.next();
                    System.out.println("Introduce precio");
                    precio = input.nextDouble();
                    mensaje = crearProducto(nombre, precio);
                    break;
                case 2:
                    //venta.calcularTotal();
                    try {
                        mensaje = venta.calcularTotal();
                    } catch (VentaVaciaException e) {
                        mensaje = "ERROR " + e.getMessage();
                    }
                    break;
                case 3:
                    mensaje = listaProductos();
                    break;
                case 4:
                    try{
                        int a[] = new int[5];
                        a[6] = 9;
                    } catch (ArrayIndexOutOfBoundsException e){
                        mensaje = "ERROR Array Index Out of Bounds";
                    }

                    break;
                case 5:
                    try{
                        outOfBounds();
                    } catch (IndexOutOfBoundsException e){
                        mensaje = " ERROR Index Out of Bounds";
                    }

                    break;
                case 6:
                    mensaje= "Adiós";
                    break;
            }

            System.out.println(mensaje);

        }

    }

     public static String crearProducto(String nombre, double precio) {
        Producto producto = new Producto(nombre, precio);
        venta.productos.add(producto);
        return "Producto "+ nombre + " añadido a la lista.";

    }
    public static String listaProductos(){
        String nombre = "";
        String lista = "";
        for(Producto a: venta.productos){
            nombre = a.getNombre();
            lista += nombre + ", ";
        }
        return lista;
    }

    public static void outOfBounds() {

        for (int i = 0; i <= venta.productos.size(); i++) {
            Producto producto = venta.productos.get(i);


        }
    }




}
