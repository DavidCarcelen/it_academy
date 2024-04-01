package n1ejercicio2;

import n1ejercicio1.Trabajador;

public class TrabajadorOnline extends Trabajador {
    final int INTERNET = 30;

    public TrabajadorOnline(String name, String lastName, int precioHora) {
        super(name, lastName, precioHora);
    }

    @Override
    public int calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + INTERNET;
    }
    @Deprecated
    public int gastoMaterial(int horasTrabajadas){
        return horasTrabajadas/10;
    }
}
