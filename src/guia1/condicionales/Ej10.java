package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 10 (Avanzado)
 * Calculadora de IMC
 *
 * Enunciado:
 * Pide peso (kg) y altura (m). IMC = peso / (altura * altura).
 *  * Clasifica: <18.5 Bajo peso | 18.5-24.9 Normal | 25-29.9 Sobrepeso | >=30 Obesidad.
 *  * Valida que peso y altura sean mayores que cero.
 *
 * Autor: Daniel Ochoa
 */
public class Ej10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese la altura (m): ");
        double altura = sc.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso y altura deben ser mayores que cero");
            return;
        }

        double imc = peso / (altura * altura);
        System.out.println("IMC: " + String.format("%.2f", imc));

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
}
