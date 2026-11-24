package guia1.arreglos;

import guia1.Guia1Dialogos;

public class Ej22 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int[] nums = {5, 8, 12, 3, 7, 15, 9, 2, 10, 4};
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            resultado.append("nums[").append(i).append("] = ").append(nums[i]).append('\n');
        }
        Guia1Dialogos.mostrarResultado("Ej22 - Recorrer un arreglo", resultado.toString());
    }
}
