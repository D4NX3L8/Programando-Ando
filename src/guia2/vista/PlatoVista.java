package guia2.vista;

import java.util.List;

import javax.swing.JOptionPane;

import guia2.modelo.Plato;

/**
 * Guia 2 - Modulo C (formularios del CRUD).
 * Recoge y muestra los datos del plato. No accede a la base de datos.
 *
 * TODO (Juan Pablo): implementar todos los metodos.
 */
public class PlatoVista {

    /**
     * Pide nombre, categoria, precio y disponibilidad de un plato nuevo.
     * @return el Plato armado o null si el usuario cancela.
     */
    public Plato pedirNuevo() {
        // TODO (Juan Pablo)
        return null;
    }

    /**
     * Pide el ID del plato sobre el que se va a operar.
     * @param accion texto para el mensaje, por ejemplo "actualizar" o "eliminar".
     * @return el id ingresado, o -1 si cancela o escribe algo invalido.
     */
    public int pedirId(String accion) {
        // TODO (Juan Pablo)
        return -1;
    }

    /**
     * Pide los nuevos valores del plato conservando el id recibido.
     * @return el Plato con los datos nuevos o null si cancela.
     */
    public Plato pedirDatosActualizados(int id) {
        // TODO (Juan Pablo)
        return null;
    }

    /**
     * Muestra la lista formateada con JOptionPane (o un mensaje si esta vacia).
     */
    public void mostrar(List<Plato> platos) {
        // TODO (Juan Pablo)
    }

    /**
     * Confirmacion Si/No antes de eliminar.
     */
    public boolean confirmar(String mensaje) {
        // TODO (Juan Pablo): JOptionPane.showConfirmDialog(...) == YES_OPTION
        return false;
    }

    public void mensaje(String mensaje) {
        // TODO (Juan Pablo): JOptionPane.showMessageDialog(...)
    }
}
