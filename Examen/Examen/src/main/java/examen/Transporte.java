package examen;

public enum Transporte {
    BICICLETA(1), MOTO(2), PIE(0);

    final int modificadorPrecio;

    Transporte (int modificadorPrecio){
        this.modificadorPrecio = modificadorPrecio;
    }
}
