package guia1.condicionales;

import java.util.Scanner;

/**
 * Ej01 - Positivo, negativo o cero.
 * Pide un numero entero y dice si es positivo, negativo o cero.
 */
public class Ej01 {

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej01: Positivo, negativo o cero ===");
        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positivo");
        } else if (n < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Cero");
        }
    }
}
