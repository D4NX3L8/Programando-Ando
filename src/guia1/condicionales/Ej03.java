package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 03 (Basico)
 * Control de acceso por edad
 *
 * Enunciado:
 * Pide la edad. Si es >= 18: 'Puede ingresar'. Si es menor: 'Acceso denegado'.
 *  * Si es negativa: 'Edad invalida'. Valida lo negativo ANTES que lo demas.
 *
 * Autor: Daniel Ochoa
 */
public class Ej03 {

    public static void main(String[] args) {
      System.out.print("Ingresa tu edad: ");

        Scanner num = new Scanner(System.in);
        int age = num.nextInt();

        if (age < 0) {
            System.out.println("El valor ingresado no es valido");
        }
        else if (age  < 18) {
            System.out.println("Acceso denegado");
        }
        else {
            System.out.println("Puede ingresar");
        }
    }
}