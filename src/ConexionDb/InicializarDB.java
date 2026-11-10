package ConexionDb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Guia 2 - Actividad GA2-AA1-EV02.
 * Crea las tablas del sistema si no existen.
 *
 * Esquema:
 *   usuarios(id, username, password)
 *   platos(id, nombre, categoria, precio, disponible)
 *
 * TODO (Daniel): implementar insertarDatosIniciales() en la Fase 3 de la guia.
 */
public class InicializarDB {

    private InicializarDB() {
        // Clase de utilidades: no se instancia.
    }

    public static void crearTablas() {
        String sqlUsuarios =
                "CREATE TABLE IF NOT EXISTS usuarios (" +
                " id       INTEGER PRIMARY KEY AUTOINCREMENT," +
                " username TEXT NOT NULL UNIQUE," +
                " password TEXT NOT NULL)";

        String sqlPlatos =
                "CREATE TABLE IF NOT EXISTS platos (" +
                " id         INTEGER PRIMARY KEY AUTOINCREMENT," +
                " nombre     TEXT NOT NULL," +
                " categoria  TEXT NOT NULL," +
                " precio     REAL NOT NULL," +
                " disponible INTEGER NOT NULL DEFAULT 1)";

        Connection conn = ConexionDB.getConexion();
        if (conn == null) {
            System.err.println("No se pudieron crear las tablas: sin conexion.");
            return;
        }

        try (conn; Statement stmt = conn.createStatement()) {
            stmt.execute(sqlUsuarios);
            stmt.execute(sqlPlatos);
        } catch (SQLException e) {
            System.err.println("Error de base de datos: " + e.getMessage());
        }
    }

    /**
     * Inserta los datos de prueba de la Fase 3:
     *   - Usuarios: admin / admin123 y empleado / emp456
     *   - Al menos 3 platos coherentes con la tematica del restaurante.
     *
     * Debe usar los DAO (UsuarioDAO y PlatoDAO) o PreparedStatement.
     */
    public static void insertarDatosIniciales() {
        // TODO (Daniel): insertar usuarios y platos de prueba sin duplicar
        // registros si se ejecuta varias veces.
    }
}
