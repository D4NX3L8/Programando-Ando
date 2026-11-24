package guia1.condicionales;

import guia1.Guia1Dialogos;

public class Ej07 {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Integer a = Guia1Dialogos.pedirEntero("Ingresa el primer numero:");
        if (a == null) {
            return;
        }
        Integer b = Guia1Dialogos.pedirEntero("Ingresa el segundo numero:");
        if (b == null) {
            return;
        }
        Integer c = Guia1Dialogos.pedirEntero("Ingresa el tercer numero:");
        if (c == null) {
            return;
        }

        int mayor = Math.max(a, Math.max(b, c));
        int iguales = 0;
        if (a == mayor) {
            iguales++;
        }
        if (b == mayor) {
            iguales++;
        }
        if (c == mayor) {
            iguales++;
        }
        StringBuilder resultado = new StringBuilder("El mayor es: ").append(mayor);
        if (iguales == 2) {
            resultado.append("\nEmpate entre dos numeros.");
        } else if (iguales == 3) {
            resultado.append("\nEmpate entre los tres.");
        }
        Guia1Dialogos.mostrarResultado("Ej07 - Mayor de tres numeros", resultado.toString());
    }
}
