package n1ejercicio1;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Llamando desde main a " + Instrumento.staticText);

        Viento viento = new Viento ("Saxo", 2000);
        Viento viento2 = new Viento ("Flauta", 2000);//carga de la clase por instancia
        Percu percu = new Percu ("Plato", 400);
        Cuerda cuerda = new Cuerda ("Banjo", 600);

        System.out.println(viento.tocar());
        System.out.println(viento2.tocar());
        System.out.println(percu.tocar());
        System.out.println(cuerda.tocar());

    }

}
