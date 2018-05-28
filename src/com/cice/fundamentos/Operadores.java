package com.cice.fundamentos;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketPermission;

public class Operadores {

    //Operadores de relacion

    static boolean r1 = 1 > 2;
    static boolean r2 = 1 < 2;
    static boolean r3 = 1 >= 1;
    static boolean r4 = 1 <= 2;
    static boolean r5 = 1 != 2;
    static boolean r6 = 1 == 2;

    public static void main (String... args){

        System.out.println("Operadores de relacion: ");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        //Operadores logicos && &; || |; ! ; ^;

        System.out.println("Operadores logicos: ");
        System.out.println(r1 || r2);
        System.out.println(r2 && r3);
        System.out.println(!r4);
        System.out.println(r5 ^ r4);

        // Operador Unario
        System.out.println("Operador unario: ");
        int a = 127;
        System.out.println(a);

        //Operadores de asignacion
        System.out.println("Operadores asignacion: ");
        int b = 5;
        b++; // b = b+1
        System.out.println(b++);
        b--; // b = b-1
        System.out.println(++b);
        b*=2; // b = b*2
        System.out.println(b);
        b/=5; // b = b/5
        System.out.println(b);

    }
}
