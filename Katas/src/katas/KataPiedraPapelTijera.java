package katas;

import java.util.Scanner;

public class KataPiedraPapelTijera {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int player = 1;

        Scanner input = new Scanner(System.in);

        while (player!=3){
            System.out.println("Jugador " + player + ", elije una opcion:\n" +
                    "1 piedra\n" +
                    "2 papel\n" +
                    "3 tijera" );
            if (player == 1){
                num1 = input.nextInt();
            } else {
                num2 = input.nextInt();
            }
            if (num1<4 && num2<4){
                player++;
            } else{
                System.out.println("Introduce un valor de 1 a 3");
            }
        }
        if (num1 == num2){
            System.out.println("Empate!");
        } else if (num1 == (num2 +1) || ((num1 == 1 ) && (num2 == 3 ))) {
            System.out.println("Gana el jugador uno");
        }else{
            System.out.println("Gana el jugador 2");
        }

    }
}
