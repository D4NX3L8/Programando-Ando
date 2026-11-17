package guia1.ciclos;

import java.util.Scanner;

/**
 * Ej13 - Pares del 1 al 100.
 */
public class Ej13 {

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej13: Pares del 1 al 100 ===");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
