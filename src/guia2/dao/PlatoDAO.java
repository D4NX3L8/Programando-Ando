package guia2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConexionDb.ConexionDB;
import guia2.modelo.Plato;

/**
 * Guia 2 - Modulo C (CRUD de la entidad de negocio).
 * Acceso a datos de la tabla platos con PreparedStatement.
 *
 * Regla del proyecto: SIEMPRE PreparedStatement, nunca concatenar SQL
 * (evita inyeccion SQL y es un criterio de la rubrica).
 *
 * TODO (Daniel): implementar todos los metodos.
 */
public class PlatoDAO {

    /**
     * INSERT INTO platos (nombre, categoria, precio, disponible) VALUES (?, ?, ?, ?)
     */
    public void insertar(Plato plato) {
        // TODO (Daniel)
    }

    /**
     * SELECT * FROM platos ORDER BY id
     */
    public List<Plato> listar() {
        // TODO (Daniel)
        return new ArrayList<>();
    }

    /**
     * SELECT * FROM platos WHERE id = ?
     * @return el plato o null si no existe.
     */
    public Plato buscarPorId(int id) {
        // TODO (Daniel)
        return null;
    }

    /**
     * UPDATE platos SET nombre = ?, categoria = ?, precio = ?, disponible = ? WHERE id = ?
     * @return true si se actualizo al menos una fila.
     */
    public boolean actualizar(Plato plato) {
        // TODO (Daniel)
        return false;
    }

    /**
     * DELETE FROM platos WHERE id = ?
     * @return true si se elimino al menos una fila.
     */
    public boolean eliminar(int id) {
        // TODO (Daniel)
        return false;
    }

    /**
     * SELECT 1 FROM platos WHERE nombre = ? (para no duplicar los datos iniciales)
     */
    public boolean existePorNombre(String nombre) {
        // TODO (Daniel)
        return false;
    }

    /**
     * Inserta el plato solo si no existe un plato con ese nombre.
     */
    public void insertarSiNoExiste(Plato plato) {
        // TODO (Daniel)
    }
}
