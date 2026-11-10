package guia2.vista;

import javax.swing.JOptionPane;

/**
 * Guia 2 - Modulo B (login con JOptionPane).
 * Toda la interaccion con el usuario del login pasa por aqui: la vista NO
 * conoce la base de datos ni la logica, solo muestra y recoge datos.
 *
 * TODO (Jeronimo): implementar los metodos.
 */
public class LoginVista {

    /**
     * JOptionPane.showInputDialog("Usuario:")
     * @return el texto ingresado o null si el usuario cancela.
     */
    public String pedirUsuario() {
        // TODO (Jeronimo)
        return null;
    }

    /**
     * Pide la contrasena. Nota: JOptionPane no permite ocultar el texto;
     * si se quiere, se puede usar JPasswordField dentro de un panel.
     * @return el texto ingresado o null si el usuario cancela.
     */
    public String pedirPassword() {
        // TODO (Jeronimo)
        return null;
    }

    public void mostrarBienvenida(String usuario) {
        // TODO (Jeronimo): JOptionPane.showMessageDialog(...)
    }

    public void mostrarError(String mensaje) {
        // TODO (Jeronimo): JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE)
    }

    /**
     * Mensaje final cuando se agotan los 3 intentos de login.
     */
    public void mostrarBloqueado() {
        // TODO (Jeronimo)
    }
}
