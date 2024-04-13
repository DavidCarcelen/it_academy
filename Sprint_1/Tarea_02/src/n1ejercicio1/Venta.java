package n1ejercicio1;

import java.util.ArrayList;

public class Venta {
    ArrayList<Producto> productos = new ArrayList<Producto>();
    private double precioTotal;

    public String calcularTotal() throws VentaVaciaException{
        String mensaje = "";
        if (productos.isEmpty()){
            throw new VentaVaciaException("Para hacer una venta primero debes añadir productos");
        }
        for(Producto producto: productos){
            precioTotal += producto.getPrecio();
        }
        mensaje = "La suma total es: " + precioTotal + " €";
        return mensaje;
    }
    public String listaProductos(){
        String nombre = "";
        String lista = "";
        for(Producto a: productos){
            nombre = a.getNombre();
            lista += nombre + ", ";
        }
        return lista;
    }

    public String crearProducto(String nombre, double precio) {
        Producto producto = new Producto(nombre, precio);
        productos.add(producto);
        return "Producto "+ nombre + " añadido a la lista.";
    }

}
