package n2ejercicio1;

public class Telefono {
    private String marca ;
    private String model;

    public Telefono(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void llamar(String num){
        System.out.println("Se está llamando al " + num);

    }
}
