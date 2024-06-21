package examen.model;

import examen.service.DeliveryGestor;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contadorId = 0;

    private int id ;
    private Cliente cliente;
    private List<Producto> productos;
    private Repartidor repartidor;
    private boolean entregado;

    private List<String> gifts;

    public Pedido(Cliente cliente) {
        this.id = ++contadorId ;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.entregado = false;
        this.gifts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
    public List<String> getGifts() {
        return gifts;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente.getNombre() +
                ", repartidor=" + repartidor.getNombre() +
                ", entregado=" + entregado +
                '}';
    }
}
