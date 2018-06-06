package com.cice.ejercicio6;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,-7,8,9};
        int recorrido = 0;

        while (array[recorrido] > 0){
            System.out.println("El valor es: " + array[recorrido]);
            recorrido++;
        }

        System.out.println("Se han recorrido " + recorrido + " posiciones");
    }
}
