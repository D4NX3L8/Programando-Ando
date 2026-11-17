package guia1.arreglos;

/**
 * Guia 1 - Ejercicio 24 (Medio)
 * Mayor de un arreglo
 *
 * Enunciado:
 * Encuentra el numero mayor dentro de un arreglo int[] usando un ciclo for.
 *
 * Autor: Jeronimo Henao
 */

public class Ej24 {

    public static void main(String[] args) {

        int[] nums = {
            5, 12, 8, 20, 3,
            15, 7, 9, 11, 4,
            18, 6, 14, 2, 10,
            13, 1, 16, 19, 17
        };

        int mayor = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > mayor) {
                mayor = nums[i];
            }
        }

        System.out.println("El numero mayor es: " + mayor);

    }
}
