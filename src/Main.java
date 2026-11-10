import javax.swing.JOptionPane;

import guia1.Guia1Main;
import guia2.Guia2App;

/**
 * Punto de entrada general del proyecto.
 *
 *   1) Guia 1 -> ejercicios de logica en consola (Scanner).
 *   2) Guia 2 -> sistema de restaurante con JOptionPane + SQLite.
 *
 * Compilar:  bash scripts/compilar.sh
 * Ejecutar:  bash scripts/ejecutar.sh
 */
public class Main {

    public static void main(String[] args) {
        String[] opciones = {
                "Guia 1 - Logica (consola)",
                "Guia 2 - Persistencia (JOptionPane)",
                "Salir"
        };

        int opcion = JOptionPane.showOptionDialog(
                null,
                "Selecciona el modulo a ejecutar:",
                "Programando Ando",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        switch (opcion) {
            case 0:
                Guia1Main.main(args);
                break;
            case 1:
                Guia2App.main(args);
                break;
            default:
                break;
        }
    }
}
