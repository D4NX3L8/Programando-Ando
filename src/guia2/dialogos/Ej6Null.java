package guia2.dialogos;

import javax.swing.JOptionPane;

/**
 * Guia 2 - Cancelacion del dialogo (NullPointerException) (Intermedio)
 *
 * Ejercicio de la seccion 3.2 (Try-Catch).
 *
 * Enunciado:
 * Pide el nombre con JOptionPane.showInputDialog y saluda en mayusculas.
 *  * Si el usuario pulsa Cancelar, showInputDialog devuelve null y nombre.toUpperCase()
 *  * lanza NullPointerException: capturala y muestra un mensaje claro.
 *  * Bonus: agrega tambien la validacion segura nombre == null || nombre.isBlank().
 *
 * Autor: Juan Pablo Arismendy
 */
public class Ej6Null {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null,
                "Ingresa tu nombre:",
                "Saludo",
                JOptionPane.QUESTION_MESSAGE);

        if (nombre == null || nombre.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    "Cancelaste la operacion. El nombre es requerido.",
                    "Nombre requerido",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            JOptionPane.showMessageDialog(null,
                    "Hola, " + nombre.toUpperCase() + "!",
                    "Saludo",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,
                    "Cancelaste la operacion. El nombre es requerido.",
                    "Nombre requerido",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
