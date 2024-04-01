package n1ejercicio1;

public class Coche {
    String marca;
    int potencia;
    String color;


    public Coche(String marca, int potencia, String color) {
        this.marca = marca;
        this.potencia = potencia;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }
    public int getPotencia() {
        return potencia;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
