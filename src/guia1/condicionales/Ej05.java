package guia1.condicionales;

import guia1.Guia1Dialogos;

public class Ej05 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Integer anio = Guia1Dialogos.pedirEntero("Ingresa un anio:");
        if (anio == null) {
            return;
        }

        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
        String resultado = anio + (bisiesto ? " es bisiesto." : " no es bisiesto.");
        Guia1Dialogos.mostrarResultado("Ej05 - Anio bisiesto", resultado);
    }
}
