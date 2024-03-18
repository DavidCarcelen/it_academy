package n1ejercicio1;

import java.util.Scanner;

public class Main {
    static Venta venta = new Venta();
    public static void main(String[] args) { //psvm

        int num = 0;
        String nombre = "";
        double precio = 0;
        String mensaje = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome");
        while (num != 5) {

            System.out.println("Seleccione opción:\n" +
                    "1 Añadir producto\n" +
                    "2 Suma total\n" +
                    "3 Lista productos\n" +
                    "4 Provocar error OutOfBounds\n" +
                    "5 Salir");
            num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Introduce nombre");
                    nombre = input.next();
                    System.out.println("Introduce precio");
                    precio = input.nextDouble();
                    mensaje = venta.crearProducto(nombre, precio);
                    break;
                case 2:
                    try {
                        mensaje = venta.calcularTotal();
                    } catch (VentaVaciaException e) {
                        mensaje = "ERROR " + e.getMessage();
                    }
                    break;
                case 3:
                    mensaje = venta.listaProductos();
                    break;
                case 4:
                    try{
                        int a[] = new int[5];
                        a[6] = 9;
                    } catch (ArrayIndexOutOfBoundsException e){
                        mensaje = "ERROR Array Index Out of Bounds: " + e.getMessage();
                    }
                    break;
                case 5:
                    mensaje= "Adiós";
                    break;
            }
            System.out.println(mensaje);
        }
    }
}
