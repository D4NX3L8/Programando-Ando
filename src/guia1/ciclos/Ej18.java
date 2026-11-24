package guia1.ciclos;

import guia1.Guia1Dialogos;

public class Ej18 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        StringBuilder resultado = new StringBuilder();
        for (int tabla = 1; tabla <= 10; tabla++) {
            resultado.append("--- Tabla del ").append(tabla).append(" ---\n");
            for (int i = 1; i <= 10; i++) {
                resultado.append(tabla).append(" x ").append(i).append(" = ")
                        .append(tabla * i).append('\n');
            }
        }
        Guia1Dialogos.mostrarResultado("Ej18 - Tablas del 1 al 10", resultado.toString());
    }
}
