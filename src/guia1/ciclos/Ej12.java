package guia1.ciclos;

import java.util.Scanner;

/**
 * Ej12 - Numeros del 50 al 1 (ciclo descendente).
 */
public class Ej12 {

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej12: Numeros del 50 al 1 ===");
        for (int i = 50; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
