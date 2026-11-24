package guia2.dialogos;

import javax.swing.JOptionPane;

/**
 * Guia 2 - Validacion con bucle (retry) (Intermedio)
 *
 * Ejercicio de la seccion 3.2 (Try-Catch).
 *
 * Enunciado:
 * Pide un numero entre 1 y 100 y repite el dialogo hasta que sea valido.
 *  * Usa while con una bandera boolean valido.
 *  * Captura NumberFormatException e IllegalArgumentException (lanzada con throw si esta fuera de rango).
 *
 * Autor: Juan Pablo Arismendy
 */
public class Ej5Bucle {

    public static void main(String[] args) {
        boolean valido = false;

        while (!valido) {
            try {
                String texto = JOptionPane.showInputDialog(null,
                        "Ingresa un numero entre 1 y 100:",
                        "Validacion",
                        JOptionPane.QUESTION_MESSAGE);

                int numero = Integer.parseInt(texto);
                if (numero < 1 || numero > 100) {
                    throw new IllegalArgumentException("Fuera de rango");
                }

                JOptionPane.showMessageDialog(null,
                        "Numero aceptado: " + numero,
                        "Validacion",
                        JOptionPane.INFORMATION_MESSAGE);
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Solo numeros enteros.",
                        "Dato invalido",
                        JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null,
                        "El numero debe estar entre 1 y 100.",
                        "Dato fuera de rango",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
