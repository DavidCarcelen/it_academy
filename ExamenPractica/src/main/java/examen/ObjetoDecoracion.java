package examen;

import java.util.UUID;

public class ObjetoDecoracion {

    private UUID id = UUID.randomUUID();
    private double precio;
    private String name;
    private String material;

    public ObjetoDecoracion(double precio, String name, String material) {
        this.precio = precio + (precio * 21 / 100);
        this.name = name;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
