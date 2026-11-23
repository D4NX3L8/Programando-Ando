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
 */
public class PlatoDAO {

    /**
     * INSERT INTO platos (nombre, categoria, precio, disponible) VALUES (?, ?, ?, ?)
     */
    public void insertar(Plato plato) {
        String sql = "INSERT INTO platos (nombre, categoria, precio, disponible) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, plato.getNombre());
            ps.setString(2, plato.getCategoria());
            ps.setDouble(3, plato.getPrecio());
            ps.setBoolean(4, plato.isDisponible());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar el plato: " + e.getMessage());
        }
    }

    /**
     * SELECT * FROM platos ORDER BY id
     */
    public List<Plato> listar() {
        String sql = "SELECT * FROM platos ORDER BY id";
        List<Plato> platos = new ArrayList<>();

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                platos.add(mapearPlato(rs));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar los platos: " + e.getMessage());
        }

        return platos;
    }

    /**
     * SELECT * FROM platos WHERE id = ?
     * @return el plato o null si no existe.
     */
    public Plato buscarPorId(int id) {
        String sql = "SELECT * FROM platos WHERE id = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? mapearPlato(rs) : null;
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar el plato: " + e.getMessage());
            return null;
        }
    }

    /**
     * UPDATE platos SET nombre = ?, categoria = ?, precio = ?, disponible = ? WHERE id = ?
     * @return true si se actualizo al menos una fila.
     */
    public boolean actualizar(Plato plato) {
        String sql = "UPDATE platos SET nombre = ?, categoria = ?, precio = ?, disponible = ? WHERE id = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, plato.getNombre());
            ps.setString(2, plato.getCategoria());
            ps.setDouble(3, plato.getPrecio());
            ps.setBoolean(4, plato.isDisponible());
            ps.setInt(5, plato.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al actualizar el plato: " + e.getMessage());
            return false;
        }
    }

    /**
     * DELETE FROM platos WHERE id = ?
     * @return true si se elimino al menos una fila.
     */
    public boolean eliminar(int id) {
        String sql = "DELETE FROM platos WHERE id = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al eliminar el plato: " + e.getMessage());
            return false;
        }
    }

    /**
     * SELECT 1 FROM platos WHERE nombre = ? (para no duplicar los datos iniciales)
     */
    public boolean existePorNombre(String nombre) {
        String sql = "SELECT 1 FROM platos WHERE nombre = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("Error al comprobar el plato: " + e.getMessage());
            return false;
        }
    }

    /**
     * Inserta el plato solo si no existe un plato con ese nombre.
     */
    public void insertarSiNoExiste(Plato plato) {
        if (!existePorNombre(plato.getNombre())) {
            insertar(plato);
        }
    }

    private Plato mapearPlato(ResultSet rs) throws SQLException {
        return new Plato(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("categoria"),
                rs.getDouble("precio"),
                rs.getInt("disponible") == 1);
    }
}
