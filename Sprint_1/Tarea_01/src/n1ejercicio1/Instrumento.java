package n1ejercicio1;

public abstract class Instrumento {
    String name ;
    int precio;
    static String staticText = "Static de la super clase";

    public Instrumento(String name, int precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return this.name;
    }
    public int getPrecio() {
        return this.precio;
    }

    public void setName (String name) {
        this.name = name;
    }
    public void setPrecio (int precio) {
        this.precio = precio;
    }

    public abstract String tocar();

    static {
        System.out.println(staticText);

    }

}
