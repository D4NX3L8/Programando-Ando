package guia2.controlador;

import guia2.dao.UsuarioDAO;
import guia2.vista.LoginVista;

/**
 * Guia 2 - Modulo B (autenticacion) y Modulo D (cerrar sesion).
 *
 * Reglas de la guia (3.4):
 *   - Pide usuario y contrasena con JOptionPane.
 *   - Valida con PreparedStatement (UsuarioDAO.validar).
 *   - Si falla, avisa y vuelve a pedir: MAXIMO 3 intentos y luego cierra.
 *   - Si acierta, guarda el usuario en memoria y deja entrar al menu.
 *
 * TODO (Jeronimo): implementar iniciarSesion() y cerrarSesion().
 */
public class LoginControlador {

    private static final int MAX_INTENTOS = 3;

    private final UsuarioDAO usuarioDAO = new UsuarioDAO();
    private final LoginVista vista = new LoginVista();

    private String usuarioActual;

    /**
     * @return true si el login fue exitoso; false si se agotaron los intentos
     *         o el usuario cancelo.
     */
    public boolean iniciarSesion() {
        // TODO (Jeronimo): ciclo de 3 intentos + validacion + mensajes.
        return false;
    }

    /**
     * Limpia la sesion en memoria para que otro usuario pueda entrar sin
     * cerrar el programa (Modulo D).
     */
    public void cerrarSesion() {
        // TODO (Jeronimo)
        usuarioActual = null;
    }

    public String getUsuarioActual() {
        return usuarioActual;
    }
}
