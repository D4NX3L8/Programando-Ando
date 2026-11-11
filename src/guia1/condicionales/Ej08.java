package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 08 (Medio)
 * Descuento por compra
 *
 * Enunciado:
 * Pide el valor de una compra y aplica descuento:
 *  * > 500000 = 20% | > 200000 = 15% | > 100000 = 10%.
 *  * Muestra valor original, valor del descuento y total a pagar.
 *
 * Autor: Daniel Ochoa
 */
public class Ej08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double compra = sc.nextDouble();

        if (compra < 0) {
            System.out.println("Valor invalido");
            return;
        }

        double descuento;
        if (compra > 500000) {
            descuento = compra * 0.20;
        } else if (compra > 200000) {
            descuento = compra * 0.15;
        } else if (compra > 100000) {
            descuento = compra * 0.10;
        } else {
            descuento = 0;
        }

        double total = compra - descuento;

        System.out.println("Valor original: " + String.format("%,.0f", compra));
        System.out.println("Valor del descuento: " + String.format("%,.0f", descuento));
        System.out.println("Total a pagar: " + String.format("%,.0f", total));
    }
}
