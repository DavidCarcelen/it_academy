package n1ejercicio1;

public class Main {
    public static void main(String[] args) {
        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Bob","Lock",30);
        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("John", "Dow", 40, 50);

        System.out.println("Sueldo del trabajador online: " + trabajadorOnline.calcularSueldo(30));
        System.out.println("Sueldo del trabajador presencial: " + trabajadorPresencial.calcularSueldo(30));

        //SE CONFIRMA QUE OVERRIDE ESTA FUNCIONANDO AL TENER REULTADOS DIFERENTES CON LA MISMA CANTIDAD DE HORAS TRABAJADAS



    }
}
