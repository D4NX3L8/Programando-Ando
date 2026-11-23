package guia2.modelo;

/**
 * Guia 2 - Modulo A (POO).
 * Entidad obligatoria del sistema de autenticacion.
 */
public class Usuario {

    private int id;
    private String username;
    private String password;

    public Usuario() {
    }

    public Usuario(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public Usuario(int id, String username, String password) {
        this.id = id;
        setUsername(username);
        setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacio.");
        }
        this.username = username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("La contrasena no puede estar vacia.");
        }
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{id=" + id + ", username='" + username + "'}";
    }
}
