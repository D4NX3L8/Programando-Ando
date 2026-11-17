package guia1.condicionales;

import java.util.Scanner;

/**
 * Ej07 - Mayor de tres numeros.
 * Ademas detecta empates con el mayor.
 */
public class Ej07 {

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej07: Mayor de tres numeros ===");
        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int c = sc.nextInt();

        int mayor = Math.max(a, Math.max(b, c));

        // Cuantos numeros son iguales al mayor
        int iguales = 0;
        if (a == mayor) {
            iguales++;
        }
        if (b == mayor) {
            iguales++;
        }
        if (c == mayor) {
            iguales++;
        }

        System.out.println("El mayor es: " + mayor);
        if (iguales == 2) {
            System.out.println("Empate entre dos numeros");
        } else if (iguales == 3) {
            System.out.println("Empate entre los tres");
        }
    }
}
