package n1ejercicio2;

import n1ejercicio1.Trabajador;

public class TrabajadorPresencial extends Trabajador {
    private static int gasolina;

    public TrabajadorPresencial(String name, String lastName, int precioHora, int gasolina) {
        super(name, lastName, precioHora);
        TrabajadorPresencial.gasolina = gasolina;
    }

    @Override
    public int calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + gasolina;
    }
    @Deprecated
    public int sueldoAnual(int horasTrabajadas){
        int sueldo = super.calcularSueldo(horasTrabajadas)+ gasolina;
        return sueldo * 12;
    }
}
