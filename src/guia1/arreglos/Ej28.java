package guia1.arreglos;

/**
 * Guia 1 - Ejercicio 28 (Medio)
 * Primeros 20 numeros y su cubo
 *
 * Enunciado:
 * Muestra los primeros 20 numeros y su cubo (n^3) usando un ciclo for.
 *  * Recuerda: en Java la potencia NO es ^ (ese operador es XOR).
 *
 * Autor: Daniel Ochoa Taborda
 */
public class Ej28 {

    public static void main(String[] args) {
        for (int n = 1; n <= 20; n++) {
            int cubo = n * n * n;
            System.out.println(n + " -> " + cubo);
        }
    }
}
