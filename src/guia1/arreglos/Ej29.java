package guia1.arreglos;

import java.util.Scanner;

/**
 * Ej29 - Recorrer una cadena e imprimir un caracter por linea.
 * Se usa for clasico con length() y charAt(i), no for-each.
 */
public class Ej29 {

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej29: Recorrer una cadena ===");
        System.out.print("Ingrese una palabra (sin espacios): ");
        String texto = sc.next();

        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }
}
