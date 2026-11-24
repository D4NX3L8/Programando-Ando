package guia1;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public final class Guia1Dialogos {

    private Guia1Dialogos() {
    }

    public static String pedirTexto(String mensaje) {
        return JOptionPane.showInputDialog(
                null, mensaje, "Guia 1", JOptionPane.QUESTION_MESSAGE);
    }

    public static Integer pedirEntero(String mensaje) {
        while (true) {
            String texto = pedirTexto(mensaje);
            if (texto == null) {
                return null;
            }

            try {
                return Integer.valueOf(texto.trim());
            } catch (NumberFormatException e) {
                mostrarError("Ingresa un numero entero valido.");
            }
        }
    }

    public static Double pedirDecimal(String mensaje) {
        while (true) {
            String texto = pedirTexto(mensaje);
            if (texto == null) {
                return null;
            }

            try {
                double valor = Double.parseDouble(texto.trim().replace(',', '.'));
                if (Double.isFinite(valor)) {
                    return valor;
                }
            } catch (NumberFormatException e) {
                // Se muestra el mismo mensaje para valores mal formados y no finitos.
            }
            mostrarError("Ingresa un numero valido. Puedes usar punto o coma decimal.");
        }
    }

    public static void mostrarResultado(String titulo, String contenido) {
        JTextArea area = new JTextArea(contenido, 16, 48);
        area.setEditable(false);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        JOptionPane.showMessageDialog(
                null,
                new JScrollPane(area),
                titulo,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(
                null, mensaje, "Entrada invalida", JOptionPane.WARNING_MESSAGE);
    }
}
