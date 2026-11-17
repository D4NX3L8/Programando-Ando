package guia1.arreglos;

import java.util.Scanner;

/**
 * Ej23 - Suma de los elementos de un arreglo.
 */
public class Ej23 {

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej23: Suma de un arreglo ===");
        int[] nums = {5, 12, 7, 3, 20, 8, 15, 1, 9, 4};

        int suma = 0;
        for (int i = 0; i < nums.length; i++) { // < y no <=
            suma += nums[i];
        }
        System.out.println("La suma de los elementos es: " + suma); // 84
    }
}
