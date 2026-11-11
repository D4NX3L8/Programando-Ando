package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 01 (Basico)
 * Positivo, negativo o cero
 *
 * Enunciado:
 * Pide un numero entero e imprime si es Positivo, Negativo o Cero.
 *  * Usa if / else if / else.
 *
 * Autor: Daniel Ochoa
 */
public class Ej01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Cero");
        }
    }
}
