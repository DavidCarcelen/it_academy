package examen;

import java.util.UUID;

public class Pista {
    private UUID id = UUID.randomUUID();
    private double precio;
    private String name;
    private int tiempo;
    private String tematica;

    public Pista(double precio, String name, int tiempo, String tematica) {
        this.precio = precio + (precio * 10 / 100);
        this.name = name;
        this.tiempo = tiempo;
        this.tematica = tematica;
    }

    public UUID getId() {
        return id;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public String getTematica(){
        return tematica;
    }

    public void setTematica(String tematica){
        this.tematica = tematica;
    }
}
