package guia1.ciclos;

import guia1.Guia1Dialogos;

public class Ej19 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int contador = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 10 == 0) {
                contador++;
            }
        }
        Guia1Dialogos.mostrarResultado("Ej19 - Multiplos de 10", "Cantidad: " + contador);
    }
}
