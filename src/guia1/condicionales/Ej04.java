package guia1.condicionales;

import guia1.Guia1Dialogos;

public class Ej04 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Double numero1 = Guia1Dialogos.pedirDecimal("Ingresa el primer numero:");
        if (numero1 == null) {
            return;
        }
        Double numero2 = Guia1Dialogos.pedirDecimal("Ingresa el segundo numero:");
        if (numero2 == null) {
            return;
        }
        String operador = Guia1Dialogos.pedirTexto("Ingresa el operador (+, -, * o /):");
        if (operador == null) {
            return;
        }

        String resultado;
        switch (operador) {
            case "+" -> resultado = "Resultado: " + (numero1 + numero2);
            case "-" -> resultado = "Resultado: " + (numero1 - numero2);
            case "*" -> resultado = "Resultado: " + (numero1 * numero2);
            case "/" -> resultado = numero2 == 0
                    ? "Error: no se puede dividir entre cero."
                    : "Resultado: " + (numero1 / numero2);
            default -> resultado = "Error: operador desconocido.";
        }
        Guia1Dialogos.mostrarResultado("Ej04 - Calculadora", resultado);
    }
}
