package guia1.ciclos;

import guia1.Guia1Dialogos;

public class Ej16 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        Guia1Dialogos.mostrarResultado(
                "Ej16 - Suma de impares del 1 al 50",
                "La suma de los impares es: " + suma);
    }
}