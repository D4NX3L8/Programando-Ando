package guia1.condicionales;

import guia1.Guia1Dialogos;

public class Ej09 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        String usuario = Guia1Dialogos.pedirTexto("Usuario:");
        if (usuario == null) {
            return;
        }
        String clave = Guia1Dialogos.pedirTexto("Contrasena:");
        if (clave == null) {
            return;
        }

        if (usuario.equals("admin") && clave.equals("1234")) {
            Guia1Dialogos.mostrarResultado("Ej09 - Login", "Bienvenido");
        } else {
            Guia1Dialogos.mostrarResultado("Ej09 - Login", "Credenciales incorrectas");
        }
    }
}
