package katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KataKonami2 {
    public static void main(String[] args) {
        String konamiCode = "ttggfhfhba";
        String playerCode = "";
        int num = 0;
        String entrada;

        Scanner sc = new Scanner(System.in);

        System.out.println("A jugar! usamos TFGH como arriba izquierda abajo derecha respectivamente.");

        while (!playerCode.equalsIgnoreCase(konamiCode)){
            entrada = sc.next();
            if (entrada.charAt(0) == konamiCode.charAt(num)){
                playerCode += entrada.charAt(0);
                num++;
            } else {
                playerCode = "";
                num = 0;
            }
        }
        System.out.println("Código Konami desbloqueado!!");
    }
}
