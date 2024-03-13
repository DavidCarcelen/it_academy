package n1ejercicio1;

public class Cuerda extends Instrumento{

    public Cuerda(String name, int precio) {
        super(name, precio);
    }

    public String tocar() {
        return "Suena un " + this.name;
    }

}
