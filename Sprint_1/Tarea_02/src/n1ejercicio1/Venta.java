package n1ejercicio1;

import java.util.ArrayList;

public class Venta {
    ArrayList<Producto> productos = new ArrayList<Producto>();
    private double precioTotal = 0;

    public String calcularTotal()throws VentaVaciaException{
        String mensaje = "";
        //try {
            if (productos.isEmpty()){
                throw new VentaVaciaException("Para hacer una venta primero debes añadir productos");
            } else {
                for(Producto a: productos){
                    precioTotal += a.getPrecio();
                }
                mensaje = "La suma total es: " + precioTotal + " €";
            }
       /* } catch(VentaVaciaException e) {
                mensaje = "ERROR " + e.getMessage();
        }*/
        return mensaje;
    }


}
