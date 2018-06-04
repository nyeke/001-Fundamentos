package com.cice.fundamentos;

public class Bucles {
    public static void main(String[] args) {

        //BUCLE FOR
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        int i = 0;

        for (;i<2;){
            System.out.println("Hola");
            i++;
        }

        int[] array = {1,2,3,4,5,6,7,8,9};

        //BUCLE FOREACH
        for (int a:array) {
            System.out.println("Valor array: "+ a);

        }

        //WHILE
        i = 1;
        while (i<array.length){
            System.out.println("I vale: " + i++);
        }

        do {
            System.out.println("Restando i: " + i++);
        }while (i < 30);

    }
}
