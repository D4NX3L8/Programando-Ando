package guia1.ciclos;

/**
 * Guia 1 - Ejercicio 21 (Medio)
 * Factorial
 *
 * Enunciado:
 * Calcula el factorial de un numero guardado en una variable con un ciclo for.
 *  * Usa long para evitar desbordamiento (13! ya no cabe en int).
 *
 * Autor: Jeronimo Henao
 */
public class Ej21 {

   public static void main(String[] args) {

        int n = 10;
        long factorial = 1;

        if (n < 0) {
            System.out.println("No existe factorial para numeros negativos");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + n + " es: " + factorial);
        }

    }
}