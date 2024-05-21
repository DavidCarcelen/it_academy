package examen;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class Sala {
    private UUID id = UUID.randomUUID();
    private String name;
    private Dificultad dificultad;
    private double precio;
    private Set<Pista> pistas = new HashSet<>();

    private Set<ObjetoDecoracion> objetos = new HashSet<>();


    public Sala(String name, Dificultad dificultad, double precio) {
        this.name = name;
        this.dificultad = dificultad;
        this.precio = precio;
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Dificultad getDificultad() {
        return dificultad;
    }
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }
    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Set<Pista> getPistas() {
        return pistas;
    }

    public Set<ObjetoDecoracion> getObjetos() {
        return objetos;
    }

    public double calcularPrecioTotal(){
        double precioPistas = this.pistas.stream()
                .mapToDouble(Pista::getPrecio)
                .sum();
        double precioObjetos = this.objetos.stream()
                .mapToDouble(ObjetoDecoracion::getPrecio)
                .sum();
        return this.precio + precioPistas + precioObjetos;
    }

}
