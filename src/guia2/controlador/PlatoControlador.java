package guia2.controlador;

import guia2.dao.PlatoDAO;
import guia2.modelo.Plato;
import guia2.vista.PlatoVista;

/**
 * Guia 2 - Modulo C (CRUD).
 * Une la vista (JOptionPane) con el DAO (SQLite). Aqui va la logica:
 * validaciones, mensajes de exito y manejo de errores.
 *
 * TODO (Juan Pablo): implementar los cuatro metodos.
 */
public class PlatoControlador {

    private final PlatoDAO dao = new PlatoDAO();
    private final PlatoVista vista = new PlatoVista();

    /** CREATE: pide los datos, valida y llama a dao.insertar(). */
    public void agregar() {
        // TODO (Juan Pablo)
    }

    /** READ: pide dao.listar() y lo muestra con vista.mostrar(). */
    public void verTodos() {
        // TODO (Juan Pablo)
    }

    /** UPDATE: pide el id, busca el plato, pide nuevos datos y actualiza. */
    public void actualizar() {
        // TODO (Juan Pablo)
    }

    /** DELETE: pide el id, confirma y elimina. */
    public void eliminar() {
        // TODO (Juan Pablo)
    }
}
