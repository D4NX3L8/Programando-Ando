package guia1.condicionales;

import guia1.Guia1Dialogos;

public class Ej08 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Double compra = Guia1Dialogos.pedirDecimal("Ingresa el valor de la compra:");
        if (compra == null) {
            return;
        }
        if (compra < 0) {
            Guia1Dialogos.mostrarError("El valor de la compra no puede ser negativo.");
            return;
        }

        double descuento;
        if (compra > 500000) {
            descuento = compra * 0.20;
        } else if (compra > 200000) {
            descuento = compra * 0.15;
        } else if (compra > 100000) {
            descuento = compra * 0.10;
        } else {
            descuento = 0;
        }
        double total = compra - descuento;
        String resultado = "Valor original: " + String.format("%,.0f", compra)
                + "\nValor del descuento: " + String.format("%,.0f", descuento)
                + "\nTotal a pagar: " + String.format("%,.0f", total);
        Guia1Dialogos.mostrarResultado("Ej08 - Descuento por compra", resultado);
    }
}
