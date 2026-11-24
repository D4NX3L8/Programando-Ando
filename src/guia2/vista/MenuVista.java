package guia2.vista;

import javax.swing.JOptionPane;

/**
 * Guia 2 - Modulo D (menu principal y cerrar sesion).
 *
 * Contrato del menu (lo usa Guia2App):
 *   1 = Agregar plato
 *   2 = Ver todos los platos
 *   3 = Actualizar plato
 *   4 = Eliminar plato
 *   5 = Cerrar sesion
 *   0 = Salir del programa
 */
public class MenuVista {

    public int mostrarMenu(String usuario) {
        Object[] opciones = {
                "Agregar plato",
                "Ver todos",
                "Actualizar",
                "Eliminar",
                "Cerrar sesion",
                "Salir"
        };

        int posicion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opcion:",
                "Menu principal - " + usuario,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (posicion == 4) {
            return 5;
        }
        if (posicion == 5) {
            return 0;
        }
        if (posicion >= 0 && posicion <= 3) {
            return posicion + 1;
        }
        return 0;
    }

    public void despedida() {
        JOptionPane.showMessageDialog(null,
                "Gracias por usar Sabor Local.",
                "Sabor Local",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
