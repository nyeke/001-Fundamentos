package com.cice.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int variable = 2;

        //Scanner para pedir datos por consola
        System.out.println("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        variable = sc.nextInt();

        if (variable % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es Impar");
        }


    }
}
