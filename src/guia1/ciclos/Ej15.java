package guia1.ciclos;

import java.util.Scanner;

/**
 * Ej15 - Suma de los numeros del 1 al 100 (patron acumulador).
 */
public class Ej15 {

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej15: Suma del 1 al 100 ===");
        int suma = 0; // acumulador fuera del ciclo
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma); // 5050
    }
}
