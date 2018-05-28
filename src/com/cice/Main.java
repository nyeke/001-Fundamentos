package com.cice;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

public class Main {
    /**
     * Prueba de documentacion
     * @param args
     */
    public static void main(String[] args) {

        int a=2;
        float comaFlota = 1.15f;
        double decimal = 1.345;
        long enteroGrande = 1234567890;
        char caracter = 'b';
        boolean booleano = false;

        String cadenaCaracter = "Bienvenido";

        System.out.println(cadenaCaracter);
        System.out.println("Prueba concatena 1: " + a*2+6/5);
        System.out.println("Prueba concatena 2: " + a*(2+6/5));
        System.out.println("El cuadrado de 2 es: " + a*a);

    }
}
