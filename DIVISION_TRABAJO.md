# División del trabajo — Programando Ando

**Proyecto:** Construcción de software con persistencia local
**Guías:** Java 1 (lógica, 29 ejercicios) y Java 2 (JOptionPane, try-catch, SQLite y CRUD)
**Equipo:** Daniel Ochoa Taborda · Jeronimo Henao · Juan Pablo Arismendy
**Instructor:** Mateo Arroyave Quintero

> Este documento es la fuente de verdad del reparto. Cada tarea dice **qué archivo tocar,
> qué debe hacer el código, qué validar y cómo se comprueba que quedó bien**. No basta con
> "hacer el ejercicio": tiene que compilar, ejecutarse y cumplir la validación indicada.

---

## Índice

1. [Reglas del equipo y del repositorio](#1-reglas-del-equipo-y-del-repositorio)
2. [Resumen del reparto](#2-resumen-del-reparto)
3. [Guía 1 — Lógica en Java (29 ejercicios)](#3-guía-1--lógica-en-java-29-ejercicios)
4. [Guía 2 — Persistencia, JOptionPane y CRUD](#4-guía-2--persistencia-joptionpane-y-crud)
5. [Trabajo conjunto obligatorio](#5-trabajo-conjunto-obligatorio)
6. [Orden de trabajo y dependencias](#6-orden-de-trabajo-y-dependencias)
7. [Checklist de entrega](#7-checklist-de-entrega)
8. [Cómo se evalúa](#8-cómo-se-evalúa)
9. [Errores que cuestan nota](#9-errores-que-cuestan-nota)

---

## 1. Reglas del equipo y del repositorio

### 1.1 Ramas

| Integrante | Rama de trabajo |
|---|---|
| Daniel Ochoa Taborda | `daniel` |
| Jeronimo Henao | `jeronimo` |
| Juan Pablo Arismendy | `juanpablo` |

- `main` es la rama estable. **Nadie hace commit directo a `main`.**
- Cada uno trabaja en su rama y abre un **Pull Request** hacia `main`.
- Antes de empezar cada sesión:

```bash
git checkout main
git pull origin main
git checkout daniel        # o jeronimo / juanpablo
git merge main             # traer lo último de main a tu rama
```

- Si dos personas necesitan tocar el mismo archivo, **primero avisan por el chat del grupo**.
  En este reparto los archivos no se cruzan: cada quien tiene los suyos.

### 1.2 Commits

Formato: `tipo(alcance): descripción en imperativo`

| Tipo | Cuándo |
|---|---|
| `feat` | nueva funcionalidad o ejercicio |
| `fix` | corrección de un error |
| `docs` | documentación |
| `refactor` | cambio de código que no cambia el comportamiento |
| `chore` | configuración, dependencias |

Ejemplos:

```
feat(guia1): ejercicios de condicionales y ciclos
feat(guia2): DAO de usuarios y platos con PreparedStatement
docs(guia2): diagrama de clases del sistema
fix(guia2): validar division entre cero en la calculadora
```

Un commit por bloque terminado (no un commit por línea, no todo en un solo commit al final).

### 1.3 Código

- **Java 21**, archivos **UTF-8**, indentación de 4 espacios.
- Nombres de clases en `PascalCase`, variables y métodos en `camelCase`.
- Comentarios y mensajes al usuario **en español, sin tildes** en el código (para evitar
  problemas de codificación en Windows).
- **`PreparedStatement` siempre**, nunca concatenar SQL.
- Comparar `String` con `.equals()`, nunca con `==`.
- Usar `try-with-resources` para `Connection`, `PreparedStatement` y `ResultSet`.
- Los ejercicios de la Guía 1 **no deben cerrar el `Scanner`** (`sc.close()`), porque
  `Guia1Main` lo reutiliza para volver al menú.
- Ningún `catch` vacío: siempre mostrar o registrar el error.

### 1.4 Compilar y ejecutar

```bash
bash scripts/compilar.sh     # compila todo a out/
bash scripts/ejecutar.sh     # abre el menú principal
```

También sirve el botón ▶ *Run* de VS Code sobre cualquier clase con `main`.
El driver SQLite ya está en `libs/` y configurado en `.vscode/settings.json`.

### 1.5 Entorno ya listo (no hay que instalarlo)

- JDK 21 (`java` y `javac` en el PATH, `JAVA_HOME` configurado).
- VS Code + **Extension Pack for Java**.
- Driver `libs/sqlite-jdbc-3.53.2.0.jar` y librería referenciada en VS Code.
- Estructura de paquetes, menús, modelos y contratos de los DAO ya creados.
- Scripts de compilación y ejecución.

> En el primer commit ya están los **esqueletos** de las 35 clases de ejercicios y de las
> clases del CRUD, cada una con su enunciado y un `TODO`. Completar un ejercicio es
> reemplazar su `TODO`, no crear archivos nuevos (así se evitan conflictos de merge).

---

## 2. Resumen del reparto

| | Daniel Ochoa Taborda | Jeronimo Henao | Juan Pablo Arismendy |
|---|---|---|---|
| **Guía 1** | **2, 8, 9, 17, 19, 20, 25, 27, 28** · 9 ej · **16 pts** | **3, 4, 10, 11, 14, 16, 21, 22, 24, 26** · 10 ej · **17 pts** | **1, 5, 6, 7, 12, 13, 15, 18, 23, 29** · 10 ej · **17 pts** |
| **Guía 2 — evidencia** | **GA2-AA1-EV02** (SQLite) + modelos + DAO + datos iniciales | **Modulo B/D** (login, sesión) + wiring | **Modulo C** (CRUD visual) + **EV01** (migración JOptionPane) |
| **Guía 2 — try-catch** | EJ1 y EJ2 | EJ3 y EJ4 | EJ5 y EJ6 |
| **Documentos** | Esquema SQL en `docs/DISENO.md` | Flujo de login en `docs/DISENO.md` | `docs/DISENO.md` completo + `docs/EV01_JOOPTIONPANE.md` |
| **Sustentación** | Persistencia, POO y DAO | Login, seguridad y sesión | Vistas, validaciones y CRUD |
| **Carga estimada** | ~11 h | ~10 h | ~11 h |

**Regla de oro:** Daniel es el primero en entregar (los DAO son la base de todo).
Jeronimo y Juan Pablo pueden avanzar en paralelo porque los **contratos de los métodos ya
existen** en el repositorio (aunque su cuerpo esté en `TODO`).

---

## 3. Guía 1 — Lógica en Java (29 ejercicios)

**Carpeta:** `src/guia1/` · **Menú de prueba:** `guia1.Guia1Main`
**Todos** usan `Scanner` para la entrada y se ejecutan sin errores.

### 3.1 Reparto equitativo (por qué así)

Cada ejercicio vale según su nivel: **Básico = 1 punto, Medio = 2 puntos, Avanzado = 3 puntos**.
La guía suma **50 puntos**, que no se pueden repartir exactos entre tres (16,67 cada uno),
así que el reparto más justo posible es **17 / 17 / 16**:

| | Daniel Ochoa | Jeronimo Henao | Juan Pablo Arismendy |
|---|---|---|---|
| **Ejercicios** | 2, 8, 9, 17, 19, 20, 25, 27, 28 | 3, 4, 10, 11, 14, 16, 21, 22, 24, 26 | 1, 5, 6, 7, 12, 13, 15, 18, 23, 29 |
| **Cantidad** | 9 | 10 | 10 |
| **Básicos (1 pt)** | 3 | 4 | 4 |
| **Medios (2 pts)** | 5 | 5 | 5 |
| **Avanzados (3 pts)** | 1 | 1 | 1 |
| **Puntos totales** | **16** | **17** | **17** |
| **Condicionales** | 3 | 3 | 4 |
| **Ciclos** | 3 | 4 | 4 |
| **Arreglos** | 3 | 3 | 2 |

**Todos tienen exactamente 5 ejercicios medios y 1 avanzado.** La única diferencia es un
básico más para Jeronimo y Juan Pablo, porque Daniel asume la carga más pesada de la Guía 2
(toda la capa de persistencia). Y los tres trabajan las tres temáticas: nadie se queda solo
con condicionales ni solo con ciclos.

> 16 + 17 + 17 = 50. No existe un reparto más parejo que este: si se igualan los puntos a 17,
> uno tendría que quedar en 16 por fuerza. Daniel queda con 9 ejercicios para compensar su
> mayor trabajo en la Guía 2.

### 3.2 Daniel Ochoa — 9 ejercicios (16 puntos)

**Archivos:** `condicionales/Ej02.java`, `Ej08.java`, `Ej09.java` ·
`ciclos/Ej17.java`, `Ej19.java`, `Ej20.java` · `arreglos/Ej25.java`, `Ej27.java`, `Ej28.java`

---

**Ej02 · Par o impar** — `src/guia1/condicionales/Ej02.java`
- Pide un número entero.
- Lógica: `n % 2 == 0` → `"Par"`, si no `"Impar"`.
- Debe funcionar con negativos (`-4` es par) y con `0` (es par).

**Ej08 · Descuento por compra** — `src/guia1/condicionales/Ej08.java`
- Pide el valor de la compra (`double`). Validar que sea `>= 0`.
- Descuento: `> 500000` → 20 %; `> 200000` → 15 %; `> 100000` → 10 %; si no, 0 %.
- Mostrar **tres líneas**: valor original, valor del descuento, total a pagar.
- Usar `String.format("%,.0f", valor)` para que se vea `$500.000`.

**Ej09 · Login con equals** — `src/guia1/condicionales/Ej09.java`
- Pide usuario y contraseña con `sc.next()`.
- Comparar `usuario.equals("admin") && clave.equals("1234")`.
- `"Bienvenido"` o `"Credenciales incorrectas"`.
- Aceptación: `admin 1234` y `admin 1111` (debe fallar).

**Ej17 · Tabla de multiplicar del 7** — `src/guia1/ciclos/Ej17.java`
- Tabla del 7 del 1 al 10 con un `for`.
- Formato exacto: `7 x 1 = 7` … `7 x 10 = 70`.

**Ej19 · Múltiplos de 10 del 1 al 200** — `src/guia1/ciclos/Ej19.java`
- Contar cuántos números del 1 al 200 son múltiplos de 10 con un `for`.
- Patrón **contador** (`contador++`), no acumulador.
- Resultado esperado: `20`.

**Ej20 · Divisibles entre 3 y 5** — `src/guia1/ciclos/Ej20.java`
- Mostrar los números del 1 al 100 que sean divisibles entre 3 **Y** entre 5 a la vez.
- Condición: `i % 3 == 0 && i % 5 == 0` (equivale a `i % 15 == 0`).

**Ej25 · Menor de un arreglo** — `src/guia1/arreglos/Ej25.java`
- Declarar `int[] nums = {5, 12, 7, 3, 20, 8, 15, 1, 9, 4};`
- Encontrar el menor con un ciclo. Iniciar en `nums[0]` (no en `0`, rompe con negativos).
- Resultado esperado: `1`.

**Ej27 · Cuadrado de asteriscos 6×6** — `src/guia1/arreglos/Ej27.java` *(Avanzado)*
- Dos `for` anidados: 6 filas × 6 columnas.
- El interno imprime con `print` (sin salto); el externo cierra la fila con `println()`.
- Resultado: 6 filas de `* * * * * *`.

**Ej28 · Primeros 20 números y su cubo** — `src/guia1/arreglos/Ej28.java`
- `for` del 1 al 20 mostrando número y `n * n * n`.
- Formato: `1 -> 1` … `20 -> 8000`.
- Ojo: `^` en Java **no** es potencia (es XOR).

### 3.3 Jeronimo Henao — 10 ejercicios (17 puntos)

**Archivos:** `condicionales/Ej03.java`, `Ej04.java`, `Ej10.java` ·
`ciclos/Ej11.java`, `Ej14.java`, `Ej16.java`, `Ej21.java` ·
`arreglos/Ej22.java`, `Ej24.java`, `Ej26.java`

---

**Ej03 · Control de acceso por edad** — `src/guia1/condicionales/Ej03.java`
- Pide la edad (entero).
- **Validar primero** `edad < 0` → `"Edad invalida"`.
- Luego: `edad >= 18` → `"Puede ingresar"`; si no → `"Acceso denegado"`.
- Aceptación: `20`, `15`, `-1`.

**Ej04 · Calculadora con switch** — `src/guia1/condicionales/Ej04.java`
- Pide dos números (`double`) y un operador con `sc.next().charAt(0)`.
- `switch (op)` con `'+'`, `'-'`, `'*'`, `'/'`.
- En `'/'`: si el divisor es `0` → `"No se puede dividir entre cero"` (validar **antes** de dividir).
- `default` → `"Operador invalido"`. Salida: `"Resultado: " + resultado`.
- Aceptación: `8 2 +` → 10; `8 0 /` → error; `8 2 %` → operador inválido.

**Ej10 · Calculadora de IMC** — `src/guia1/condicionales/Ej10.java` *(Avanzado)*
- Pide peso (kg) y altura (m) como `double`.
- Validar `peso > 0` y `altura > 0` antes de calcular.
- `imc = peso / (altura * altura)`.
- Clasificar: `< 18.5` Bajo peso · `< 25` Normal · `< 30` Sobrepeso · `>= 30` Obesidad.
- Mostrar el IMC con 2 decimales y la clasificación.
- Aceptación: `70 1.75` → 22.86 Normal.

**Ej11 · Números del 1 al 50** — `src/guia1/ciclos/Ej11.java`
- `for` de 1 a 50, un número por línea.

**Ej14 · Impares del 1 al 100 con while** — `src/guia1/ciclos/Ej14.java`
- Obligatorio `while`; la variable se incrementa **dentro** del ciclo (si no, es infinito).
- Resultado: 1, 3, 5, … 99 (50 líneas).

**Ej16 · Suma de impares del 1 al 50** — `src/guia1/ciclos/Ej16.java`
- Acumulador declarado **fuera** del ciclo (`int suma = 0;`).
- Resultado esperado: `625`.

**Ej21 · Factorial** — `src/guia1/ciclos/Ej21.java`
- Factorial de una variable (`int n = 10`) con un `for`.
- Validar `n >= 0`; el factorial de `0` es `1`.
- Usar `long` (`int` se desborda desde 13!). Resultado con `n = 10`: `3628800`.

**Ej22 · Recorrer un arreglo** — `src/guia1/arreglos/Ej22.java`
- Declarar `int[] nums` con 10 valores de ejemplo.
- Recorrer con índice de `0` a `nums.length - 1` (usar `<`, no `<=`).
- Imprimir `nums[0] = 5` … `nums[9] = 4`.

**Ej24 · Mayor de un arreglo** — `src/guia1/arreglos/Ej24.java`
- Encontrar el mayor con un ciclo. Iniciar en `nums[0]`.
- Resultado esperado: `20`.

**Ej26 · Contar ocurrencias** — `src/guia1/arreglos/Ej26.java`
- Contar cuántas veces aparece `int buscado = 7` en el arreglo.
- Contador que aumenta cuando `n == buscado`.
- Mensaje: `7 aparece 1 vez`.

### 3.4 Juan Pablo Arismendy — 10 ejercicios (17 puntos)

**Archivos:** `condicionales/Ej01.java`, `Ej05.java`, `Ej06.java`, `Ej07.java` ·
`ciclos/Ej12.java`, `Ej13.java`, `Ej15.java`, `Ej18.java` ·
`arreglos/Ej23.java`, `Ej29.java`

---

**Ej01 · Positivo, negativo o cero** — `src/guia1/condicionales/Ej01.java`
- Pide un número entero.
- `if (n > 0)` → `"Positivo"`; `else if (n < 0)` → `"Negativo"`; `else` → `"Cero"`.
- Aceptación: `5`, `-3` y `0`.

**Ej05 · Año bisiesto** — `src/guia1/condicionales/Ej05.java`
- Pide un año entero.
- Lógica exacta:
  ```java
  boolean bisiesto = (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
  ```
- Salida: `"2024 es bisiesto"` / `"2023 no es bisiesto"`.
- Aceptación: `2024` sí, `1900` no, `2000` sí.

**Ej06 · Clasificación de notas** — `src/guia1/condicionales/Ej06.java`
- Pide una nota entera.
- **Validar primero** el rango: si `nota < 0 || nota > 100` → `"Nota invalida"` y no seguir.
- Clasificar descendente: `>= 90` Excelente · `>= 80` Bueno · `>= 70` Aceptable ·
  `>= 60` Insuficiente · resto Reprobado.
- Aceptación: `95`, `85`, `75`, `65`, `40`, `101` y `-5`.

**Ej07 · Mayor de tres números** — `src/guia1/condicionales/Ej07.java`
- Pide tres enteros.
- Mayor con `Math.max(a, Math.max(b, c))`.
- Contar cuántos son iguales al mayor: 2 → `"Empate entre dos numeros"`, 3 → `"Empate entre los tres"`.
- Aceptación: `3 7 5`, `7 7 5`, `7 7 7`.

**Ej12 · Números del 50 al 1** — `src/guia1/ciclos/Ej12.java`
- `for` descendente (`i = 50; i >= 1; i--`), un número por línea.

**Ej13 · Pares del 1 al 100** — `src/guia1/ciclos/Ej13.java`
- `for` de 1 a 100 mostrando solo los pares (`i % 2 == 0` o `i += 2`).
- Resultado: 2, 4, … 100.

**Ej15 · Suma del 1 al 100** — `src/guia1/ciclos/Ej15.java`
- Acumulador `suma += i` dentro del `for`.
- Resultado esperado: `5050`.

**Ej18 · Tablas del 1 al 10** — `src/guia1/ciclos/Ej18.java`
- `for` anidados: por cada tabla (1 a 10) el interno recorre del 1 al 10.
- Encabezado por tabla: `--- Tabla del 1 ---`.

**Ej23 · Suma de un arreglo** — `src/guia1/arreglos/Ej23.java`
- Declarar `int[] nums` con valores de ejemplo y sumar todos los elementos.
- Con el arreglo de ejemplo (`5, 12, 7, 3, 20, 8, 15, 1, 9, 4`) el resultado es `84`.

**Ej29 · Recorrer una cadena** — `src/guia1/arreglos/Ej29.java` *(Avanzado)*
- Recorrer un `String` e imprimir un carácter por línea.
- Usar `texto.length()` y `texto.charAt(i)` con un `for` clásico (no `for-each`).

### 3.5 Cómo se comprueba la Guía 1 (los tres)

```bash
bash scripts/compilar.sh
java -cp out guia1.Guia1Main
```

Elegir el número del ejercicio, probar los casos de aceptación y volver al menú.
**Criterio de terminado:** compila, corre con `Scanner`, valida lo que dice el enunciado y
no imprime resultados "quemados" (los valores deben salir de la lógica).

---

## 4. Guía 2 — Persistencia, JOptionPane y CRUD

**Sistema elegido:** *Sabor Local* — administración de los platos de un restaurante.
**Entidad de negocio:** `Plato` (nombre, categoría, precio, disponible).
**Paquete raíz:** `src/guia2/` · **Base de datos:** SQLite (`mibasededatos.db`).

### 4.1 Reparto de evidencias

| Evidencia de la guía | Qué es | Responsable |
|---|---|---|
| **GA2-AA1-EV01** | Migración de `Scanner` a `JOptionPane` + documentación | Juan Pablo (documento) y los tres (se aplica en los 6 ejercicios) |
| **GA2-AA1-EV02** | Driver + conexión + creación de tablas | **Daniel** |
| **GA2-AA2-EV03** | CRUD completo | Daniel (DAO) + Juan Pablo (vista/controlador) |
| **GA2-AA2-EV04** | Login, POO, sesión y sustentación | Jeronimo (login) + los tres (sustentación) |

> La guía habla de "parejas" porque está escrita para dos integrantes. Al ser tres, el
> sistema se reparte por capas (datos / seguridad / interfaz) y la sustentación es individual.

### 4.2 Daniel — Persistencia (GA2-AA1-EV02, modelos y DAO)

#### a) Conexión y tablas

Archivos ya creados que Daniel **verifica y deja funcionando**:

- `src/ConexionDb/ConexionDB.java`
  - URL: `jdbc:sqlite:mibasededatos.db`.
  - `getConexion()` devuelve la `Connection` o `null` si falla.
  - Prueba: al ejecutar `guia2.Guia2App` debe aparecer `mibasededatos.db` en la raíz.
- `src/ConexionDb/InicializarDB.java`
  - `crearTablas()` ya crea `usuarios` y `platos` con `CREATE TABLE IF NOT EXISTS`.
  - **Falta implementar `insertarDatosIniciales()`** (Fase 3).

#### b) Datos iniciales (Fase 3) — obligatorio

```java
public static void insertarDatosIniciales() {
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    usuarioDAO.insertarSiNoExiste("admin", "admin123");
    usuarioDAO.insertarSiNoExiste("empleado", "emp456");

    PlatoDAO platoDAO = new PlatoDAO();
    platoDAO.insertarSiNoExiste(new Plato("Bandeja paisa", "Fuerte", 28000, true));
    platoDAO.insertarSiNoExiste(new Plato("Ajiaco santafereño", "Fuerte", 25000, true));
    platoDAO.insertarSiNoExiste(new Plato("Limonada natural", "Bebida", 6000, true));
    platoDAO.insertarSiNoExiste(new Plato("Tres leches", "Postre", 9000, false));
}
```

- Mínimo **2 usuarios** (`admin/admin123`, `empleado/emp456`) y **3 platos**.
- Debe poder ejecutarse varias veces sin duplicar (de ahí `insertarSiNoExiste`).

#### c) `UsuarioDAO` — `src/guia2/dao/UsuarioDAO.java`

| Método | SQL exacto | Regla |
|---|---|---|
| `validar(user, pass)` | `SELECT 1 FROM usuarios WHERE username = ? AND password = ?` | `return rs.next();` |
| `existe(user)` | `SELECT 1 FROM usuarios WHERE username = ?` | `return rs.next();` |
| `insertar(u)` | `INSERT INTO usuarios (username, password) VALUES (?, ?)` | `ps.setString(1, ...)`, `executeUpdate()` |
| `insertarSiNoExiste(u, p)` | usa `existe()` y luego `insertar()` | no duplica |
| `listar()` | `SELECT id, username FROM usuarios ORDER BY id` | arma `List<Usuario>` |

#### d) `PlatoDAO` — `src/guia2/dao/PlatoDAO.java`

| Método | SQL exacto | Regla |
|---|---|---|
| `insertar(p)` | `INSERT INTO platos (nombre, categoria, precio, disponible) VALUES (?, ?, ?, ?)` | `setBoolean` o `1/0` |
| `listar()` | `SELECT * FROM platos ORDER BY id` | mapear cada fila a `Plato` |
| `buscarPorId(id)` | `SELECT * FROM platos WHERE id = ?` | `return null` si no existe |
| `actualizar(p)` | `UPDATE platos SET nombre=?, categoria=?, precio=?, disponible=? WHERE id=?` | `return executeUpdate() > 0` |
| `eliminar(id)` | `DELETE FROM platos WHERE id = ?` | `return executeUpdate() > 0` |
| `existePorNombre(n)` | `SELECT 1 FROM platos WHERE nombre = ?` | `return rs.next()` |
| `insertarSiNoExiste(p)` | usa `existePorNombre()` | no duplica |

**Reglas obligatorias de los DAO:**

- `try-with-resources` en todo (`Connection`, `PreparedStatement`, `ResultSet`).
- Los `?` se llenan con `setString`, `setDouble`, `setInt`; **nunca** concatenar.
- Si `ConexionDB.getConexion()` devuelve `null`, salir sin lanzar `NullPointerException`.
- Cada `SQLException` se informa con `System.err.println` o se propaga; no dejar `catch` vacío.

#### e) Cómo comprobar la EV02

1. Abrir VS Code → panel **Java Projects** → **Referenced Libraries** → debe aparecer
   `sqlite-jdbc-3.53.2.0.jar`.
2. Ejecutar `guia2.Guia2App`: en la raíz del proyecto aparece `mibasededatos.db`.
3. Con un cliente SQLite (DB Browser, o `sqlite3` si está instalado) verificar:
   ```sql
   SELECT name FROM sqlite_master WHERE type = 'table';   -- usuarios, platos, sqlite_sequence
   SELECT * FROM usuarios;                                -- admin y empleado
   SELECT * FROM platos;                                  -- minimo 3
   ```
4. Guardar captura de pantalla de `Referenced Libraries` y de las tres consultas.

### 4.3 Jeronimo — Seguridad, login y flujo (Módulo B y D)

#### a) Ejercicios de try-catch asignados

**`src/guia2/dialogos/Ej3IMC.java`**
- Pide peso y estatura con `JOptionPane.showInputDialog` y `Double.parseDouble`.
- Si `altura == 0`: `throw new ArithmeticException("La estatura no puede ser 0")`.
- `catch (NumberFormatException)` → `"Dato invalido. Usa punto decimal. Ej: 1.70"`.
- `catch (ArithmeticException)` → `"Error: " + e.getMessage()`.
- Mostrar el IMC con `String.format("%.2f", imc)`.

**`src/guia2/dialogos/Ej4Arreglo.java`**
- `String[] nombres = {"Ana", "Luis", "Maria", "Pedro", "Sofia"};`
- Pedir la posición y mostrar `nombres[i]`.
- `catch (NumberFormatException)` → `"Ingresa un numero entero."`.
- `catch (ArrayIndexOutOfBoundsException)` → `"Posicion invalida. Solo existen posiciones 0 a 4."`.

**Criterio:** los dos usan solo `JOptionPane` (ni `Scanner` ni `System.out`), y cada error
muestra un mensaje distinto.

#### b) `LoginVista` — `src/guia2/vista/LoginVista.java`

| Método | Qué hace |
|---|---|
| `pedirUsuario()` | `JOptionPane.showInputDialog("Usuario:")`; devuelve `null` si cancelan |
| `pedirPassword()` | `showInputDialog("Contrasena:")` |
| `mostrarBienvenida(u)` | `"Bienvenido, " + u` |
| `mostrarError(m)` | diálogo con `WARNING_MESSAGE` |
| `mostrarBloqueado()` | `"Demasiados intentos fallidos. Cerrando el sistema."` con `ERROR_MESSAGE` |

#### c) `LoginControlador` — `src/guia2/controlador/LoginControlador.java`

Reglas exactas de la guía (3.4):

1. Ciclo de **máximo 3 intentos**.
2. En cada intento: pedir usuario y contraseña con `LoginVista`.
3. Si el usuario cancela (`null`) → `return false`.
4. Si usuario o contraseña están vacíos → error y contar el intento.
5. Validar con `usuarioDAO.validar(user, pass)` (que internamente usa `PreparedStatement`).
6. Si es correcto: guardar `usuarioActual = user`, mostrar bienvenida y `return true`.
7. Si falla: `"Credenciales incorrectas. Intento X de 3"`.
8. Al terminar los 3 intentos: `mostrarBloqueado()` y `return false`.

```java
// Esqueleto esperado
for (int intento = 1; intento <= MAX_INTENTOS; intento++) {
    String user = vista.pedirUsuario();
    if (user == null) return false;
    String pass = vista.pedirPassword();
    if (pass == null) return false;

    if (usuarioDAO.validar(user, pass)) {
        usuarioActual = user;
        vista.mostrarBienvenida(user);
        return true;
    }
    vista.mostrarError("Credenciales incorrectas. Intento " + intento + " de 3.");
}
vista.mostrarBloqueado();
return false;
```

#### d) `cerrarSesion()` y `Guia2App`

- `cerrarSesion()` limpia `usuarioActual = null` (Módulo D).
- `Guia2App` ya tiene el flujo: login → menú → CRUD → opción 5 vuelve al login →
  opción 0 sale. Jeronimo lo **prueba y corrige** si algo no encaja.
- Prueba obligatoria: entrar con `admin/admin123`, elegir **Cerrar sesión**, entrar con
  `empleado/emp456` **sin cerrar el programa**.

### 4.4 Juan Pablo — Interfaz del CRUD (Módulo C) y documentación

#### a) Ejercicios de try-catch asignados

**`src/guia2/dialogos/Ej5Bucle.java`**
- Pedir un número entre 1 y 100 y **repetir el diálogo** hasta que sea válido.
- `boolean valido = false; while (!valido) { ... }`.
- Si el texto no es número → `catch (NumberFormatException)` → `"Solo numeros enteros..."`.
- Si está fuera de rango → `throw new IllegalArgumentException("Fuera de rango")` y
  `catch (IllegalArgumentException)` → `"El numero debe estar entre 1 y 100."`.
- Al final: `"Numero aceptado: " + numero`.

**`src/guia2/dialogos/Ej6Null.java`**
- Pedir el nombre con `showInputDialog` y mostrar `"Hola, " + nombre.toUpperCase() + "!"`.
- Si cancelan, `nombre` es `null` y `toUpperCase()` lanza `NullPointerException`.
- `catch (NullPointerException)` → `"Cancelaste la operacion. El nombre es requerido."`.
- **Además**, agregar la versión segura: `if (nombre == null || nombre.isBlank())`.

**Criterio:** los dos usan solo `JOptionPane`, y el EJ6 demuestra las dos formas (catch y validación previa).

#### b) `MenuVista` — `src/guia2/vista/MenuVista.java`

- Título con el usuario: `"Menu principal - " + usuario`.
- `showOptionDialog` con estas 6 opciones **en este orden**:
  `Agregar plato`, `Ver todos`, `Actualizar`, `Eliminar`, `Cerrar sesion`, `Salir`.
- Traducir la posición del arreglo al contrato de `Guia2App`:
  `0→1`, `1→2`, `2→3`, `3→4`, `4→5`, `5→0`.
- Si el usuario cierra el diálogo (`CLOSED_OPTION`) → devolver `0` (salir).
- `despedida()` → `"Gracias por usar Sabor Local."`.

#### c) `PlatoVista` — `src/guia2/vista/PlatoVista.java`

| Método | Qué debe hacer |
|---|---|
| `pedirNuevo()` | Pedir nombre, categoría, precio y disponibilidad; devolver `Plato` o `null` si cancelan |
| `pedirId(accion)` | Pedir el ID con `Integer.parseInt`; `-1` si cancelan o el texto no es número |
| `pedirDatosActualizados(id)` | Pedir los nuevos valores y devolver `new Plato(id, ...)` |
| `mostrar(lista)` | Armar un `StringBuilder` con un plato por línea (`Plato.toString()`) o `"No hay platos registrados."` |
| `confirmar(msg)` | `JOptionPane.showConfirmDialog(...) == JOptionPane.YES_OPTION` |
| `mensaje(msg)` | `showMessageDialog` informativo |

**Reglas de la vista:** no accede a la base de datos, no calcula nada de negocio, solo
recoge y muestra. El precio se valida con `try-catch` de `NumberFormatException`.

#### d) `PlatoControlador` — `src/guia2/controlador/PlatoControlador.java`

| Método | Lógica exacta |
|---|---|
| `agregar()` | `Plato p = vista.pedirNuevo();` → si `null` salir. Validar nombre no vacío y `precio > 0`. Si `dao.existePorNombre(p.getNombre())` → `"Ya existe un plato con ese nombre."`. Si no → `dao.insertar(p)` y `"Plato agregado correctamente."` |
| `verTodos()` | `vista.mostrar(dao.listar())` |
| `actualizar()` | `int id = vista.pedirId("actualizar")`; `Plato actual = dao.buscarPorId(id)`; si `null` → `"No existe un plato con ese ID."`; `Plato nuevos = vista.pedirDatosActualizados(id)`; si `null` salir; `dao.actualizar(nuevos)` → mensaje de éxito o error |
| `eliminar()` | `int id = vista.pedirId("eliminar")`; `Plato p = dao.buscarPorId(id)`; si `null` → mensaje; `vista.confirmar("¿Eliminar " + p.getNombre() + "?")`; `dao.eliminar(id)` → mensaje |

#### e) Documentos

**`docs/DISENO.md`** (Fase 1 — entregable previo a programar):
- Nombre del sistema: **Sabor Local**.
- Temática: administración de platos de un restaurante.
- Diagrama de clases en Mermaid con: `Usuario`, `Plato`, `UsuarioDAO`, `PlatoDAO`,
  `LoginVista`, `LoginControlador`, `MenuVista`, `PlatoVista`, `PlatoControlador`.
- Relación: qué clase gestiona la base de datos de cada entidad (los DAO).
- Esquema SQL de `usuarios` y `platos` (copiarlo de `InicializarDB`).

**`docs/EV01_JOOPTIONPANE.md`** (evidencia de la migración):
- Tabla de equivalencias:

  | Consola (`Scanner`) | Interfaz (`JOptionPane`) |
  |---|---|
  | `import java.util.Scanner;` | `import javax.swing.JOptionPane;` |
  | `Scanner sc = new Scanner(System.in);` | — |
  | `sc.nextInt()` | `Integer.parseInt(JOptionPane.showInputDialog("..."))` |
  | `sc.nextDouble()` | `Double.parseDouble(JOptionPane.showInputDialog("..."))` |
  | `sc.nextLine()` | `JOptionPane.showInputDialog("...")` |
  | `System.out.println("...")` | `JOptionPane.showMessageDialog(null, "...")` |

- Explicar que `parseInt`/`parseDouble` lanzan `NumberFormatException` y por eso los
  ejercicios de try-catch usan `try-catch`.
- Enumerar los 6 ejercicios (`Ej1Division` … `Ej6Null`) y qué excepción trabaja cada uno.

### 4.5 Cómo se comprueba la Guía 2 (los tres)

Con entorno gráfico:

```bash
bash scripts/compilar.sh
java -cp "out:libs/*" guia2.Guia2App
```

1. Login con `admin/admin123` → entra al menú.
2. **Agregar** un plato → **Ver todos** → aparece.
3. **Actualizar** ese plato → **Ver todos** → cambio visible.
4. **Eliminar** el plato → confirmar → **Ver todos** → ya no está.
5. Login fallido 3 veces → el programa se cierra con el mensaje.
6. **Cerrar sesión** → vuelve al login → entrar con `empleado/emp456`.

---

## 5. Trabajo conjunto obligatorio

### 5.1 Fase 1 — Diseño (antes de codificar el CRUD)

Los tres revisan y aprueban `docs/DISENO.md` (lo redacta Juan Pablo con los aportes de
Daniel en el esquema SQL y de Jeronimo en el flujo de login). Debe estar **mergeado en
`main` antes** de empezar a implementar el CRUD.

### 5.2 Fase 4 — Sustentación (10 minutos)

Guion sugerido:

| Minuto | Quién | Qué muestra |
|---|---|---|
| 0–2 | Jeronimo | Login exitoso, login fallido (3 intentos) y cerrar sesión |
| 2–5 | Juan Pablo | Demo de las 4 operaciones CRUD con JOptionPane |
| 5–7 | Daniel | Modelo de datos, `PreparedStatement` y por qué evita inyección SQL |
| 7–10 | Los tres | Preguntas del instructor (cada uno responde sobre su módulo) |

**Cada integrante debe poder responder sobre cualquier parte del código**, no solo la suya.

---

## 6. Orden de trabajo y dependencias

| Momento | Daniel | Jeronimo | Juan Pablo |
|---|---|---|---|
| **1. Base** | Implementa `UsuarioDAO` y `PlatoDAO` (son la base de todos) y los sube primero | Implementa `Ej3IMC` y `Ej4Arreglo` | Redacta `docs/DISENO.md` y `docs/EV01_JOOPTIONPANE.md` |
| **2. Paralelo** | `insertarDatosIniciales()` + ejercicios 2, 8, 9, 17, 19 | `LoginVista` + `LoginControlador` + `cerrarSesion()` + ejercicios 3, 4, 11, 14, 16 | `MenuVista` + `PlatoVista` + ejercicios 1, 5, 6, 12, 13 |
| **3. Paralelo** | Ejercicios 20, 25, 27, 28 | Ejercicios 10, 21, 22, 24, 26 | `PlatoControlador` + ejercicios 7, 15, 18, 23, 29 |
| **4. Integración** | Verifica la EV02 (capturas) | Prueba el flujo login → menú → cerrar sesión | Prueba el CRUD completo |
| **5. Cierre** | Checklist + PR final | Checklist + PR final | README + checklist + PR final |

**Dependencias críticas:**

- `LoginControlador` (Jeronimo) necesita `UsuarioDAO.validar()` (Daniel) funcionando.
- `PlatoControlador` (Juan Pablo) necesita `PlatoDAO` (Daniel) funcionando.
- `Guia2App` (Jeronimo) necesita `MenuVista` (Juan Pablo) y `PlatoControlador` (Juan Pablo).
- Los contratos ya existen en el repo: nadie queda bloqueado mientras Daniel termina.

---

## 7. Checklist de entrega

### Guía 1
- [ ] Los 29 ejercicios compilan y se ejecutan desde `guia1.Guia1Main`.
- [ ] Cada uno valida lo que pide el enunciado (rangos, división por cero, etc.).
- [ ] No hay resultados "quemados": los valores salen de la lógica.
- [ ] Cada integrante hizo su bloque en su rama con commits propios.

### Guía 2
- [ ] Driver en `libs/` y visible en *Referenced Libraries*.
- [ ] `mibasededatos.db` se crea y contiene `usuarios` y `platos`.
- [ ] Datos iniciales: `admin/admin123`, `empleado/emp456` y mínimo 3 platos.
- [ ] Login con máximo 3 intentos y mensajes claros.
- [ ] CRUD completo (agregar, ver, actualizar, eliminar con confirmación).
- [ ] Cerrar sesión vuelve al login sin terminar el programa.
- [ ] Los 6 ejercicios de try-catch usan `JOptionPane` y capturan la excepción correcta.
- [ ] `docs/DISENO.md` con diagrama de clases y esquema SQL.
- [ ] `docs/EV01_JOOPTIONPANE.md` con la tabla de equivalencias.
- [ ] `README.md` actualizado.
- [ ] Capturas de la EV02 y del CRUD funcionando.

### Sustentación
- [ ] Demo de 10 minutos ensayada.
- [ ] Cada integrante explica su módulo y responde una pregunta de otro.

---

## 8. Cómo se evalúa

| Evidencia | Criterio de la guía | Dónde se ve en el repo |
|---|---|---|
| **EV01** | Reemplaza `Scanner` por `JOptionPane`; gestiona entrada/salida | `src/guia2/dialogos/*` y `src/guia2/vista/*` |
| **EV02** | Integra el `.jar`, conecta con SQLite y crea el archivo `.db` | `libs/`, `.vscode/settings.json`, `src/ConexionDb/*` |
| **EV03** | Implementa INSERT/SELECT/UPDATE/DELETE y trabaja en equipo | `src/guia2/dao/*` y `src/guia2/controlador/PlatoControlador.java` |
| **EV04** | POO, autenticación y `PreparedStatement` | `src/guia2/modelo/*`, `LoginControlador`, `dao/*` |
| **Guía 1** | Condicionales, ciclos y arreglos | `src/guia1/*` |

**Puntos que más pesan:** que compile y funcione, que use `PreparedStatement`, que valide
las entradas, que el login tenga los 3 intentos y que cada uno sepa explicar su parte.

---

## 9. Errores que cuestan nota

| Error | Consecuencia | Cómo evitarlo |
|---|---|---|
| Comparar `String` con `==` | El login falla aunque las credenciales sean correctas | Usar `.equals()` |
| Concatenar SQL (`"... WHERE id = " + id`) | Inyección SQL, criterio de seguridad en cero | `PreparedStatement` con `?` |
| No validar la división entre cero | `ArithmeticException` y el programa se cae | Validar antes de dividir |
| Cerrar el `Scanner` en un ejercicio | El menú de la Guía 1 deja de leer | No llamar `sc.close()` |
| `int` para el factorial | Resultado negativo desde 13! | Usar `long` |
| Inicializar el mayor en `0` | Falla con arreglos de negativos | Iniciar en `nums[0]` |
| `i <= arreglo.length` | `ArrayIndexOutOfBoundsException` | Usar `<` |
| `catch` vacío | El error pasa desapercibido | Mostrar siempre el mensaje |
| Commitear `mibasededatos.db` | Conflictos de binarios entre los tres | Ya está en `.gitignore` |
| Hacer commit directo a `main` | Se pierde el trabajo de los demás | Rama propia + Pull Request |
