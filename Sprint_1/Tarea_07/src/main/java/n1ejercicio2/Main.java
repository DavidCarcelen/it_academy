package n1ejercicio2;


public class Main {
    public static void main(String[] args) {
        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Bob","Lock",30);
        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("John", "Dow", 40, 50);

        System.out.println("Sueldo del trabajador online: " + trabajadorOnline.calcularSueldo(30));
        System.out.println("Sueldo del trabajador presencial: " + trabajadorPresencial.calcularSueldo(30));


        metodoObsoletoOnline(trabajadorOnline);
        metodoObsoletoPresencial(trabajadorPresencial);

    }
    @SuppressWarnings("deprecated")
    public static void metodoObsoletoOnline(TrabajadorOnline trabajadorOnline){
        System.out.println("Gasto material:" + trabajadorOnline.gastoMaterial(40));
    }
    @SuppressWarnings("deprecated")
    public static void metodoObsoletoPresencial(TrabajadorPresencial trabajadorPresencial){
        System.out.println("Sueldo anual: " + trabajadorPresencial.sueldoAnual(40));
    }
}
