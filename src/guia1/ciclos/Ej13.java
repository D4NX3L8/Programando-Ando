package guia1.ciclos;

import guia1.Guia1Dialogos;

public class Ej13 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                resultado.append(i).append('\n');
            }
        }
        Guia1Dialogos.mostrarResultado("Ej13 - Pares del 1 al 100", resultado.toString());
    }
}
