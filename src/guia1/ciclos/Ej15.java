package guia1.ciclos;

import guia1.Guia1Dialogos;

public class Ej15 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        Guia1Dialogos.mostrarResultado("Ej15 - Suma del 1 al 100", "La suma es: " + suma);
    }
}
