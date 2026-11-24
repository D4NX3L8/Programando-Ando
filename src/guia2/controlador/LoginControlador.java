package guia2.controlador;

import guia2.dao.UsuarioDAO;
import guia2.vista.LoginVista;

/**
 * Controlador de autenticacion y sesion.
 * Autor: Jeronimo Henao
 */
public class LoginControlador {

    private static final int MAX_INTENTOS = 3;

    private final UsuarioDAO usuarioDAO;
    private final LoginVista vista;

    private String usuarioActual;

    public LoginControlador() {
        this.usuarioDAO = new UsuarioDAO();
        this.vista = new LoginVista();
    }

    public LoginControlador(UsuarioDAO usuarioDAO, LoginVista vista) {
        this.usuarioDAO = usuarioDAO;
        this.vista = vista;
    }

    public boolean iniciarSesion() {

        usuarioActual = null;

        for (int intento = 1; intento <= MAX_INTENTOS; intento++) {

            String user = vista.pedirUsuario();

            if (user == null) {
                return false;
            }

            String pass = vista.pedirPassword();

            if (pass == null) {
                return false;
            }

            if (user.isBlank() || pass.isBlank()) {
                vista.mostrarError(
                        "Los campos son obligatorios. Intento "
                        + intento + " de 3.");
                continue;
            }

            if (usuarioDAO.validar(user, pass)) {
                usuarioActual = user;

                vista.mostrarBienvenida(user);

                return true;
            }

            vista.mostrarError(
                    "Credenciales incorrectas. Intento "
                    + intento + " de 3.");
        }

        vista.mostrarBloqueado();

        return false;
    }

    public String getUsuarioActual() {
        return usuarioActual;
    }

    public void cerrarSesion() {
        usuarioActual = null;
    }
}