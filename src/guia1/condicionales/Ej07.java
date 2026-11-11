package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 07 (Medio)
 * Mayor de tres numeros
 *
 * Enunciado:
 * Pide tres numeros e imprime cual es el mayor.
 *  * Extra: si hay empate entre dos o entre los tres, indicarlo.
 *
 * Autor: Daniel Ochoa
 */
public class Ej07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();

        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        int iguales = 0;
        if (num1 == mayor) {
            iguales++;
        }
        if (num2 == mayor) {
            iguales++;
        }
        if (num3 == mayor) {
            iguales++;
        }

        System.out.println("El mayor es: " + mayor);

        if (iguales == 3) {
            System.out.println("Empate entre los tres");
        } else if (iguales == 2) {
            System.out.println("Empate entre dos numeros");
        }
    }
}
