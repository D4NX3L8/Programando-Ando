# GA2-AA1-EV01 — De la consola a JOptionPane

> **Evidencia:** taller de migración a interfaces gráficas.
> **Responsable del documento:** Juan Pablo Arismendy.
> **Aplicación en código:** los seis ejercicios de `src/guia2/dialogos/` y todas las vistas.

## 1. ¿Qué cambia?

La Guía 1 leía y escribía en la consola con `Scanner` y `System.out`. La Guía 2 reemplaza
esa interacción por ventanas emergentes de **Swing** usando `javax.swing.JOptionPane`.

## 2. Tabla de equivalencias

| Consola (`Scanner`) | Interfaz gráfica (`JOptionPane`) |
|---|---|
| `import java.util.Scanner;` | `import javax.swing.JOptionPane;` |
| `Scanner sc = new Scanner(System.in);` | *(no se necesita)* |
| `sc.nextInt()` | `Integer.parseInt(JOptionPane.showInputDialog("Numero:"))` |
| `sc.nextDouble()` | `Double.parseDouble(JOptionPane.showInputDialog("Valor:"))` |
| `sc.nextLine()` | `JOptionPane.showInputDialog("Texto:")` |
| `System.out.println("Hola");` | `JOptionPane.showMessageDialog(null, "Hola");` |
| `System.out.print("...");` | *(no aplica: cada diálogo es una ventana)* |
| `sc.close();` | *(no aplica)* |

## 3. Por qué hace falta try-catch

`JOptionPane.showInputDialog` **siempre devuelve un `String`** (o `null` si el usuario
cancela). Cuando ese texto se convierte a número con `Integer.parseInt` o
`Double.parseDouble`, Java lanza `NumberFormatException` si el texto no es numérico.

Además, si el usuario cancela, el método devuelve `null`; llamar a un método sobre ese
`null` (por ejemplo `nombre.toUpperCase()`) lanza `NullPointerException`.

Por eso todos los ejercicios de esta guía usan `try-catch`, y varios validan antes de usar
el valor.

## 4. Ejercicios y excepción trabajada

| Archivo | Ejercicio | Excepciones | Responsable |
|---|---|---|---|
| `Ej1Division.java` | División entera básica | `NumberFormatException`, `ArithmeticException` | Daniel |
| `Ej2Temperatura.java` | Conversión de temperatura | `NumberFormatException` | Daniel |
| `Ej3IMC.java` | Calculadora de IMC | `NumberFormatException`, `ArithmeticException` (con `throw`) | Jeronimo |
| `Ej4Arreglo.java` | Acceso a arreglo por índice | `NumberFormatException`, `ArrayIndexOutOfBoundsException` | Jeronimo |
| `Ej5Bucle.java` | Validación con bucle (retry) | `NumberFormatException`, `IllegalArgumentException` (con `throw`) | Juan Pablo |
| `Ej6Null.java` | Cancelación del diálogo | `NullPointerException` | Juan Pablo |

## 5. Reglas de estilo de la interfaz

- Un mensaje claro y en español por cada error; nunca un `catch` vacío.
- Título de la ventana acorde al sistema (`"Sabor Local"`).
- No mezclar `Scanner` con `JOptionPane` en el mismo ejercicio.
- Para pedir contraseñas se puede usar `JPasswordField` dentro de un panel; si se usa
  `showInputDialog`, la contraseña queda visible (documentar la decisión).
