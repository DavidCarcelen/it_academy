package n2ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        float num1;
        float num2;
        float result;
        String operator = "";
        while (num != 5) {
            System.out.println("Elije una operación:\n1 suma\n2 resta\n3 multiplicacion\n4 division\n5 salir");
            num = input.nextInt();

            Operacion operacion = null;

            switch (num) {
                case 1:
                    operator="suma";
                    operacion = (a, b) -> a + b;
                    break;
                case 2:
                    operator="resta";
                    operacion = (a, b) -> a - b;
                    break;
                case 3:
                    operator="multiplicacion";
                    operacion = (a, b) -> a * b;
                    break;
                case 4:
                    operator="division";
                    operacion = (a, b) -> a / b;
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("No es una opción válida");

            }
            if(num<5){
                System.out.println("Indica el primer numero:");
                num1 = input.nextFloat();
                System.out.println("Indica el segundo numero");
                num2 = input.nextFloat();
                result = operacion.operacion(num1, num2);
                System.out.println("El resultado de la " + operator + " de " + num1 + " y " + num2 + " es " + result);
            }
        }
    }
}
