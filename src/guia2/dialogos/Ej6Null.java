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
        // TODO: implementar con JOptionPane + try/catch.
        JOptionPane.showMessageDialog(null, "[Ej6Null] pendiente de implementar.");
    }
}
