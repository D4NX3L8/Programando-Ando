# Programando Ando

Proyecto de las guías de Java del programa **Análisis y Desarrollo de Software** (SENA).

| | |
|---|---|
| **Proyecto** | Construcción de software con persistencia local |
| **Competencia** | Desarrollar aplicaciones de escritorio con interfaces interactivas y manejo de bases de datos relacionales |
| **Instructor** | Mateo Arroyave Quintero |
| **Equipo** | Daniel Ochoa Taborda · Jeronimo Henao · Juan Pablo Arismendy |

## Contenido

- **Guía 1 — Lógica en Java (12 h):** 29 ejercicios de condicionales, ciclos y arreglos.
- **Guía 2 — Persistencia (20 h):** JOptionPane, `try-catch`, JDBC + SQLite y un CRUD completo
  con login para un restaurante.

La división exacta del trabajo por integrante está en **[DIVISION_TRABAJO.md](DIVISION_TRABAJO.md)**.

## Requisitos

| Herramienta | Versión | Verificar con |
|---|---|---|
| JDK | 21 LTS | `java -version` / `javac -version` |
| VS Code | última | `code --version` |
| Extension Pack for Java | última | panel *Extensions* |
| Driver SQLite JDBC | 3.53.2.0 | ya incluido en `libs/` |

## Estructura

```
Programando-Ando/
├── libs/                     Driver sqlite-jdbc (no se descarga: ya está)
├── docs/
│   ├── GUIA_JAVA_1.docx      Guía original 1
│   ├── GUIA_JAVA_2.docx      Guía original 2
│   ├── DISENO.md             Diseño del sistema (Fase 1)
│   └── EV01_JOOPTIONPANE.md  Evidencia de migración a JOptionPane
├── scripts/
│   ├── compilar.sh           Compila todo a out/
│   └── ejecutar.sh           Ejecuta el menú principal
├── src/
│   ├── Main.java             Menú general (elige Guía 1 o Guía 2)
│   ├── ConexionDb/           Conexión JDBC y creación de tablas
│   ├── guia1/                Ejercicios 01-29 + menú de la Guía 1
│   └── guia2/                Sistema del restaurante (JOptionPane + SQLite)
│       ├── dialogos/         Ejercicios de try-catch
│       ├── modelo/           Usuario y Plato (POO)
│       ├── dao/              Acceso a datos con PreparedStatement
│       ├── vista/            Ventanas JOptionPane
│       └── controlador/      Lógica de login y CRUD
└── .vscode/                  Configuración del proyecto Java
```

## Cómo compilar y ejecutar

Desde la raíz del proyecto:

```bash
bash scripts/compilar.sh     # compila todo en out/
bash scripts/ejecutar.sh     # abre el menú principal
```

En VS Code también funciona el botón ▶ *Run* sobre cualquier clase con `main`.

Ejercicio individual por consola:

```bash
javac -d out -cp "libs/*" src/guia1/condicionales/Ej01.java
java -cp out guia1.condicionales.Ej01
```

Sistema del restaurante (requiere entorno gráfico para los `JOptionPane`):

```bash
java -cp "out:libs/*" guia2.Guia2App
```

## Base de datos

La Guía 2 usa **SQLite**. El archivo `mibasededatos.db` se crea solo en la raíz la primera
vez que se ejecuta el sistema:

```
usuarios(id, username, password)
platos(id, nombre, categoria, precio, disponible)
```

El `.db` **no se sube al repositorio** (está en `.gitignore`) porque se regenera en cada
equipo. Para la entrega se adjunta el archivo generado con los datos de prueba.

## Flujo de trabajo en Git

- `main` es la rama estable: **nadie hace commit directo ahí**.
- Cada integrante trabaja en su rama (`daniel`, `jeronimo`, `juanpablo`) y abre un Pull Request.
- Antes de empezar a trabajar: `git pull origin main`.

```bash
git checkout main
git pull origin main
git checkout -b mi-rama
# ... trabajar ...
git add .
git commit -m "feat(guia1): ejercicios 1-10"
git push -u origin mi-rama
```
