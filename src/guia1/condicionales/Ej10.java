package guia1.condicionales;

import guia1.Guia1Dialogos;

public class Ej10 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Double peso = Guia1Dialogos.pedirDecimal("Ingresa tu peso en kilogramos:");
        if (peso == null) {
            return;
        }
        Double altura = Guia1Dialogos.pedirDecimal("Ingresa tu altura en metros:");
        if (altura == null) {
            return;
        }
        if (peso <= 0 || altura <= 0) {
            Guia1Dialogos.mostrarError("El peso y la altura deben ser mayores que cero.");
            return;
        }

        double imc = peso / (altura * altura);
        String clasificacion;
        if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc < 25) {
            clasificacion = "Normal";
        } else if (imc < 30) {
            clasificacion = "Sobrepeso";
        } else {
            clasificacion = "Obesidad";
        }
        Guia1Dialogos.mostrarResultado(
                "Ej10 - Calculadora de IMC",
                String.format("Su IMC es: %.2f%nClasificacion: %s", imc, clasificacion));
    }
}
