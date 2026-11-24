package guia1.ciclos;

import guia1.Guia1Dialogos;

public class Ej12 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 50; i >= 1; i--) {
            resultado.append(i).append('\n');
        }
        Guia1Dialogos.mostrarResultado("Ej12 - Numeros del 50 al 1", resultado.toString());
    }
}
