package guia1;

import java.util.Scanner;

import guia1.arreglos.Ej22;
import guia1.arreglos.Ej23;
import guia1.arreglos.Ej24;
import guia1.arreglos.Ej25;
import guia1.arreglos.Ej26;
import guia1.arreglos.Ej27;
import guia1.arreglos.Ej28;
import guia1.arreglos.Ej29;
import guia1.ciclos.Ej11;
import guia1.ciclos.Ej12;
import guia1.ciclos.Ej13;
import guia1.ciclos.Ej14;
import guia1.ciclos.Ej15;
import guia1.ciclos.Ej16;
import guia1.ciclos.Ej17;
import guia1.ciclos.Ej18;
import guia1.ciclos.Ej19;
import guia1.ciclos.Ej20;
import guia1.ciclos.Ej21;
import guia1.condicionales.Ej01;
import guia1.condicionales.Ej02;
import guia1.condicionales.Ej03;
import guia1.condicionales.Ej04;
import guia1.condicionales.Ej05;
import guia1.condicionales.Ej06;
import guia1.condicionales.Ej07;
import guia1.condicionales.Ej08;
import guia1.condicionales.Ej09;
import guia1.condicionales.Ej10;

/**
 * Guia 1 - Menu para ejecutar cualquiera de los 29 ejercicios.
 *
 * Uso: java guia1.Guia1Main
 *
 * IMPORTANTE: los ejercicios NO deben cerrar su Scanner de System.in,
 * porque si lo cierran este menu ya no puede leer la siguiente opcion.
 */
public class Guia1Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("=== GUIA 1: LOGICA EN JAVA ===");
            System.out.println("Condicionales 1-10 | Ciclos 11-21 | Arreglos 22-29");
            System.out.print("Numero de ejercicio (0 para salir): ");

            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Ingresa un numero valido.");
                opcion = -1;
                continue;
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Ej01.main(null);
                    break;
                case 2:
                    Ej02.main(null);
                    break;
                case 3:
                    Ej03.main(null);
                    break;
                case 4:
                    Ej04.main(null);
                    break;
                case 5:
                    Ej05.main(null);
                    break;
                case 6:
                    Ej06.main(null);
                    break;
                case 7:
                    Ej07.main(null);
                    break;
                case 8:
                    Ej08.main(null);
                    break;
                case 9:
                    Ej09.main(null);
                    break;
                case 10:
                    Ej10.main(null);
                    break;
                case 11:
                    Ej11.main(null);
                    break;
                case 12:
                    Ej12.main(null);
                    break;
                case 13:
                    Ej13.main(null);
                    break;
                case 14:
                    Ej14.main(null);
                    break;
                case 15:
                    Ej15.main(null);
                    break;
                case 16:
                    Ej16.main(null);
                    break;
                case 17:
                    Ej17.main(null);
                    break;
                case 18:
                    Ej18.main(null);
                    break;
                case 19:
                    Ej19.main(null);
                    break;
                case 20:
                    Ej20.main(null);
                    break;
                case 21:
                    Ej21.main(null);
                    break;
                case 22:
                    Ej22.main(null);
                    break;
                case 23:
                    Ej23.main(null);
                    break;
                case 24:
                    Ej24.main(null);
                    break;
                case 25:
                    Ej25.main(null);
                    break;
                case 26:
                    Ej26.main(null);
                    break;
                case 27:
                    Ej27.main(null);
                    break;
                case 28:
                    Ej28.main(null);
                    break;
                case 29:
                    Ej29.main(null);
                    break;
                case 0:
                    System.out.println("Saliendo de la Guia 1.");
                    break;
                default:
                    System.out.println("Ese ejercicio no existe (1-29).");
                    break;
            }
        } while (opcion != 0);
    }
}
