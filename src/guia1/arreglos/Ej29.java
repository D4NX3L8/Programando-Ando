package guia1.arreglos;

import guia1.Guia1Dialogos;

public class Ej29 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        String texto = Guia1Dialogos.pedirTexto("Ingresa una palabra:");
        if (texto == null) {
            return;
        }
        if (texto.isBlank()) {
            Guia1Dialogos.mostrarError("La palabra no puede estar vacia.");
            return;
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            resultado.append(texto.charAt(i)).append('\n');
        }
        Guia1Dialogos.mostrarResultado("Ej29 - Recorrer una palabra", resultado.toString());
    }
}
