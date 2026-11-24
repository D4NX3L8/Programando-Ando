package guia1.ciclos;

import guia1.Guia1Dialogos;

public class Ej14 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int numero = 1;
        StringBuilder resultado = new StringBuilder();
        while (numero <= 100) {
            resultado.append(numero).append('\n');
            numero += 2;
        }
        Guia1Dialogos.mostrarResultado("Ej14 - Impares del 1 al 100", resultado.toString());
    }
}