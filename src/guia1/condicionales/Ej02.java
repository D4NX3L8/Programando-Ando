package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 02 (Basico)
 * Par o impar
 *
 * Enunciado:
 * Pide un numero entero y determina si es Par o Impar usando el operador modulo (%).
 *
 * Autor: Daniel Ochoa
 */
public class Ej02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
