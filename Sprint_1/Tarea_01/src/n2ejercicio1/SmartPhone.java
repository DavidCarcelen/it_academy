package n2ejercicio1;

public class SmartPhone extends Telefono implements Camara, Reloj{

    public SmartPhone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void foto() {
        System.out.println("Se está haciendo una foto");
    }

    @Override
    public void alarma() {
        System.out.println("está sonando la alarma");

    }
}
