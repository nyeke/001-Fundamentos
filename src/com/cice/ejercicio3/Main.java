package com.cice.ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que hora es:");

        int hora = sc.nextInt();
        if (hora <= 24) {
            switch (hora) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    System.out.println("Buenos dias");
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    System.out.println("Buenas tardes");
                    break;
                default:
                    System.out.println("Buenas noches");
                    break;
            }
        } else {
            System.out.println("Necesitas dormir mas");
        }
    }
}
