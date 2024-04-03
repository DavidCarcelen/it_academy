package n1ejercicio1;

public class Producto {
    private String nombre = "";
    private double precio = 0;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }


}
