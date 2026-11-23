package guia1.ciclos;

/**
 * Guia 1 - Ejercicio 19 (Medio)
 * Multiplos de 10 del 1 al 200
 *
 * Enunciado:
 * Cuenta cuantos numeros del 1 al 200 son multiplos de 10 usando un ciclo for.
 *  * Resultado esperado: 20.
 *
 * Autor: Daniel Ochoa Taborda
 */
public class Ej19 {

    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 200; i++) {
            if (i % 10 == 0) {
                contador++;
            }
        }

        System.out.println(contador);
    }
}
