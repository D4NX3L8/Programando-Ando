package guia1.arreglos;

/**
 * Guia 1 - Ejercicio 25 (Medio)
 * Menor de un arreglo
 *
 * Enunciado:
 * Encuentra el numero menor dentro de un arreglo int[] usando un ciclo for.
 *
 * Autor: Daniel Ochoa Taborda
 */
public class Ej25 {

    public static void main(String[] args) {
        int[] nums = {5, 12, 7, 3, 20, 8, 15, 1, 9, 4};
        int menor = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < menor) {
                menor = nums[i];
            }
        }

        System.out.println(menor);
    }
}
