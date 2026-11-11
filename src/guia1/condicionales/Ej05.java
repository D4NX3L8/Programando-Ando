package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 05 (Medio)
 * Anio bisiesto
 *
 * Enunciado:
 * Pide un anio y determina si es bisiesto.
 *  * Regla: divisible entre 4, no entre 100, excepto si es divisible entre 400.
 *
 * Autor: Daniel Ochoa
 */
public class Ej05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un anio: ");
        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println(anio + " es bisiesto");
        } else {
            System.out.println(anio + " no es bisiesto");
        }
    }
}
