package n1ejercicio1;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> lista = new ArrayList<Producto>();
    private double precioTotal = 0;
    public String calcularTotal(){
        //lanza excepción personalizada "VentaBuidaException"
        String mensaje = "";
        double suma = 0;
        if (lista.isEmpty()){
            mensaje = "Para hacer una venta primero debes añadir productos";
        } else {
            for(Producto a: lista){
                //suma = suma + a.precio;
            }

        }
        return mensaje;
    }

}
