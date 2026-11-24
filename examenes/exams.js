window.EXAMS = [
  {
    id: "daniel-logica",
    member: "Daniel Ochoa Taborda",
    memberKey: "daniel",
    examNumber: 1,
    title: "Lógica y control de flujo",
    focus: "Condicionales, operadores, ciclos y los ejercicios asignados de la Guía 1.",
    questions: [
      {
        prompt: "En el Ej02, ¿qué resultado produce -4 % 2 == 0?",
        options: ["Verdadero: -4 es par", "Falso: los negativos no pueden ser pares", "Produce una excepción", "El resultado depende de JOptionPane"],
        answer: 0,
        explanation: "El residuo de -4 dividido entre 2 es 0. La condición identifica correctamente los pares negativos y también funciona con 0."
      },
      {
        prompt: "En el Ej08, una compra cuesta exactamente 200000. ¿Qué descuento aplica?",
        options: ["20 %", "15 %", "10 %", "Ninguno"],
        answer: 2,
        explanation: "Las comparaciones usan >. 200000 no es mayor que 200000, pero sí es mayor que 100000; por eso aplica 10 %."
      },
      {
        prompt: "¿Por qué el Ej09 compara el usuario con .equals(\"admin\")?",
        options: ["Porque equals convierte cualquier texto a minúsculas", "Porque compara el contenido de los String", "Porque == no compila con String", "Porque equals evita pedir la contraseña"],
        answer: 1,
        explanation: "equals compara el contenido. == compararía si ambos objetos son la misma referencia."
      },
      {
        prompt: "El Ej17 recorre i desde 1 hasta 10 e imprime 7 * i. ¿Cuántas líneas genera?",
        options: ["7", "9", "10", "11"],
        answer: 2,
        explanation: "Los dos límites se incluyen: 1, 2, ..., 10. Por lo tanto genera diez productos."
      },
      {
        prompt: "¿Qué calcula el contador del Ej19?",
        options: ["Cuántos múltiplos de 10 hay entre 1 y 200: 20", "La suma de todos los múltiplos: 2100", "El número 200 dividido entre 10", "Cuántos números impares existen"],
        answer: 0,
        explanation: "contador++ aumenta una unidad por cada coincidencia. No acumula el valor de los múltiplos."
      },
      {
        prompt: "¿Qué condición representa correctamente el Ej20?",
        options: ["i % 3 == 0 || i % 5 == 0", "i % 3 == 0 && i % 5 == 0", "i / 3 == 0 && i / 5 == 0", "i % 3 == 5"],
        answer: 1,
        explanation: "&& exige que las dos divisibilidades sean ciertas. Del 1 al 100 se muestran 15, 30, 45, 60, 75 y 90."
      },
      {
        prompt: "Una entrada numérica incorrecta se procesa en Guia1Dialogos. ¿Qué hace pedirEntero?",
        options: ["Devuelve 0 y continúa", "Cierra toda la aplicación", "Muestra un error y vuelve a pedir el entero", "Guarda el texto en la base de datos"],
        answer: 2,
        explanation: "El while vuelve a mostrar el diálogo cuando Integer.valueOf produce NumberFormatException. Cancelar es distinto: devuelve null."
      },
      {
        prompt: "¿Qué ocurre si cancelas la entrada del Ej02?",
        options: ["El helper devuelve null y el ejercicio retorna antes de calcular", "Se interpreta como cero", "Se vuelve a preguntar para siempre", "Se muestra que el número es impar"],
        answer: 0,
        explanation: "El ejercicio comprueba numero == null antes de usarlo y retorna. El selector puede continuar sin intentar convertir null."
      }
    ]
  },
  {
    id: "daniel-arreglos-gui",
    member: "Daniel Ochoa Taborda",
    memberKey: "daniel",
    examNumber: 2,
    title: "Arreglos y lectura de código",
    focus: "Mínimos, ciclos anidados, cubos y patrones de la interfaz gráfica nueva.",
    questions: [
      {
        prompt: "En el Ej25, ¿por qué se inicializa menor con nums[0]?",
        options: ["Para que el primer elemento participe como candidato real", "Porque los arreglos empiezan en 1", "Para que el resultado siempre sea cero", "Porque nums[0] es la longitud del arreglo"],
        answer: 0,
        explanation: "nums[0] es el primer valor válido. Inicializar con cero puede dar un mínimo incorrecto si todos los valores fueran positivos o negativos, según el caso."
      },
      {
        prompt: "Después de inicializar menor = nums[0], ¿desde qué índice conviene recorrer?",
        options: ["Desde -1", "Desde 0 obligatoriamente", "Desde 1", "Desde nums.length"],
        answer: 2,
        explanation: "El índice 0 ya se usó como valor inicial; se comparan los elementos restantes desde el índice 1."
      },
      {
        prompt: "El Ej27 usa dos ciclos que recorren 0 a 5. ¿Cuántos asteriscos imprime?",
        options: ["12", "30", "36", "42"],
        answer: 2,
        explanation: "Hay seis filas y seis columnas: 6 × 6 = 36 asteriscos."
      },
      {
        prompt: "¿Cuál es la forma correcta de calcular el cubo de 5 en Java?",
        options: ["5 ^ 3", "5 * 5 * 5", "5 % 3", "Math.sqrt(5)"],
        answer: 1,
        explanation: "En Java, ^ es XOR, no potencia. El ejercicio usa multiplicación explícita: n * n * n."
      },
      {
        prompt: "¿Para qué se usa StringBuilder en ejercicios como el Ej27?",
        options: ["Para construir texto agregando partes y saltos de línea", "Para convertir texto a SQL", "Para abrir JOptionPane", "Para sustituir el arreglo"],
        answer: 0,
        explanation: "append agrega contenido al texto. El resultado terminado se convierte a String con toString() antes de mostrarlo."
      },
      {
        prompt: "¿Qué hace la expresión texto.trim().replace(',', '.') antes de parsear un decimal?",
        options: ["Elimina todos los números", "Admite coma decimal y quita espacios de los extremos", "Redondea al entero más cercano", "Cambia puntos por comas"],
        answer: 1,
        explanation: "trim elimina espacios iniciales/finales; replace convierte coma decimal a punto para Double.parseDouble."
      },
      {
        prompt: "¿Por qué pedirDecimal comprueba Double.isFinite(valor)?",
        options: ["Para rechazar NaN e infinito aunque parseDouble los acepte", "Para convertir double en int", "Para permitir valores nulos", "Para limitar el valor a dos decimales"],
        answer: 0,
        explanation: "NaN e Infinity son double válidos para Java, pero no son cantidades finitas útiles para estos ejercicios."
      },
      {
        prompt: "En Guia1Main, ¿qué significa Ej25::ejecutar dentro de Runnable[]?",
        options: ["Invoca ejecutar durante la inicialización", "Guarda una referencia al método para ejecutarla después con run()", "Crea un hilo automáticamente", "Convierte el método en una clase abstracta"],
        answer: 1,
        explanation: "Es una referencia a método compatible con Runnable. EJERCICIOS[i].run() invoca la acción cuando se escoge."
      }
    ]
  },
  {
    id: "daniel-persistencia",
    member: "Daniel Ochoa Taborda",
    memberKey: "daniel",
    examNumber: 3,
    title: "SQLite, JDBC y DAO",
    focus: "Conexión, tablas, consultas parametrizadas, modelos y operaciones CRUD.",
    questions: [
      {
        prompt: "¿Qué significa jdbc:sqlite:mibasededatos.db en ConexionDB?",
        options: ["Conecta a un servidor PostgreSQL", "Abre SQLite usando un archivo relativo al directorio de ejecución", "Crea una tabla Java", "Es la contraseña del usuario admin"],
        answer: 1,
        explanation: "El driver SQLite abre el archivo mibasededatos.db. Al usar una ruta relativa, su ubicación depende del directorio desde donde se ejecuta Java."
      },
      {
        prompt: "¿Qué aporta CREATE TABLE IF NOT EXISTS en InicializarDB?",
        options: ["Evita un error si la tabla ya fue creada", "Borra los datos antes de crearla", "Inserta automáticamente usuarios", "Cifra las columnas"],
        answer: 0,
        explanation: "Permite ejecutar la inicialización repetidamente sin intentar recrear una tabla existente."
      },
      {
        prompt: "¿Cuál es la forma correcta de enviar un username a un PreparedStatement?",
        options: ["Concatenarlo en la cadena SQL", "Usar WHERE username = ? y ps.setString(1, username)", "Poner el nombre entre comillas en el SQL", "Usar System.out.println"],
        answer: 1,
        explanation: "Los parámetros se enlazan con setString, setInt u otros setters. No se concatenan como parte de la instrucción SQL."
      },
      {
        prompt: "¿Por qué los DAO usan try-with-resources?",
        options: ["Para cerrar automáticamente Connection, PreparedStatement y ResultSet", "Para repetir el SQL tres veces", "Para evitar declarar métodos", "Para mostrar ventanas Swing"],
        answer: 0,
        explanation: "Los recursos se cierran al salir del bloque, incluso si ocurre una excepción."
      },
      {
        prompt: "En validar(), ¿qué indica rs.next()?",
        options: ["Que existe una fila que cumple usuario y contraseña", "Que se cerró la base", "Que se insertó un plato", "Que el usuario debe reintentar siempre"],
        answer: 0,
        explanation: "La consulta SELECT 1 devuelve una fila si encuentra credenciales coincidentes; rs.next() informa si existe esa fila."
      },
      {
        prompt: "¿Cómo evita insertarSiNoExiste duplicar los datos iniciales?",
        options: ["Consulta primero si el usuario o plato existe y solo entonces inserta", "Borra las tablas cada vez", "Cambia el id a cero", "Usa un ciclo infinito"],
        answer: 0,
        explanation: "La inserción idempotente permite iniciar la aplicación varias veces sin volver a añadir los mismos datos de prueba."
      },
      {
        prompt: "¿Qué informa executeUpdate() > 0 en actualizar() o eliminar()?",
        options: ["Que al menos una fila fue modificada", "Que se encontraron cero resultados", "Que la conexión es null", "Que el SQL se convirtió en Java"],
        answer: 0,
        explanation: "executeUpdate devuelve la cantidad de filas afectadas; comparar con cero produce un booleano de éxito."
      },
      {
        prompt: "ConexionDB puede devolver null si falla. ¿Qué deben hacer los DAO antes de llamar conn.prepareStatement(...)?",
        options: ["Comprobar conn == null y manejar explícitamente el error", "Usar conn aunque sea null", "Capturar solo NumberFormatException", "Crear una conexión nueva con System.in"],
        answer: 0,
        explanation: "Un recurso null no produce SQLException al desreferenciarlo: produciría NullPointerException. Hay que validar la conexión antes de usarla."
      }
    ]
  },
  {
    id: "jeronimo-condicionales",
    member: "Jeronimo Henao",
    memberKey: "jeronimo",
    examNumber: 1,
    title: "Condicionales y ciclos",
    focus: "Validaciones, calculadora, IMC y ciclos asignados en la Guía 1.",
    questions: [
      {
        prompt: "En el Ej03, ¿qué resultado corresponde a edad -1?",
        options: ["Puede ingresar", "Acceso denegado", "Edad inválida", "Se calcula el IMC"],
        answer: 2,
        explanation: "La condición edad < 0 se valida primero para separar una edad inválida de una edad válida menor de 18."
      },
      {
        prompt: "¿Cuál es el resultado correcto para una edad de exactamente 18?",
        options: ["Acceso denegado", "Puede ingresar", "Edad inválida", "No se puede decidir"],
        answer: 1,
        explanation: "La condición de acceso es edad >= 18, así que el límite 18 está incluido."
      },
      {
        prompt: "En la calculadora, ¿qué debe ocurrir con 8 / 0?",
        options: ["Mostrar error antes de dividir", "Devolver cero", "Cambiar el divisor a 1", "Ignorar el operador"],
        answer: 0,
        explanation: "Se comprueba numero2 == 0 antes de efectuar la división."
      },
      {
        prompt: "¿Qué camino del switch maneja un operador como % en el Ej04?",
        options: ["El caso /", "El caso *", "default", "No hay camino: Java cierra la ventana"],
        answer: 2,
        explanation: "El operador no coincide con +, -, * ni /, por lo que entra en default y se informa que no es válido."
      },
      {
        prompt: "¿Qué responde la regla de año bisiesto para 1900?",
        options: ["Bisiesto, porque es divisible entre 4", "No bisiesto, porque es divisible entre 100 pero no entre 400", "Bisiesto, porque es divisible entre 100", "Depende del sistema operativo"],
        answer: 1,
        explanation: "Los años de siglo no son bisiestos salvo que también sean divisibles entre 400. Por eso 1900 no lo es y 2000 sí."
      },
      {
        prompt: "Con peso 70 kg y altura 1.75 m, ¿qué clasificación de IMC corresponde aproximadamente?",
        options: ["Bajo peso", "Normal", "Sobrepeso", "Obesidad"],
        answer: 1,
        explanation: "70 / (1.75 × 1.75) ≈ 22.86, que es menor que 25 y no menor que 18.5: clasificación normal."
      },
      {
        prompt: "El Ej14 comienza en 1 y aumenta de 2 en 2 mientras numero <= 100. ¿Cuál es el último impar mostrado?",
        options: ["98", "99", "100", "101"],
        answer: 1,
        explanation: "La secuencia es 1, 3, 5, ... 99. Después de 99 se suma 2 y queda 101, que ya no satisface la condición."
      },
      {
        prompt: "¿Qué valor debe mostrar la suma de impares del 1 al 50?",
        options: ["625", "1275", "5050", "2500"],
        answer: 0,
        explanation: "Los impares entre 1 y 50 suman 1 + 3 + ... + 49 = 625."
      }
    ]
  },
  {
    id: "jeronimo-arreglos",
    member: "Jeronimo Henao",
    memberKey: "jeronimo",
    examNumber: 2,
    title: "Arreglos, factorial y GUI",
    focus: "Índices, acumuladores, ocurrencias y lectura de resultados gráficos.",
    questions: [
      {
        prompt: "¿Cuál es el valor de 10! en el Ej21?",
        options: ["3628800", "100", "10000000", "120"],
        answer: 0,
        explanation: "10! es 10 × 9 × 8 × ... × 1 = 3628800."
      },
      {
        prompt: "¿Por qué el Ej21 guarda el factorial en long?",
        options: ["Porque el factorial crece y un int se desborda pronto", "Porque long representa texto", "Porque los ciclos solo aceptan long", "Para que JOptionPane entienda el resultado"],
        answer: 0,
        explanation: "Los factoriales crecen rápidamente. Un int no puede representar resultados grandes como 13!."
      },
      {
        prompt: "En el arreglo del Ej24, ¿por qué se inicializa mayor con nums[0]?",
        options: ["Para usar un valor real del arreglo como candidato inicial", "Porque nums[0] siempre contiene 20", "Para saltar todos los demás elementos", "Porque el índice cero es el último"],
        answer: 0,
        explanation: "El máximo debe compararse con datos reales. Con el arreglo dado, el resultado final es 20."
      },
      {
        prompt: "¿Qué imprime el Ej26 si el arreglo contiene un solo 7?",
        options: ["7 aparece 0 veces", "7 aparece 1 vez", "7 aparece 7 veces", "El programa elimina el 7"],
        answer: 1,
        explanation: "El contador empieza en cero y aumenta una vez por cada elemento igual a buscado."
      },
      {
        prompt: "¿Por qué se usa i < nums.length y no i <= nums.length?",
        options: ["Porque el último índice válido es nums.length - 1", "Porque length cuenta desde -1", "Para no procesar el primer elemento", "Porque <= no compila"],
        answer: 0,
        explanation: "Con <= se intentaría acceder a nums[nums.length], que está fuera del arreglo."
      },
      {
        prompt: "¿Qué números debe mostrar el Ej13?",
        options: ["1, 3, 5, ..., 99", "2, 4, 6, ..., 100", "0, 2, 4, ..., 98", "Todos del 1 al 100"],
        answer: 1,
        explanation: "El ciclo examina del 1 al 100 y solo agrega los números cuyo residuo al dividir por 2 es cero."
      },
      {
        prompt: "En las tablas del Ej18, ¿cuántas multiplicaciones se generan en total?",
        options: ["10", "20", "100", "110"],
        answer: 2,
        explanation: "El ciclo externo produce diez tablas y el interno diez productos por tabla: 10 × 10 = 100."
      },
      {
        prompt: "En la nueva Guía 1, ¿qué muestra el helper para resultados extensos?",
        options: ["Un JTextArea dentro de JScrollPane", "System.out.println", "Un Scanner", "Una tabla SQLite"],
        answer: 0,
        explanation: "JTextArea contiene varias líneas y JScrollPane permite desplazarse cuando el resultado no cabe en la ventana."
      }
    ]
  },
  {
    id: "jeronimo-login",
    member: "Jeronimo Henao",
    memberKey: "jeronimo",
    examNumber: 3,
    title: "Login, sesión y excepciones",
    focus: "Flujo de autenticación, permisos de menú y ejercicios de excepciones.",
    questions: [
      {
        prompt: "¿Cuántos intentos permite LoginControlador?",
        options: ["1", "2", "3", "Ilimitados"],
        answer: 2,
        explanation: "MAX_INTENTOS vale 3; después de agotarlos se muestra el aviso de bloqueo y el login falla."
      },
      {
        prompt: "¿Qué debe pasar si se cancela el diálogo de usuario o contraseña?",
        options: ["El controlador recibe null y termina el intento sin validar", "null se convierte en admin", "Se crea un usuario nuevo", "Se repite el diálogo infinitamente"],
        answer: 0,
        explanation: "showInputDialog devuelve null al cancelar; LoginControlador devuelve false sin llamar a validar con una credencial inexistente."
      },
      {
        prompt: "¿Qué componente comprueba las credenciales contra SQLite?",
        options: ["MenuVista", "UsuarioDAO.validar", "PlatoVista", "Guia1Main"],
        answer: 1,
        explanation: "LoginControlador coordina el flujo y delega la consulta de credenciales a UsuarioDAO."
      },
      {
        prompt: "¿Cuándo se asigna usuarioActual?",
        options: ["Antes de pedir el nombre", "Solo después de que UsuarioDAO.validar devuelve true", "Cuando se cancela", "Al cerrar sesión"],
        answer: 1,
        explanation: "El nombre de sesión se conserva únicamente tras una autenticación correcta."
      },
      {
        prompt: "¿Qué hace cerrarSesion()?",
        options: ["Elimina la tabla usuarios", "Pone usuarioActual en null", "Cierra el sistema siempre", "Cambia la contraseña"],
        answer: 1,
        explanation: "La sesión se limpia y Guia2App puede volver a solicitar un login."
      },
      {
        prompt: "Al seleccionar \"Cerrar sesión\", ¿qué opción interna devuelve MenuVista?",
        options: ["1", "3", "5", "0"],
        answer: 2,
        explanation: "MenuVista traduce el botón Cerrar sesión a la opción 5; Guia2App sale del ciclo interno y vuelve al login."
      },
      {
        prompt: "En el Ej3IMC, ¿qué excepción se lanza si la altura es cero?",
        options: ["NumberFormatException", "ArithmeticException", "ArrayIndexOutOfBoundsException", "SQLException"],
        answer: 1,
        explanation: "El ejercicio lanza explícitamente ArithmeticException para mostrar un error de operación aritmética."
      },
      {
        prompt: "En el Ej4Arreglo, ¿qué excepción identifica un índice como 8 para un arreglo de cinco nombres?",
        options: ["NullPointerException", "ArithmeticException", "ArrayIndexOutOfBoundsException", "ClassCastException"],
        answer: 2,
        explanation: "Los índices válidos son 0 a 4; intentar leer el índice 8 queda fuera de los límites del arreglo."
      }
    ]
  },
  {
    id: "juan-condicionales",
    member: "Juan Pablo Arismendy",
    memberKey: "juan",
    examNumber: 1,
    title: "Condicionales y ciclos básicos",
    focus: "Validaciones, reglas booleanas, clasificación y acumuladores.",
    questions: [
      {
        prompt: "¿Qué muestra el Ej01 para el valor 0?",
        options: ["Positivo", "Negativo", "Cero", "Entrada inválida"],
        answer: 2,
        explanation: "Si n no es mayor que cero ni menor que cero, se ejecuta el else y se clasifica como cero."
      },
      {
        prompt: "¿Cuál es la respuesta correcta de la regla bisiesta para 2000?",
        options: ["No es bisiesto porque es divisible entre 100", "Sí es bisiesto porque es divisible entre 400", "No es bisiesto porque termina en cero", "Solo depende de que sea divisible entre 4"],
        answer: 1,
        explanation: "Los años divisibles entre 400 son bisiestos aunque también sean divisibles entre 100."
      },
      {
        prompt: "¿Cómo clasifica el Ej06 una nota de 89?",
        options: ["Excelente", "Bueno", "Aceptable", "Insuficiente"],
        answer: 1,
        explanation: "89 no llega a 90, pero sí es >= 80; por tanto se clasifica como Bueno."
      },
      {
        prompt: "Con los valores 7, 7 y 5 en el Ej07, ¿qué debe indicar el resultado?",
        options: ["No hay empate", "Empate entre dos números", "Empate entre los tres", "El mayor es 5"],
        answer: 1,
        explanation: "El máximo es 7 y dos entradas coinciden con ese máximo."
      },
      {
        prompt: "¿Qué condición permite contar hacia atrás del 50 al 1?",
        options: ["i <= 1 con i++", "i >= 1 con i--", "i < 50 con i--", "i != 0 con i++"],
        answer: 1,
        explanation: "Se inicia en 50, se continúa mientras i sea al menos 1 y se resta uno en cada iteración."
      },
      {
        prompt: "¿Qué debe hacer el Ej06 antes de clasificar una nota?",
        options: ["Validar que esté entre 0 y 100", "Calcular un factorial", "Convertir la nota en String", "Abrir SQLite"],
        answer: 0,
        explanation: "Los valores menores que 0 o mayores que 100 son inválidos y no deben llegar a las categorías."
      },
      {
        prompt: "¿Cuál es la suma del 1 al 100 del Ej15?",
        options: ["100", "5050", "5000", "10100"],
        answer: 1,
        explanation: "El acumulador suma cada i desde 1 hasta 100; el total es 5050."
      },
      {
        prompt: "¿Cuántos pares hay del 1 al 100, incluidos ambos extremos?",
        options: ["49", "50", "51", "100"],
        answer: 1,
        explanation: "Son 2, 4, ..., 100: cincuenta números pares."
      }
    ]
  },
  {
    id: "juan-ciclos-arreglos",
    member: "Juan Pablo Arismendy",
    memberKey: "juan",
    examNumber: 2,
    title: "Ciclos, arreglos y excepciones",
    focus: "Ciclos anidados, suma de arreglos, cadenas y casos de cancelación.",
    questions: [
      {
        prompt: "¿Cuántos productos imprime el Ej18 si muestra diez tablas con diez productos cada una?",
        options: ["10", "50", "100", "200"],
        answer: 2,
        explanation: "El ciclo externo se ejecuta diez veces y el interno diez veces por cada tabla."
      },
      {
        prompt: "¿Cuál es la suma del arreglo usado en el Ej23?",
        options: ["74", "84", "94", "104"],
        answer: 1,
        explanation: "5 + 12 + 7 + 3 + 20 + 8 + 15 + 1 + 9 + 4 = 84."
      },
      {
        prompt: "¿Qué hace texto.charAt(i) en el Ej29?",
        options: ["Devuelve el carácter que está en la posición i", "Devuelve el número de palabras", "Cambia la palabra a mayúsculas", "Borra el carácter i"],
        answer: 0,
        explanation: "El ciclo recorre desde 0 hasta texto.length() - 1 y obtiene un carácter por posición."
      },
      {
        prompt: "¿Qué sucede hoy si se pulsa Cancelar en el Ej5Bucle?",
        options: ["El ejercicio detecta null y sale correctamente", "parseInt(null) produce NumberFormatException, se muestra error y vuelve a pedir", "Se acepta el número cero", "Se cierra la base de datos"],
        answer: 1,
        explanation: "El texto cancelado es null; el parseo falla y el catch reintenta. Para que cancelar salga, debe comprobarse texto == null antes del parseo."
      },
      {
        prompt: "En el Ej5Bucle, ¿por qué se lanza IllegalArgumentException para valores fuera de 1 a 100?",
        options: ["Para separar un entero parseable pero fuera del rango permitido", "Para indicar que el texto no es entero", "Para terminar la aplicación", "Para consultar la base de datos"],
        answer: 0,
        explanation: "NumberFormatException trata texto no entero; IllegalArgumentException se usa para la regla de rango."
      },
      {
        prompt: "¿Qué ocurre en el Ej6Null si se cancela el diálogo con el código actual?",
        options: ["El guard clause detecta null antes de toUpperCase y retorna", "La aplicación siempre cae en el catch", "Se convierte null en texto vacío", "Se crea un usuario"],
        answer: 0,
        explanation: "La validación nombre == null || nombre.isBlank() retorna antes del try, así que el catch de NullPointerException no se ejecuta en esa ruta."
      },
      {
        prompt: "¿Qué ventaja tiene comprobar nombre == null antes de llamar a nombre.toUpperCase()?",
        options: ["Evita llamar un método sobre una referencia null", "Convierte el texto a mayúsculas", "Valida una consulta SQL", "Evita usar String"],
        answer: 0,
        explanation: "Una referencia null no apunta a un objeto; invocar un método sobre ella provocaría NullPointerException."
      },
      {
        prompt: "¿Qué rol cumple Guia1Dialogos en los ejercicios gráficos?",
        options: ["Centraliza entrada, validación y mensajes", "Se conecta a SQLite", "Es el menú de CRUD de platos", "Reemplaza todos los ciclos"],
        answer: 0,
        explanation: "El helper evita repetir código de JOptionPane y maneja entradas inválidas y cancelaciones."
      }
    ]
  },
  {
    id: "juan-crud",
    member: "Juan Pablo Arismendy",
    memberKey: "juan",
    examNumber: 3,
    title: "Interfaz, controladores y CRUD",
    focus: "Flujo vista-controlador-DAO, validación y decisiones de interfaz.",
    questions: [
      {
        prompt: "¿Cuál es el orden típico al agregar un plato?",
        options: ["DAO pide datos, modelo muestra mensaje, vista ejecuta SQL", "Vista recoge datos, controlador valida y llama al DAO", "Modelo abre el menú y borra la tabla", "Main crea SQL directamente desde JOptionPane"],
        answer: 1,
        explanation: "La vista recoge datos, el controlador coordina y valida, y el DAO realiza el acceso a la base."
      },
      {
        prompt: "¿Qué debe hacer PlatoVista si el usuario cancela la captura de un plato?",
        options: ["Devolver null para que el controlador no continúe", "Crear un plato con precio cero", "Insertar inmediatamente", "Lanzar un ciclo infinito"],
        answer: 0,
        explanation: "La vista devuelve null y el controlador comprueba ese resultado antes de validar o guardar."
      },
      {
        prompt: "¿Dónde debe comprobarse que el precio de un alta sea positivo?",
        options: ["En la coordinación del controlador (y también proteger reglas del modelo/DAO según diseño)", "Solo en el título de la ventana", "En el nombre del archivo SQLite", "En el método main de cada ejercicio de ciclos"],
        answer: 0,
        explanation: "PlatoControlador valida que precio > 0 antes de insertar; el modelo también valida que el precio no sea negativo."
      },
      {
        prompt: "¿Qué representa la posición 5 del diálogo de MenuVista?",
        options: ["Agregar plato", "Cerrar sesión, opción interna 5", "Salir, opción interna 4", "Actualizar"],
        answer: 1,
        explanation: "MenuVista traduce la posición visual 4 (quinta opción) a la opción interna 5 para volver al login."
      },
      {
        prompt: "¿Qué hace la vista antes de eliminar un plato?",
        options: ["Solicita confirmación al usuario", "Vacía toda la tabla", "Cambia el ID", "Cierra sesión obligatoriamente"],
        answer: 0,
        explanation: "PlatoControlador pide confirmación; solo si el usuario acepta llama a dao.eliminar(id)."
      },
      {
        prompt: "¿Por qué buscarPorId se ejecuta antes de actualizar o eliminar?",
        options: ["Para verificar que exista y obtener el plato asociado al ID", "Para reiniciar el contador del menú", "Para calcular el IMC", "Para convertir la conexión en texto"],
        answer: 0,
        explanation: "Si no hay plato con ese ID, se informa y se evita actualizar o borrar una fila inexistente."
      },
      {
        prompt: "¿Qué significa que dao.actualizar(plato) devuelva false?",
        options: ["No se modificó ninguna fila o la operación reportó un error", "El usuario cerró sesión", "Siempre significa que el plato fue eliminado", "Que la vista no abrió"],
        answer: 0,
        explanation: "La implementación devuelve executeUpdate() > 0; false significa cero filas afectadas o un error capturado."
      },
      {
        prompt: "¿Qué riesgo existe en el alta actual si PlatoDAO.insertar captura SQLException y retorna void?",
        options: ["El controlador puede mostrar éxito aunque el INSERT haya fallado", "El menú no puede llamar a la vista", "La aplicación nunca compila", "El precio se convierte en ID"],
        answer: 0,
        explanation: "El DAO no comunica el resultado y PlatoControlador muestra éxito después de llamar insertar. El contrato debería informar el fallo."
      }
    ]
  }
];
