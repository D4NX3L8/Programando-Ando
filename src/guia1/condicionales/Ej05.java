package guia1.condicionales;

import java.util.Scanner;

/**
 * Ej05 - Anio bisiesto.
 * Regla: divisible entre 4 y no entre 100, o divisible entre 400.
 */
public class Ej05 {

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej05: Anio bisiesto ===");
        System.out.print("Ingrese un anio: ");
        int anio = sc.nextInt();

        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;

        if (bisiesto) {
            System.out.println(anio + " es bisiesto");
        } else {
            System.out.println(anio + " no es bisiesto");
        }
    }
}
