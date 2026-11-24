package guia2.vista;

import java.util.List;

import javax.swing.JOptionPane;

import guia2.modelo.Plato;

/**
 * Guia 2 - Modulo C (formularios del CRUD).
 * Recoge y muestra los datos del plato. No accede a la base de datos.
 */
public class PlatoVista {

    /**
     * Pide nombre, categoria, precio y disponibilidad de un plato nuevo.
     * @return el Plato armado o null si el usuario cancela.
     */
    public Plato pedirNuevo() {
        String nombre = JOptionPane.showInputDialog(null, "Nombre del plato:");
        if (nombre == null) {
            return null;
        }

        String categoria = JOptionPane.showInputDialog(null, "Categoria:");
        if (categoria == null) {
            return null;
        }

        String textoPrecio = JOptionPane.showInputDialog(null, "Precio:");
        if (textoPrecio == null) {
            return null;
        }

        try {
            double precio = Double.parseDouble(textoPrecio);
            int opcion = JOptionPane.showConfirmDialog(
                    null,
                    "¿El plato esta disponible?",
                    "Disponibilidad",
                    JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.CLOSED_OPTION) {
                return null;
            }

            boolean disponible = opcion == JOptionPane.YES_OPTION;
            return new Plato(nombre, categoria, precio, disponible);
        } catch (NumberFormatException e) {
            mensaje("El precio debe ser un numero valido.");
            return null;
        } catch (IllegalArgumentException e) {
            mensaje(e.getMessage());
            return null;
        }
    }

    /**
     * Pide el ID del plato sobre el que se va a operar.
     * @param accion texto para el mensaje, por ejemplo "actualizar" o "eliminar".
     * @return el id ingresado, o -1 si cancela o escribe algo invalido.
     */
    public int pedirId(String accion) {
        String texto = JOptionPane.showInputDialog(null,
                "Ingresa el ID del plato a " + accion + ":");
        if (texto == null) {
            return -1;
        }

        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            mensaje("El ID debe ser un numero entero.");
            return -1;
        }
    }

    /**
     * Pide los nuevos valores del plato conservando el id recibido.
     * @return el Plato con los datos nuevos o null si cancela.
     */
    public Plato pedirDatosActualizados(int id) {
        String nombre = JOptionPane.showInputDialog(null, "Nuevo nombre:");
        if (nombre == null) {
            return null;
        }

        String categoria = JOptionPane.showInputDialog(null, "Nueva categoria:");
        if (categoria == null) {
            return null;
        }

        String textoPrecio = JOptionPane.showInputDialog(null, "Nuevo precio:");
        if (textoPrecio == null) {
            return null;
        }

        try {
            double precio = Double.parseDouble(textoPrecio);
            int opcion = JOptionPane.showConfirmDialog(
                    null,
                    "¿El plato esta disponible?",
                    "Disponibilidad",
                    JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.CLOSED_OPTION) {
                return null;
            }

            boolean disponible = opcion == JOptionPane.YES_OPTION;
            return new Plato(id, nombre, categoria, precio, disponible);
        } catch (NumberFormatException e) {
            mensaje("El precio debe ser un numero valido.");
            return null;
        } catch (IllegalArgumentException e) {
            mensaje(e.getMessage());
            return null;
        }
    }

    /**
     * Muestra la lista formateada con JOptionPane (o un mensaje si esta vacia).
     */
    public void mostrar(List<Plato> platos) {
        if (platos == null || platos.isEmpty()) {
            mensaje("No hay platos registrados.");
            return;
        }

        StringBuilder contenido = new StringBuilder();
        for (Plato plato : platos) {
            contenido.append(plato.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, contenido.toString(),
                "Platos registrados", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Confirmacion Si/No antes de eliminar.
     */
    public boolean confirmar(String mensaje) {
        return JOptionPane.showConfirmDialog(
                null,
                mensaje,
                "Confirmar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje,
                "Sabor Local", JOptionPane.INFORMATION_MESSAGE);
    }
}
