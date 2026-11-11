package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 06 (Medio)
 * Clasificacion de notas
 *
 * Enunciado:
 * Pide una nota entre 0 y 100 y clasifica:
 *  * 90-100 Excelente | 80-89 Bueno | 70-79 Aceptable | 60-69 Insuficiente | <60 Reprobado.
 *  * Valida que la nota este en el rango 0-100.
 *
 * Autor: Daniel Ochoa
 */
public class Ej06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota (0-100): ");
        int nota = sc.nextInt();

        if (nota < 0 || nota > 100) {
            System.out.println("Nota invalida");
        } else if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 80) {
            System.out.println("Bueno");
        } else if (nota >= 70) {
            System.out.println("Aceptable");
        } else if (nota >= 60) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Reprobado");
        }
    }
}
