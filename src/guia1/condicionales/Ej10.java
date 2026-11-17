package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 10 (Avanzado)
 * Calculadora de IMC
 *
 * Autor: Jeronimo Henao
 */
public class Ej10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Error: peso o altura invalida");
        } else {
            double imc = peso / (altura * altura);

            System.out.printf("Su IMC es: %.2f%n", imc);

            if (imc < 18.5) {
                System.out.println("Clasificacion: Bajo peso");
            } else if (imc < 25) {
                System.out.println("Clasificacion: Normal");
            } else if (imc < 30) {
                System.out.println("Clasificacion: Sobrepeso");
            } else {
                System.out.println("Clasificacion: Obesidad");
            }
        }
    }
}