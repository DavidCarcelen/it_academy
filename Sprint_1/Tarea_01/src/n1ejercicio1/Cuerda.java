package n1ejercicio1;

public class Cuerda extends Instrumento{

    public Cuerda(String name, int precio) {
        super(name, precio);
    }

    @Override
    public String tocar() {
        return "Suena un " + this.name;
    }

}
