package guia1.arreglos;

import guia1.Guia1Dialogos;

public class Ej25 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int[] nums = {5, 12, 7, 3, 20, 8, 15, 1, 9, 4};
        int menor = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < menor) {
                menor = nums[i];
            }
        }
        Guia1Dialogos.mostrarResultado("Ej25 - Menor de un arreglo", "El menor es: " + menor);
    }
}
