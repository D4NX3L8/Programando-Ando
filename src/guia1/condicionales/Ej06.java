package guia1.condicionales;

import java.util.Scanner;

/**
 * Ej06 - Clasificacion de notas.
 * Primero se valida el rango 0-100 y despues se clasifica de mayor a menor.
 */
public class Ej06 {

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej06: Clasificacion de notas ===");
        System.out.print("Ingrese la nota (0 a 100): ");
        int nota = sc.nextInt();

        // Validar primero el rango y no seguir si es invalida
        if (nota < 0 || nota > 100) {
            System.out.println("Nota invalida");
            return;
        }

        String clasificacion;
        if (nota >= 90) {
            clasificacion = "Excelente";
        } else if (nota >= 80) {
            clasificacion = "Bueno";
        } else if (nota >= 70) {
            clasificacion = "Aceptable";
        } else if (nota >= 60) {
            clasificacion = "Insuficiente";
        } else {
            clasificacion = "Reprobado";
        }

        System.out.println("Nota " + nota + ": " + clasificacion);
    }
}
