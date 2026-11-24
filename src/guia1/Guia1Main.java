package guia1;

import javax.swing.JOptionPane;

import guia1.arreglos.Ej22;
import guia1.arreglos.Ej23;
import guia1.arreglos.Ej24;
import guia1.arreglos.Ej25;
import guia1.arreglos.Ej26;
import guia1.arreglos.Ej27;
import guia1.arreglos.Ej28;
import guia1.arreglos.Ej29;
import guia1.ciclos.Ej11;
import guia1.ciclos.Ej12;
import guia1.ciclos.Ej13;
import guia1.ciclos.Ej14;
import guia1.ciclos.Ej15;
import guia1.ciclos.Ej16;
import guia1.ciclos.Ej17;
import guia1.ciclos.Ej18;
import guia1.ciclos.Ej19;
import guia1.ciclos.Ej20;
import guia1.ciclos.Ej21;
import guia1.condicionales.Ej01;
import guia1.condicionales.Ej02;
import guia1.condicionales.Ej03;
import guia1.condicionales.Ej04;
import guia1.condicionales.Ej05;
import guia1.condicionales.Ej06;
import guia1.condicionales.Ej07;
import guia1.condicionales.Ej08;
import guia1.condicionales.Ej09;
import guia1.condicionales.Ej10;

public class Guia1Main {

    private static final String[] OPCIONES = {
        "Ej01 - Positivo, negativo o cero",
        "Ej02 - Par o impar",
        "Ej03 - Control de acceso por edad",
        "Ej04 - Calculadora",
        "Ej05 - Anio bisiesto",
        "Ej06 - Clasificacion de notas",
        "Ej07 - Mayor de tres numeros",
        "Ej08 - Descuento por compra",
        "Ej09 - Login",
        "Ej10 - Calculadora de IMC",
        "Ej11 - Numeros del 1 al 50",
        "Ej12 - Numeros del 50 al 1",
        "Ej13 - Pares del 1 al 100",
        "Ej14 - Impares del 1 al 100",
        "Ej15 - Suma del 1 al 100",
        "Ej16 - Suma de impares del 1 al 50",
        "Ej17 - Tabla del 7",
        "Ej18 - Tablas del 1 al 10",
        "Ej19 - Multiplos de 10",
        "Ej20 - Divisibles entre 3 y 5",
        "Ej21 - Factorial",
        "Ej22 - Recorrer un arreglo",
        "Ej23 - Suma de un arreglo",
        "Ej24 - Mayor de un arreglo",
        "Ej25 - Menor de un arreglo",
        "Ej26 - Contar ocurrencias",
        "Ej27 - Cuadrado de asteriscos",
        "Ej28 - Numeros y sus cubos",
        "Ej29 - Recorrer una palabra",
        "Salir"
    };

    private static final Runnable[] EJERCICIOS = {
        Ej01::ejecutar,
        Ej02::ejecutar,
        Ej03::ejecutar,
        Ej04::ejecutar,
        Ej05::ejecutar,
        Ej06::ejecutar,
        Ej07::ejecutar,
        Ej08::ejecutar,
        Ej09::ejecutar,
        Ej10::ejecutar,
        Ej11::ejecutar,
        Ej12::ejecutar,
        Ej13::ejecutar,
        Ej14::ejecutar,
        Ej15::ejecutar,
        Ej16::ejecutar,
        Ej17::ejecutar,
        Ej18::ejecutar,
        Ej19::ejecutar,
        Ej20::ejecutar,
        Ej21::ejecutar,
        Ej22::ejecutar,
        Ej23::ejecutar,
        Ej24::ejecutar,
        Ej25::ejecutar,
        Ej26::ejecutar,
        Ej27::ejecutar,
        Ej28::ejecutar,
        Ej29::ejecutar
    };

    private Guia1Main() {
    }

    public static void main(String[] args) {
        while (true) {
            Object seleccion = JOptionPane.showInputDialog(
                    null,
                    "Selecciona el ejercicio que quieres probar:",
                    "Guia 1 - Logica en Java",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    OPCIONES,
                    OPCIONES[0]);

            if (!(seleccion instanceof String opcion) || "Salir".equals(opcion)) {
                return;
            }

            for (int i = 0; i < EJERCICIOS.length; i++) {
                if (OPCIONES[i].equals(opcion)) {
                    EJERCICIOS[i].run();
                    break;
                }
            }
        }
    }
}
