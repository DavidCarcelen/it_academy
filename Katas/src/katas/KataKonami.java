package katas;

import java.util.Scanner;

public class KataKonami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce código Konami, usaremos T F G H como arriba izquierda abajo derecha respectivamente:");

        String respuesta = input.next();

        input.close();

        if (respuesta.equalsIgnoreCase("ttggfhfhba")){
            System.out.println("Código Konami desbloqueado!!");
        } else {
            System.out.println("Vaya paquete");
        }
    }
}
