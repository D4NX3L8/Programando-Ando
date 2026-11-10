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
 * Autor: Jeronimo Henao
 */
public class Ej03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 0) {
            System.out.println("Edad invalida");
        } else if (edad >= 18) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("Acceso denegado");
        }

        // No cerrar el Scanner de System.in (Guia1Main lo reutiliza para volver al menu).
    }
}
