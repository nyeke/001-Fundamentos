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


    }
}
