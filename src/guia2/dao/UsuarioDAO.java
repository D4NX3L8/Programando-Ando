package guia2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConexionDb.ConexionDB;
import guia2.modelo.Usuario;

/**
 * Guia 2 - Modulo C (CRUD) / Modulo B (login).
 * Acceso a datos de la tabla usuarios con PreparedStatement.
 */
public class UsuarioDAO {

    /**
     * SELECT * FROM usuarios WHERE username = ? AND password = ?
     * @return true si existe un usuario con esas credenciales.
     */
    public boolean validar(String username, String password) {
        String sql = "SELECT 1 FROM usuarios WHERE username = ? AND password = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("Error al validar el usuario: " + e.getMessage());
            return false;
        }
    }

    /**
     * SELECT 1 FROM usuarios WHERE username = ?
     * @return true si el nombre de usuario ya esta registrado.
     */
    public boolean existe(String username) {
        String sql = "SELECT 1 FROM usuarios WHERE username = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("Error al comprobar el usuario: " + e.getMessage());
            return false;
        }
    }

    /**
     * INSERT INTO usuarios (username, password) VALUES (?, ?)
     */
    public void insertar(Usuario usuario) {
        String sql = "INSERT INTO usuarios (username, password) VALUES (?, ?)";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar el usuario: " + e.getMessage());
        }
    }

    /**
     * Inserta el usuario solo si no existe todavia (para los datos iniciales).
     */
    public void insertarSiNoExiste(String username, String password) {
        if (!existe(username)) {
            insertar(new Usuario(username, password));
        }
    }

    /**
     * READ auxiliar: devuelve todos los usuarios (sin mostrar la contrasena).
     */
    public List<Usuario> listar() {
        String sql = "SELECT id, username FROM usuarios ORDER BY id";
        List<Usuario> usuarios = new ArrayList<>();

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                 Usuario usuario = new Usuario();
                 usuario.setId(rs.getInt("id"));
                 usuario.setUsername(rs.getString("username"));
                 usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar los usuarios: " + e.getMessage());
        }

        return usuarios;
    }
}
