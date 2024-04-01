package n1ejercicio1;

public class Trabajador {
    private String name;
    private String lastName;
    private int precioHora;

    public Trabajador(String name, String lastName, int precioHora) {
        this.name = name;
        this.lastName = lastName;
        this.precioHora = precioHora;
    }

    public int calcularSueldo(int horasTrabajadas){
        return horasTrabajadas * this.precioHora;

    }
}
