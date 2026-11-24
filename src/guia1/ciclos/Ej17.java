package guia1.ciclos;

import guia1.Guia1Dialogos;

public class Ej17 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            resultado.append("7 x ").append(i).append(" = ").append(7 * i).append('\n');
        }
        Guia1Dialogos.mostrarResultado("Ej17 - Tabla del 7", resultado.toString());
    }
}
