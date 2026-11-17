package guia1.arreglos;

/**
 * Guia 1 - Ejercicio 26 (Medio)
 * Contar ocurrencias
 *
 * Enunciado:
 * Cuenta cuantas veces aparece un numero especifico dentro de un arreglo int[].
 *
 * Autor: Jeronimo Henao
 */
public class Ej26 {

     public static void main(String[] args) {

        int[] nums = {5, 8, 12, 3, 7, 15, 9, 2, 10, 4};

        int buscado = 7;
        int contador = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == buscado) {
                contador++;
            }
        }

        if (contador == 1) {
            System.out.println(buscado + " aparece " + contador + " vez");
        } else {
            System.out.println(buscado + " aparece " + contador + " veces");
        }

    }
}