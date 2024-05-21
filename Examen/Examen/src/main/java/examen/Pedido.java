package examen;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contadorId = 0;

    private int id ;
    private Cliente cliente;
    private List<Producto> productos;
    private Repartidor repartidor;
    private boolean entregado;

    private double precioTotal;

    public Pedido(Cliente cliente) {
        this.id = ++contadorId ;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.repartidor = DeliveryGestor.asignarRepartidor();
        this.entregado = false;
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

    public void listaProductos(){
        int pins = 0;
        int gorra = 0;
        for(Producto producto : this.productos){
            if (producto.getProductType().equals(ProductType.BURRITO)) {
                pins++;
            }else if (producto.getProductType().equals(ProductType.HAMBURGUESA)){
                gorra++;
            }
            if(pins != 0){
                System.out.println("Te llevas " + pins + " de regalo!!");
            }else if (gorra != 0){
                System.out.println("Te llevas " + gorra + " de regalo!!");
            }
            System.out.println(producto.getProductType());
        }
    }

    public double precioTotal(){
        double precioSuma = 0;
        for (Producto producto : this.productos){
            precioSuma += producto.getPrecio();
        }
        if (this.repartidor.getTransporte().equals(Transporte.BICICLETA)){
            precioSuma = precioSuma + (precioSuma * Transporte.BICICLETA.modificadorPrecio / 100);
        } else if (this.repartidor.getTransporte().equals(Transporte.MOTO)){
            precioSuma = precioSuma + (precioSuma * Transporte.MOTO.modificadorPrecio / 100);
        }
        return precioSuma;
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
