package guia1.ciclos;

import guia1.Guia1Dialogos;

public class Ej20 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado.append(i).append('\n');
            }
        }
        Guia1Dialogos.mostrarResultado(
                "Ej20 - Divisibles entre 3 y 5", resultado.toString());
    }
}
