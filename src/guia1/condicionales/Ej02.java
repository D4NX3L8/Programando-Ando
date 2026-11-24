package guia1.condicionales;

import guia1.Guia1Dialogos;

public class Ej02 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Integer numero = Guia1Dialogos.pedirEntero("Ingresa un numero entero:");
        if (numero == null) {
            return;
        }

        if (numero % 2 == 0) {
            Guia1Dialogos.mostrarResultado("Ej02", "Par");
        } else {
            Guia1Dialogos.mostrarResultado("Ej02", "Impar");
        }
    }
}
