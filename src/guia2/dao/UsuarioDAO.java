package guia2.dao;

import java.util.List;

import ConexionDb.ConexionDB;
import guia2.modelo.Usuario;

/**
 * Guia 2 - Modulo C (CRUD) / Modulo B (login).
 * Acceso a datos de la tabla usuarios con PreparedStatement.
 *
 * TODO (Daniel): implementar todos los metodos con PreparedStatement y
 * try-with-resources (Connection, PreparedStatement, ResultSet).
 */
public class UsuarioDAO {

    /**
     * SELECT * FROM usuarios WHERE username = ? AND password = ?
     * @return true si existe un usuario con esas credenciales.
     */
    public boolean validar(String username, String password) {
        // TODO (Daniel)
        return false;
    }

    /**
     * SELECT 1 FROM usuarios WHERE username = ?
     * @return true si el nombre de usuario ya esta registrado.
     */
    public boolean existe(String username) {
        // TODO (Daniel)
        return false;
    }

    /**
     * INSERT INTO usuarios (username, password) VALUES (?, ?)
     */
    public void insertar(Usuario usuario) {
        // TODO (Daniel)
    }

    /**
     * Inserta el usuario solo si no existe todavia (para los datos iniciales).
     */
    public void insertarSiNoExiste(String username, String password) {
        // TODO (Daniel)
    }

    /**
     * READ auxiliar: devuelve todos los usuarios (sin mostrar la contrasena).
     */
    public List<Usuario> listar() {
        // TODO (Daniel)
        return null;
    }
}
