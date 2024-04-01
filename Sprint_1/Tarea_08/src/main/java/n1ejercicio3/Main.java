package n1ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>year = new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));

        Printer printer = y -> System.out.println(y);
        printerYear(printer, year);
    }
    public static void printerYear (Printer printer, ArrayList<String> year){
        printer.printerMethod(year);
    }

}


