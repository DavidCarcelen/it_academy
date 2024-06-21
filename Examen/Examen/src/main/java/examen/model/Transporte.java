package examen.model;

public enum Transporte {
    BICICLETA(1), MOTO(2), PIE(0);

    public final int modificadorPrecio;

    Transporte (int modificadorPrecio){
        this.modificadorPrecio = modificadorPrecio;
    }
}
