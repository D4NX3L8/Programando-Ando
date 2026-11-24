package guia1.arreglos;

import guia1.Guia1Dialogos;

public class Ej26 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int[] nums = {5, 8, 12, 3, 7, 15, 9, 2, 10, 4};
        int buscado = 7;
        int contador = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == buscado) {
                contador++;
            }
        }
        String frecuencia = contador == 1 ? " vez" : " veces";
        Guia1Dialogos.mostrarResultado(
                "Ej26 - Contar ocurrencias",
                buscado + " aparece " + contador + frecuencia + ".");
    }
}