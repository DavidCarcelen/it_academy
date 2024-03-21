package n1ejercicio2;

import java.util.Scanner;

public class CalculoDni {
    public static void main(String[] args) {
        int dniInput = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce DNI sin letra");
        dniInput = input.nextInt();

        char letra = calcularLetra(dniInput);

        System.out.println(letra);

    }

    public static char calcularLetra(int dniInput){
        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = tabla.charAt(dniInput%23);
        return letra;
    }

}
