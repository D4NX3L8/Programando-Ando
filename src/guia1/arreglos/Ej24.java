package guia1.arreglos;

import guia1.Guia1Dialogos;

public class Ej24 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int[] nums = {
            5, 12, 8, 20, 3,
            15, 7, 9, 11, 4,
            18, 6, 14, 2, 10,
            13, 1, 16, 19, 17
        };

        int mayor = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > mayor) {
                mayor = nums[i];
            }
        }
        Guia1Dialogos.mostrarResultado("Ej24 - Mayor de un arreglo", "El mayor es: " + mayor);
    }
}
