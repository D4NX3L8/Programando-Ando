package guia1.ciclos;

import guia1.Guia1Dialogos;

public class Ej21 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        int n = 10;
        long factorial = 1;
        if (n < 0) {
            Guia1Dialogos.mostrarError("No existe factorial para numeros negativos.");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            Guia1Dialogos.mostrarResultado(
                    "Ej21 - Factorial", "El factorial de " + n + " es: " + factorial);
        }
    }
}