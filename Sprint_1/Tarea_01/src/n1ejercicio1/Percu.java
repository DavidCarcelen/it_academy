package n1ejercicio1;

public class Percu extends Instrumento {

    public Percu(String name, int precio) {
        super(name, precio);
    }

    @Override
    public String tocar() {
        return "Suena un " + this.name;
    }

}
