package examen.service;

import examen.exceptions.*;
import examen.model.Cliente;
import examen.model.Pedido;

import java.util.InputMismatchException;
import java.util.Scanner;

import static examen.service.DeliveryGestor.*;


public class Menu {
    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        int num;
        String mensaje = "";
        Pedido pedido= null;

        System.out.println("Bienvenido al gestor del Delivery Bruumm:");

        do {
            System.out.println("Elija funcion:\n" +
                    "1 - Crear nuevo pedido.\n" +
                    "2 - Marcar un pedido como entregado\n" +
                    "3 - Listar los pedidos pendientes\n" +
                    "4 - Listar pedidos entregados.\n" +
                    "5 - Salir");
            num = numCheck();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Indique nombre del cliente:");
                    String nombre = sc.nextLine();
                    System.out.println("Indique dirección del cliente:");
                    String direccion = sc.nextLine();
                    Cliente cliente = new Cliente(nombre, direccion);
                    pedido = crearPedido(cliente);
                    addProductos(pedido);
                    try {
                        asignarRepartidor(pedido);
                    }catch (UnavailableRidersException e){
                        System.out.println(e.getMessage());
                    }
                    mensaje = "Pedido creado" + pedido + "\n Precio total= " + precioTotal(pedido) + "\n Regalos: " + pedido.getGifts();
                    break;
                case 2:
                    System.out.println("indique id del pedido:");
                    int id = numCheck();
                    try{
                        pedido = pedidoFinder(id);
                        pedido.setEntregado(true);
                        mensaje = "pedido con id " + id + " marcado como entregado.";
                    } catch(idNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        mensaje = listarPendientes().toString();
                    } catch (OrderNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        mensaje = listarEntregados().toString();
                    }catch (OrderNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    mensaje = "Adiós.";
                    break;
                default:
                    mensaje = "Opción no válida, elija del 1 al 5.";
                    break;
            }
            System.out.println(mensaje);

        } while (num < 5);

    }

    public static int numCheck() {
        int num = 0;
        boolean b = false;
        while (!b) {
            try {
                num = sc.nextInt();
                b = true;
            } catch (InputMismatchException e) {
                System.out.println("INSERTA UN NÚMERO");
                sc.nextLine();
            }
        }
        return num;
    }

}

