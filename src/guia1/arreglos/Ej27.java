package guia1.arreglos;

/**
 * Guia 1 - Ejercicio 27 (Avanzado)
 * Cuadrado de asteriscos 6x6
 *
 * Enunciado:
 * Imprime un cuadrado de 6x6 asteriscos usando ciclos for anidados.
 *
 * Autor: Daniel Ochoa Taborda
 */
public class Ej27 {

    public static void main(String[] args) {
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
