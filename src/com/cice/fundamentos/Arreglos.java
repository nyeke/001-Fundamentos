package com.cice.fundamentos;

public class Arreglos {
    int[] numeros = new int[5];
    static int[] otrosNumeros = {1,2,3,4,5};
    int numero1[] = new int[5];

    public static void main(String[] args)
    {
        System.out.println("La segunda posicion es: "+otrosNumeros[1]);

        otrosNumeros[1] = 3;

        System.out.println("La segunda posicion ahora es: "+otrosNumeros[1]);

        int size = otrosNumeros.length;

        System.out.println("La longitud del array es: "+size);
    }

}
