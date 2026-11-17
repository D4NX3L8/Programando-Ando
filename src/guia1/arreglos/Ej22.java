package guia1.arreglos;

/**
 * Guia 1 - Ejercicio 22 (Medio)
 * Recorrer un arreglo
 *
 * Enunciado:
 * Declara un arreglo int[] de 10 numeros e imprime cada elemento con un ciclo for.
 *
 * Autor: Jeronimo Henao
 */


public class Ej22 {

    public static void main(String[] args) {

        int[] nums = {5, 8, 12, 3, 7, 15, 9, 2, 10, 4};

        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "] = " + nums[i]);
        }

    }
}
