package guia1.condicionales;

import java.util.Scanner;

/**
 * Ej05 - Anio bisiesto.
 * Regla: divisible entre 4 y no entre 100, o divisible entre 400.
 */
public class Ej05 {

    public static void ejecutar(Scanner sc) {
        System.out.println("=== Ej05: Anio bisiesto ===");
        System.out.print("Ingrese un anio: ");
        int a = sc.nextInt();

        boolean bisiesto = (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);

        if (bisiesto) {
            System.out.println(a + " es bisiesto");
        } else {
            System.out.println(a + " no es bisiesto");
        }
    }
}
