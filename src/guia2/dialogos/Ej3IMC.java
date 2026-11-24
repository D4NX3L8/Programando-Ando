package guia2.dialogos;

import javax.swing.JOptionPane;

/**
 * Guia 2 - Calculadora de IMC con throw (Basico)
 *
 * Ejercicio de la seccion 3.2 (Try-Catch).
 *
 * Autor: Jeronimo Henao
 */
public class Ej3IMC {

    public static void main(String[] args) {

        try {
            String entradaPeso = JOptionPane.showInputDialog("Ingrese su peso en kg:");

            if (entradaPeso == null) {
                return;
            }

            double peso = Double.parseDouble(entradaPeso);

            String entradaAltura = JOptionPane.showInputDialog("Ingrese su estatura en metros:");

            if (entradaAltura == null) {
                return;
            }

            double altura = Double.parseDouble(entradaAltura);

            if (altura == 0) {
                throw new ArithmeticException("La estatura no puede ser 0");
            }

            double imc = peso / (altura * altura);

            JOptionPane.showMessageDialog(null,
                    "Su IMC es: " + String.format("%.2f", imc));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Dato invalido. Usa punto decimal. Ej: 1.70");

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: " + e.getMessage());
        }
    }
}
