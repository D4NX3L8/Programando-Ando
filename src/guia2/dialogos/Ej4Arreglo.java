package guia2.dialogos;

import javax.swing.JOptionPane;

/**
 * Guia 2 - Manejo de excepciones en arreglos
 * Autor: Jeronimo Henao
 */
public class Ej4Arreglo {

    public static void main(String[] args) {

        String[] nombres = {"Ana", "Luis", "Maria", "Pedro", "Sofia"};

        try {
            String entrada = JOptionPane.showInputDialog(
                    "Ingrese una posicion del 0 al 4:");

            if (entrada == null) {
                return;
            }

            int i = Integer.parseInt(entrada);

            JOptionPane.showMessageDialog(null,
                    "Nombre: " + nombres[i]);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Ingresa un numero entero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,
                    "Posicion invalida. Solo existen posiciones 0 a 4.");
        }
    }
}