package guia2;

import ConexionDb.InicializarDB;
import guia2.controlador.LoginControlador;
import guia2.controlador.PlatoControlador;
import guia2.vista.MenuVista;

/**
 * Guia 2 - Punto de entrada del sistema.
 *
 * Flujo (segun la guia 3.4):
 *   1. Crear tablas e insertar datos iniciales.
 *   2. Login (maximo 3 intentos).
 *   3. Menu principal: CRUD + cerrar sesion.
 *   4. Al cerrar sesion se vuelve al login SIN terminar el programa.
 *
 * TODO (Jeronimo): completar el manejo de la sesion y del menu si hace falta.
 */
public class Guia2App {

    public static void main(String[] args) {

        InicializarDB.crearTablas();
        InicializarDB.insertarDatosIniciales();

        LoginControlador login = new LoginControlador();
        MenuVista menuVista = new MenuVista();
        PlatoControlador platoControlador = new PlatoControlador();

        boolean salir = false;

        while (!salir) {

            if (!login.iniciarSesion()) {
                // Se agotaron los intentos o se cancelo: termina el programa.
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
                        salir = true;
                        menuVista.despedida();
                        return;
                    default:
                        break;
                }
            }

            // Opcion 5: cerrar sesion y volver al login.
            login.cerrarSesion();
        }
    }
}
