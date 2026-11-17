package guia1.ciclos;

import java.util.Scanner;

/**
 * Ej18 - Tablas de multiplicar del 1 al 10 (ciclos anidados).
 */
public class Ej18 {

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej18: Tablas del 1 al 10 ===");
        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("--- Tabla del " + tabla + " ---");
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
            }
        }
    }
}
