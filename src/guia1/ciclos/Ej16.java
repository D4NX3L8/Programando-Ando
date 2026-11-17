package guia1.ciclos;

/**
 * Guia 1 - Ejercicio 16 (Basico)
 * Suma de impares del 1 al 50
 *
 * Enunciado:
 * Calcula la suma de los numeros impares del 1 al 50 con un ciclo for.
 *  * Resultado esperado: 625.
 *
 * Autor: Jeronimo Henao
 */
public class Ej16 {

    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los impares es: " + suma);

    }
}