package n1ejercicio1;

public class Viento extends Instrumento{

    public Viento(String name, int precio) {
        super(name, precio);
        System.out.println("Se ha llamado al constructor de viento");
    }

    public String tocar() {
        return "Suena un " + this.name;
    }
    {
        System.out.println("Bloque de inicializacion que salta cada instancia de clase");
    }
    static {
        System.out.println("Bloque static de viento, solo se llama una vez");
    }

}
