package examen.service;

import examen.model.Transporte;
import examen.exceptions.OrderNotFoundException;
import examen.exceptions.UnavailableRidersException;
import examen.exceptions.idNotFoundException;
import examen.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static examen.service.Menu.numCheck;

public class DeliveryGestor {
    private static final Repartidor repartidor1 = new Repartidor("Bob",true, Transporte.MOTO);
    private static final Repartidor repartidor2 = new Repartidor("John",true,Transporte.BICICLETA);
    private static final Repartidor repartidor3 = new Repartidor("Doug",true,Transporte.PIE);

    private static final List<Repartidor> repartidores = new ArrayList<>(Arrays.asList(repartidor1,repartidor2,repartidor3));

    private static List<Pedido> pedidos = new ArrayList<>();

    public static Pedido crearPedido(Cliente cliente){
            Pedido pedido = new Pedido(cliente);
            pedidos.add(pedido);
            return pedido;
    }

    public static void asignarRepartidor(Pedido pedido){
        List<Repartidor> repartidoresDisponibles = repartidores.stream()
                .filter(Repartidor::isDisponibilidad)
                .collect(Collectors.toList());

        if (repartidoresDisponibles.isEmpty()) {
            throw new UnavailableRidersException("No hay repartidores disponibles");
        }
        int randomIndex = (int) (Math.random() * repartidoresDisponibles.size());
        Repartidor repartidorAsignado = repartidoresDisponibles.get(randomIndex);
        repartidorAsignado.setDisponibilidad(false);
        pedido.setRepartidor(repartidorAsignado);
    }
    public static Pedido pedidoFinder(int id) {
        return pedidos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(()-> new idNotFoundException("Pedido no encontrado con id " + id));
    }

    public static List<Pedido> listarPendientes (){
        List<Pedido>pendientes = pedidos.stream()
                .filter(pedido -> !pedido.isEntregado())
                .toList();
        if(pendientes.isEmpty()){
            throw new OrderNotFoundException("No hay pedidos pendientes.");
        }
        return pendientes;
    }
    public static List<Pedido> listarEntregados (){
        List<Pedido> entregados = pedidos.stream()
                .filter(Pedido::isEntregado)
                .collect(Collectors.toList());
        if (entregados.isEmpty()){
            throw new OrderNotFoundException("No hay pedidos entregados.");
        }
        return entregados;
    }
    public static String addProductosPedido (Pedido pedido, ProductType productType){
        Producto producto = new Producto(productType);
        pedido.getProductos().add(producto);
        pedido.getGifts().add(producto.getGift());
        return "Producto añadido";
    }

    public static void addProductos(Pedido pedido) {
        int numProducto = 0;
        String mensaje = "";
        while (numProducto < 5) {
            System.out.println("Añanadamos productos:\n" +
                    "1- Burrito\n" +
                    "2- Hamburguesa\n" +
                    "3- Kebab\n" +
                    "4- Pizza\n" +
                    "5- No añadir mas");
            numProducto = numCheck();
            switch (numProducto) {
                case 1:
                    mensaje = addProductosPedido(pedido, ProductType.BURRITO);
                    break;
                case 2:
                    mensaje = addProductosPedido(pedido, ProductType.HAMBURGUESA);
                    break;
                case 3:
                    mensaje = addProductosPedido(pedido, ProductType.KEBAB);
                    break;
                case 4:
                    mensaje = addProductosPedido(pedido, ProductType.PIZZA);
                    break;
                case 5:
                    mensaje = "Pedido completo";
                    break;
                default:
                    mensaje = "No es una opción válida, elija del 1 al 5";
                    break;

            }
            System.out.println(mensaje);

        }
    }
    public static double precioTotal(Pedido pedido){
        double precioSuma = 0;
        for (Producto producto : pedido.getProductos()){
            precioSuma += producto.getPrecio();
        }
        if (pedido.getRepartidor().getTransporte().equals(Transporte.BICICLETA)){
            precioSuma = precioSuma + (precioSuma * Transporte.BICICLETA.modificadorPrecio / 100);
        } else if (pedido.getRepartidor().getTransporte().equals(Transporte.MOTO)){
            precioSuma = precioSuma + (precioSuma * Transporte.MOTO.modificadorPrecio / 100);
        }
        return precioSuma;
    }


}
