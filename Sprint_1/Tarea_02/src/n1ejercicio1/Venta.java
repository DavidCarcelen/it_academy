package n1ejercicio1;

import java.util.ArrayList;

public class Venta {
    ArrayList<Producto> lista = new ArrayList<Producto>();
    private double precioTotal = 0;

    public String calcularTotal(){
        //lanza excepción personalizada "VentaBuidaException"
        String mensaje = "";
        if (lista.isEmpty()){
            mensaje = "Para hacer una venta primero debes añadir productos";
        } else {
            for(Producto a: lista){
                precioTotal = precioTotal + a.getPrecio();
            }
            mensaje = "La suma total es: " + precioTotal + " €";

        }
        return mensaje;
    }


}
