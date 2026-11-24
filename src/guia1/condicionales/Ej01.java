package guia1.condicionales;

import guia1.Guia1Dialogos;

public class Ej01 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Integer n = Guia1Dialogos.pedirEntero("Ingresa un numero entero:");
        if (n == null) {
            return;
        }

        if (n > 0) {
            Guia1Dialogos.mostrarResultado("Ej01", "Positivo");
        } else if (n < 0) {
            Guia1Dialogos.mostrarResultado("Ej01", "Negativo");
        } else {
            Guia1Dialogos.mostrarResultado("Ej01", "Cero");
        }
    }
}
