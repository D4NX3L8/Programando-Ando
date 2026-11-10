package ConexionDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Guia 2 - Actividad GA2-AA1-EV02.
 * Centraliza la conexion JDBC con la base de datos SQLite del proyecto.
 *
 * El archivo mibasededatos.db se crea automaticamente en la raiz del proyecto
 * la primera vez que se abre la conexion.
 */
public class ConexionDB {

    private static final String URL = "jdbc:sqlite:mibasededatos.db";

    private ConexionDB() {
        // Clase de utilidades: no se instancia.
    }

    public static Connection getConexion() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.err.println("Error al conectar con SQLite: " + e.getMessage());
        }
        return conexion;
    }
}
