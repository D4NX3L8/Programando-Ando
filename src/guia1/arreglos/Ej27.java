package guia1.arreglos;

import guia1.Guia1Dialogos;

public class Ej27 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        StringBuilder resultado = new StringBuilder();
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                resultado.append("* ");
            }
            resultado.append('\n');
        }
        Guia1Dialogos.mostrarResultado("Ej27 - Cuadrado de asteriscos 6x6", resultado.toString());
    }
}
