package com.cice.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Introduce un numero para calcular factorial: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= valor; i++){
            factorial*=i;
        }

        System.out.println("El factorial de " + valor + "  es: " + factorial);


    }
}
