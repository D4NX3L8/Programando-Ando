package guia1.ciclos;

/**
 * Guia 1 - Ejercicio 14 (Basico)
 * Impares del 1 al 100 con while
 *
 * Enunciado:
 * Imprime todos los numeros impares del 1 al 100 usando un ciclo while.
 *
 * Autor: Jeronimo Henao
 */
public class Ej14 {

    public static void main(String[] args) {

        int numero = 1;

        while (numero <= 100) {
            System.out.println(numero);
            numero += 2;
        }

    }
}