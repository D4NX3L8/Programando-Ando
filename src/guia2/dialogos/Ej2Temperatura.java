package guia2.dialogos;

import javax.swing.JOptionPane;

/**
 * Guia 2 - Conversion de temperatura (Basico)
 *
 * Ejercicio de la seccion 3.2 (Try-Catch).
 *
 * Enunciado:
 * Pide una temperatura en Celsius y la convierte a Fahrenheit: F = (C * 9.0 / 5) + 32.
 *  * Usa Double.parseDouble y un solo catch de NumberFormatException.
 *  * Si el usuario escribe letras o deja vacio, muestra advertencia.
 *
 * Autor: Daniel Ochoa Taborda
 */
public class Ej2Temperatura {

    public static void main(String[] args) {
        String temperaturaTexto = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Celsius:");
        if (temperaturaTexto == null) {
            return;
        }

        try {
            double celsius = Double.parseDouble(temperaturaTexto);
            double fahrenheit = (celsius * 9.0 / 5) + 32;
            JOptionPane.showMessageDialog(null,
                    String.format("Fahrenheit: %,.2f", fahrenheit));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Debe ingresar una temperatura numerica valida.",
                    "Entrada invalida",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
