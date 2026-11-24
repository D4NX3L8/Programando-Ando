package guia1.condicionales;

import guia1.Guia1Dialogos;

public class Ej03 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Integer edad = Guia1Dialogos.pedirEntero("Ingresa tu edad:");
        if (edad == null) {
            return;
        }

        String resultado;
        if (edad < 0) {
            resultado = "Edad invalida";
        } else if (edad >= 18) {
            resultado = "Puede ingresar";
        } else {
            resultado = "Acceso denegado";
        }
        Guia1Dialogos.mostrarResultado("Ej03", resultado);
    }
}
