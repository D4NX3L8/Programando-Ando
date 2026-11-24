package guia1.arreglos;

import guia1.Guia1Dialogos;

public class Ej23 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int[] nums = {5, 12, 7, 3, 20, 8, 15, 1, 9, 4};
        int suma = 0;
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }
        Guia1Dialogos.mostrarResultado("Ej23 - Suma de un arreglo", "La suma es: " + suma);
    }
}
