package examen;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        DeliveryGestor deliveryGestor = new DeliveryGestor();
        int num;
        String mensaje = "";
        Pedido pedido = null;

        //Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al gestor del Delivery Bruumm:");

        do{
            System.out.println("Elija funcion:\n" +
                    "1 - Crear nuevo pedido.\n" +
                    "2 - Marcar un pedido como entregado\n" +
                    "3 - Listar los pedidos pendientes\n" +
                    "4 - Listar pedidos entregados.\n" +
                    "5 - Salir");
            num = sc.nextInt();
            sc.nextLine();

            switch(num){
                case 1:
                    System.out.println("Cliente para el pedido:\n" +
                            "Indique nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Ahora indique dirección:");
                    String direccion = sc.nextLine();
                    Cliente cliente = new Cliente (nombre, direccion);
                    pedido = DeliveryGestor.crearPedido(cliente);
                    addProductos(pedido);
                    pedido.listaProductos();
                    mensaje = "Pedido creado" + pedido.toString() + "\n Precio total= " + pedido.precioTotal();
                    break;
                case 2:
                    System.out.println("indique id del pedido:");
                    int id = sc.nextInt();
                    try {
                        pedido = DeliveryGestor.pedidoFinder(id);
                    } catch (NullPointerException e){
                        System.out.println("No existe un pedido con ese id.");
                    }
                    pedido.setEntregado(true);
                    mensaje = "pedido con id " + id + " marcado como entregado.";
                    break;
                case 3:
                    mensaje = (DeliveryGestor.listarPendientes()).toString();
                    break;
                case 4:
                    mensaje = (DeliveryGestor.listarEntregados()).toString();
                    break;
                case 5:
                    mensaje = "Adiós.";
                    break;
                default: mensaje = "Opción no válida";
                    break;
            }
            System.out.println(mensaje);

        }while(num <5);

    }
    public static void addProductos(Pedido pedido){
        int numProducto = 0;
        String mensaje = "";
        while (numProducto < 5){
            System.out.println("Añanadamos productos:\n" +
                    "1- Burrito\n" +
                    "2- Hamburguesa\n" +
                    "3- Kebab\n" +
                    "4- Pizza\n" +
                    "5- No añadir mas");
            numProducto = sc.nextInt();
            switch (numProducto){
                case 1:
                    mensaje = DeliveryGestor.addProductosPedido(pedido, ProductType.BURRITO);
                    break;
                case 2:
                    mensaje = DeliveryGestor.addProductosPedido(pedido, ProductType.HAMBURGUESA);
                    break;
                case 3:
                    mensaje = DeliveryGestor.addProductosPedido(pedido, ProductType.KEBAB);
                    break;
                case 4:
                    mensaje = DeliveryGestor.addProductosPedido(pedido, ProductType.PIZZA);
                    break;
                case 5:
                    mensaje = "Pedido completo";
                    break;
                default:
                    mensaje = "no es una opción válida";
                    break;

            }
            System.out.println(mensaje);

        }

    }
}
