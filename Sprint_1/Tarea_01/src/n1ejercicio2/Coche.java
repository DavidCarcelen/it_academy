package n1ejercicio2;

public class Coche {
    //ATR
    private static final String MARCA = "Jeep";
    private static String modelo;
    private final int potencia;

    public Coche (String mod, int potencia){
        this.potencia = potencia;
        Coche.modelo = mod;

    }
    //SETTER de potencia, no deja hacer modificar el valor al ser final.
    /*public void setPotencia(int potencia){
        this.potencia = potencia;
    }*/

    public static String frenar(){
        return "el coche está frenando";
    }
    public String acelerar(){
        return "el coche está acelerando";
    }

    @Override
    public String toString() {
        return "marca " + MARCA + " modelo " + modelo + " potencia " + this.potencia;
    }
}
