package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 04 (Medio)
 * Calculadora con switch
 *
 * Enunciado:
 * Pide dos numeros y un operador (+ - * /). Resuelve con switch.
 *  * Valida la division entre cero y los operadores desconocidos.
 *
 * Autor: Jeronimo Henao
 */
public class Ej04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.print("Ingrese el operador (+ - * /): ");
        String operador = sc.next();

        switch (operador) {
            case "+":
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case "-":
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case "*":
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case "/":
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Error: Division entre cero");
                }
                break;
            default:
                System.out.println("Error: Operador desconocido");
        }
    }
}
