package guia2.vista;

import javax.swing.JOptionPane;

/**
 * Vista de inicio de sesion.
 * Autor: Jeronimo Henao
 */
public class LoginVista {

    public String pedirUsuario() {
        return JOptionPane.showInputDialog("Usuario:");
    }

    public String pedirPassword() {
        return JOptionPane.showInputDialog("Contrasena:");
    }

    public void mostrarBienvenida(String usuario) {
        JOptionPane.showMessageDialog(null,
                "Bienvenido, " + usuario);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null,
                mensaje,
                "Advertencia",
                JOptionPane.WARNING_MESSAGE);
    }

    public void mostrarBloqueado() {
        JOptionPane.showMessageDialog(null,
                "Demasiados intentos fallidos. Cerrando el sistema.",
                "Acceso bloqueado",
                JOptionPane.ERROR_MESSAGE);
    }
}