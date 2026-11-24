package guia2;

import ConexionDb.InicializarDB;
import guia2.controlador.LoginControlador;
import guia2.controlador.PlatoControlador;
import guia2.vista.MenuVista;

/**
 * Guia 2 - Punto de entrada del sistema Sabor Local.
 * Autor: Jeronimo Henao
 */
public class Guia2App {

    public static void main(String[] args) {

        InicializarDB.crearTablas();
        InicializarDB.insertarDatosIniciales();

        LoginControlador login = new LoginControlador();
        MenuVista menuVista = new MenuVista();
        PlatoControlador platoControlador = new PlatoControlador();

        while (true) {

            if (!login.iniciarSesion()) {
                return;
            }

            int opcion;

            while ((opcion = menuVista.mostrarMenu(login.getUsuarioActual())) != 5) {

                switch (opcion) {
                    case 1:
                        platoControlador.agregar();
                        break;

                    case 2:
                        platoControlador.verTodos();
                        break;

                    case 3:
                        platoControlador.actualizar();
                        break;

                    case 4:
                        platoControlador.eliminar();
                        break;

                    case 0:
                        login.cerrarSesion();
                        menuVista.despedida();
                        return;

                    default:
                        break;
                }
            }

            // Cerrar sesion y regresar al login.
            login.cerrarSesion();
        }
    }
}