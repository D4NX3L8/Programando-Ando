package guia1.arreglos;

import guia1.Guia1Dialogos;

public class Ej28 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        StringBuilder resultado = new StringBuilder();
        for (int n = 1; n <= 20; n++) {
            int cubo = n * n * n;
            resultado.append(n).append(" -> ").append(cubo).append('\n');
        }
        Guia1Dialogos.mostrarResultado("Ej28 - Numeros y sus cubos", resultado.toString());
    }
}
