package com.cice.fundamentos;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        boolean condicion = false;

        //Estrucutra control IF ELSE
        if (condicion) {
            System.out.println("Condicion cumplida");
        } else {
            System.out.println("No se cumple la condicion");
        }

        String nombre = "Ernesto";

        //SWITCH
        switch (nombre) {
            case "Antonio":
                System.out.println("Nombre introducido es Antonio");
                break;
            case "Pedro":
                System.out.println("Nombre introducido es Pedro");
                break;
            case "Manuel":
                System.out.println("Nombre introducido es Manuel");
                break;
            case "Ernesto":
                System.out.println("Nombre introducido es Ernesto");
                break;
            default:
                System.out.println("Nombre no introducido");
        }

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
