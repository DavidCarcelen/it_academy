package examen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeliveryGestor {
    private Repartidor repartidor1 = new Repartidor("Bob",true,Transporte.MOTO);
    private Repartidor repartidor2 = new Repartidor("John",true,Transporte.BICICLETA);
    private Repartidor repartidor3 = new Repartidor("Doug",true,Transporte.PIE);

    private static List<Repartidor> repartidores = new ArrayList<>();
    public DeliveryGestor() {
        repartidores.add(repartidor1);
        repartidores.add(repartidor2);
        repartidores.add(repartidor3);
    }

    private static List<Pedido> pedidos = new ArrayList<>();

    public static Pedido crearPedido(Cliente cliente){
            Pedido pedido = new Pedido(cliente);
            pedidos.add(pedido);
            return pedido;
    }

    public static Repartidor asignarRepartidor() throws NullPointerException{
        List<Repartidor> repartidoresDisponibles = repartidores.stream()
                .filter(Repartidor::isDisponibilidad)
                .collect(Collectors.toList());

        if (repartidoresDisponibles.isEmpty()) {
            throw new NullPointerException("No hay repartidores disponibles");
        }
        int randomIndex = (int) (Math.random() * repartidoresDisponibles.size());
        Repartidor repartidorAsignado = repartidoresDisponibles.get(randomIndex);
        repartidorAsignado.setDisponibilidad(false);
        return repartidorAsignado;
    }
    public static Pedido pedidoFinder(int id) {
        return pedidos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static List<Pedido> listarPendientes (){
        return pedidos.stream()
                .filter(pedido -> !pedido.isEntregado())
                .collect(Collectors.toList());
    }
    public static List<Pedido> listarEntregados (){
        return pedidos.stream()
                .filter(Pedido::isEntregado)
                .collect(Collectors.toList());
    }
    public static String addProductosPedido (Pedido pedido, ProductType productType){
        Producto producto = new Producto(productType);
        pedido.getProductos().add(producto);
        return "Producto añadido";
    }


}
