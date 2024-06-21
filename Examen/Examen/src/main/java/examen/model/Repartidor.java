package examen.model;

public class Repartidor {

    private String nombre;
    private boolean disponibilidad ;
    private Transporte transporte;

    public Repartidor(String nombre, boolean disponibilidad, Transporte transporte) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.transporte = transporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

}
