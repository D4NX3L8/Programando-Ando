package guia2.dialogos;

import javax.swing.JOptionPane;

/**
 * Guia 2 - Division entera basica (Basico)
 *
 * Ejercicio de la seccion 3.2 (Try-Catch).
 *
 * Enunciado:
 * Pide dividendo y divisor con JOptionPane y muestra el resultado.
 *  * Captura NumberFormatException (texto no numerico) y ArithmeticException (divisor 0)
 *  * en bloques catch SEPARADOS, con un mensaje distinto para cada uno.
 *
 * Autor: Daniel Ochoa Taborda
 */
public class Ej1Division {

    public static void main(String[] args) {
        String dividendoTexto = JOptionPane.showInputDialog(null, "Ingrese el dividendo:");
        if (dividendoTexto == null) {
            return;
        }

        String divisorTexto = JOptionPane.showInputDialog(null, "Ingrese el divisor:");
        if (divisorTexto == null) {
            return;
        }

        try {
            int dividendo = Integer.parseInt(dividendoTexto);
            int divisor = Integer.parseInt(divisorTexto);
            int resultado = dividendo / divisor;
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Debe ingresar numeros enteros validos.",
                    "Entrada invalida",
                    JOptionPane.WARNING_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                    "No se puede dividir entre cero.",
                    "Error aritmetico",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
