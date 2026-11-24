package guia1.condicionales;

import guia1.Guia1Dialogos;

public class Ej06 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Integer nota = Guia1Dialogos.pedirEntero("Ingresa la nota (0 a 100):");
        if (nota == null) {
            return;
        }
        if (nota < 0 || nota > 100) {
            Guia1Dialogos.mostrarError("La nota debe estar entre 0 y 100.");
            return;
        }

        String clasificacion;
        if (nota >= 90) {
            clasificacion = "Excelente";
        } else if (nota >= 80) {
            clasificacion = "Bueno";
        } else if (nota >= 70) {
            clasificacion = "Aceptable";
        } else if (nota >= 60) {
            clasificacion = "Insuficiente";
        } else {
            clasificacion = "Reprobado";
        }
        Guia1Dialogos.mostrarResultado(
                "Ej06 - Clasificacion de notas", "Nota " + nota + ": " + clasificacion);
    }
}
