package n1ejercicio1;

public class TrabajadorPresencial extends Trabajador{
    private static int gasolina;

    public TrabajadorPresencial(String name, String lastName, int precioHora, int gasolina) {
        super(name, lastName, precioHora);
        TrabajadorPresencial.gasolina = gasolina;
    }

    @Override
    public int calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + gasolina;
    }
}
