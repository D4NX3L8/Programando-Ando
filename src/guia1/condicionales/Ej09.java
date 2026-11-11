package guia1.condicionales;

import java.util.Scanner;

/**
 * Guia 1 - Ejercicio 09 (Basico)
 * Login con equals
 *
 * Enunciado:
 * Simula un login: usuario 'admin' y contrasena '1234'.
 *  * Si coinciden: 'Bienvenido'. Si no: 'Credenciales incorrectas'.
 *  * Compara los String con equals(), nunca con ==.
 *
 * Autor: Daniel Ochoa
 */
public class Ej09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = sc.next();

        System.out.print("Contrasena: ");
        String clave = sc.next();

        if (usuario.equals("admin") && clave.equals("1234")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }
}
