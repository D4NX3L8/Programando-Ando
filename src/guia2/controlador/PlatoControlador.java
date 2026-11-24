package guia2.controlador;

import guia2.dao.PlatoDAO;
import guia2.modelo.Plato;
import guia2.vista.PlatoVista;

/**
 * Guia 2 - Modulo C (CRUD).
 * Une la vista (JOptionPane) con el DAO (SQLite). Aqui va la logica:
 * validaciones, mensajes de exito y manejo de errores.
 */
public class PlatoControlador {

    private final PlatoDAO dao = new PlatoDAO();
    private final PlatoVista vista = new PlatoVista();

    /** CREATE: pide los datos, valida y llama a dao.insertar(). */
    public void agregar() {
        Plato plato = vista.pedirNuevo();
        if (plato == null) {
            return;
        }
        if (plato.getNombre().trim().isEmpty()
                || plato.getCategoria().trim().isEmpty()
                || plato.getPrecio() <= 0) {
            vista.mensaje("El nombre, la categoria y el precio positivo son obligatorios.");
            return;
        }
        if (dao.existePorNombre(plato.getNombre())) {
            vista.mensaje("Ya existe un plato con ese nombre.");
            return;
        }

        dao.insertar(plato);
        vista.mensaje("Plato agregado correctamente.");
    }

    /** READ: pide dao.listar() y lo muestra con vista.mostrar(). */
    public void verTodos() {
        vista.mostrar(dao.listar());
    }

    /** UPDATE: pide el id, busca el plato, pide nuevos datos y actualiza. */
    public void actualizar() {
        int id = vista.pedirId("actualizar");
        if (id < 0) {
            return;
        }

        Plato actual = dao.buscarPorId(id);
        if (actual == null) {
            vista.mensaje("No existe un plato con ese ID.");
            return;
        }

        Plato nuevos = vista.pedirDatosActualizados(id);
        if (nuevos == null) {
            return;
        }
        if (nuevos.getNombre().trim().isEmpty()
                || nuevos.getCategoria().trim().isEmpty()
                || nuevos.getPrecio() <= 0) {
            vista.mensaje("El nombre, la categoria y el precio positivo son obligatorios.");
            return;
        }

        if (dao.actualizar(nuevos)) {
            vista.mensaje("Plato actualizado correctamente.");
        } else {
            vista.mensaje("No fue posible actualizar el plato.");
        }
    }

    /** DELETE: pide el id, confirma y elimina. */
    public void eliminar() {
        int id = vista.pedirId("eliminar");
        if (id < 0) {
            return;
        }

        Plato plato = dao.buscarPorId(id);
        if (plato == null) {
            vista.mensaje("No existe un plato con ese ID.");
            return;
        }

        if (!vista.confirmar("¿Eliminar " + plato.getNombre() + "?")) {
            return;
        }

        if (dao.eliminar(id)) {
            vista.mensaje("Plato eliminado correctamente.");
        } else {
            vista.mensaje("No fue posible eliminar el plato.");
        }
    }
}
