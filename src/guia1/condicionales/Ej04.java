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
 * Autor: Daniel Ochoa
 */
public class Ej04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Operador invalido");
                break;
        }
    }
}
