# Fundamentos de Java para Principiantes

## Resumen del Curso
Este curso de 1 hora introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo programación orientada a objetos (POO). Avanzaremos paso a paso: desde tu primer "Hola mundo" hasta construir un pequeño programa con clases y objetos. **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total**: ~60 minutos (10 lecciones cortas)
**Público Objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación
**Prerrequisitos**: Ninguno
**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge)
**Editores en línea usados**: [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), [JDoodle](https://www.jdoodle.com/online-java-compiler) y [Replit](https://replit.com) (100 % en línea y gratuitos)

**📁 Repositorio de Código Fuente**: [https://github.com/1ASI0729-7793-ParkShare/java-fundamentals-course-ParkShare.git](https://github.com/1ASI0729-7793-ParkShare/java-fundamentals-course-ParkShare.git)


## Secuencia de la Lección

### Lección 1: ¿Qué es Java y la Programación? (5 minutos)
- **Descripción**: Aprende qué es la programación, qué es un programa y por qué Java es un excelente lenguaje para empezar. Escribe tu primer programa en el navegador.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=LINK-LECCION-1)
- **Conclusiones clave**: Un programa es una lista de instrucciones para la computadora; Java se usa en aplicaciones, juegos y servidores; `System.out.println("Hola mundo");` muestra texto en pantalla.
- **Empieza a programar**: [Abrir OnlineGDB - Hola mundo](https://onlinegdb.com/LINK-PRACTICA-1) 👈 **¡No necesitas registrarte!**

### Lección 2: Variables y tipos de datos (6 minutos)
- **Descripción**: Aprende a guardar datos en variables y conoce los tipos básicos. Crea tu "tarjeta de presentación" en consola, como si fuera tu página web personal.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=LINK-LECCION-2)
- **Conclusiones clave**: `int edad = 15;`, `double nota = 17.5;`, `boolean esEstudiante = true;`, `String nombre = "Ana";`; una variable es como una caja con nombre.
- **Práctica**: [Clic para programar](https://onlinegdb.com/LINK-PRACTICA-2) 👈 **¡No es necesario registrarse!**

### Lección 3: Operadores y expresiones (5 minutos)
- **Descripción**: Haz cálculos y comparaciones: suma, resta, multiplicación, división, módulo y operadores lógicos. Calcula el promedio de tus notas.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=LINK-LECCION-3)
- **Conclusiones clave**: `+ - * / %`; `==`, `!=`, `>`, `<`; `&&`, `||`; cuidado: `7 / 2` da `3` con `int`.
- **Práctica**: [Clic para programar](https://www.jdoodle.com/LINK-PRACTICA-3) 👈 **¡Inicio inmediato!**

### Lección 4: Estructuras de control: Decisiones y bucles (8 minutos)
- **Descripción**: Toma decisiones con `if-else` y repite tareas con `for` y `while`. Programa un mensaje según tu nota y una tabla de multiplicar.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=LINK-LECCION-4)
- **Conclusiones clave**: `if (nota >= 11) { ... } else { ... }`; `for (int i = 1; i <= 10; i++) { ... }`; `while (condicion) { ... }`.
- **Práctica**: [Clic para programar](https://www.jdoodle.com/LINK-PRACTICA-4) 👈 **¡Inicio inmediato!**

### Lección 5: Métodos, parámetros y Entrada/Salida (7 minutos)
- **Descripción**: Crea código reutilizable con métodos que reciben parámetros y devuelven resultados. Lee datos del usuario con `Scanner`.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=LINK-LECCION-5)
- **Conclusiones clave**: `public static void saludar(String nombre) { ... }`; `return` devuelve un valor; `Scanner sc = new Scanner(System.in); String nombre = sc.nextLine();`.
- **Práctica**: [Haz clic para practicar](https://onlinegdb.com/LINK-PRACTICA-5) 👈 **¡No necesitas registrarte!**

### Lección 6: Introducción a la POO: Clases, objetos y constructores (7 minutos)
- **Descripción**: Descubre la programación orientada a objetos. Una clase es un molde y los objetos son las cosas creadas con ese molde. Crea tu clase `Mascota`.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=LINK-LECCION-6)
- **Conclusiones clave**: `class Mascota { String nombre; int edad; }`; el constructor da valores iniciales; `Mascota m = new Mascota("Toby", 3);` crea un objeto; los métodos son lo que el objeto sabe hacer.
- **Práctica**: [Haz clic para practicar](https://onlinegdb.com/LINK-PRACTICA-6) 👈 **¡No necesitas registrarte!**

### Lección 7: Encapsulación con getters y setters (5 minutos)
- **Descripción**: Protege los datos de tus objetos con `private` y accede a ellos de forma segura con getters y setters.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=LINK-LECCION-7)
- **Conclusiones clave**: `private int edad;`; `public int getEdad() { return edad; }`; un setter puede validar: no permitir edades negativas.
- **Práctica**: [Clic para programar](https://replit.com/LINK-PRACTICA-7) 👈 **¡Guarda tu progreso!**

### Lección 8: Arrays y cadenas con objetos (5 minutos)
- **Descripción**: Guarda varios datos en un array, recórrelo con un bucle y trabaja con cadenas (`String`). Combínalos con objetos para manejar una lista de mascotas.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=LINK-LECCION-8)
- **Conclusiones clave**: `int[] notas = {15, 18, 12};`; `notas.length`; `Mascota[] mascotas = new Mascota[3];`; `texto.length()`, `texto.toUpperCase()`, `texto.equals(otro)`.
- **Práctica**: [Clic para programar](https://onlinegdb.com/LINK-PRACTICA-8) 👈 **¡No es necesario registrarse!**

### Lección 9: Proyecto final: Registro de Estudiantes con POO (7 minutos)
- **Descripción**: Junta todo lo aprendido y construye un programa POO: una clase `Estudiante` encapsulada, un array de estudiantes, lectura de datos con `Scanner`, cálculo del promedio y mensajes con `if-else`.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=LINK-LECCION-9)
- **Conclusiones clave**: Clases + objetos + arrays + métodos + bucles = un programa real; divide el problema en pasos pequeños.
- **Proyecto final**: [Crea tu aplicación POO](https://replit.com/LINK-PRACTICA-9) 👈 **¡Guarda y comparte!**

### Lección 10: Buenas prácticas, errores comunes y próximos pasos (5 minutos)
- **Descripción**: Aprende a leer los mensajes de error, evita los errores más comunes de principiantes y descubre dónde seguir aprendiendo.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=LINK-LECCION-10)
- **Consejos clave**: Olvidar el `;` o una `}`; comparar `String` con `==` en vez de `.equals()`; usar nombres claros (`edadEstudiante` y no `x`); indentar el código; explorar la [documentación oficial de Java](https://docs.oracle.com/en/java/).
- **Compartir tu trabajo**: [Enviar creación](https://forms.gle/LINK-FORMULARIO)

## Recursos adicionales
- **Código fuente completo**: [Repositorio de GitHub](https://github.com/1ASI0729-7793-ParkShare/java-fundamentals-course-ParkShare.git)
  - `/starter-files`: código inicial de cada práctica
  - `/completed-examples`: soluciones completas de cada lección
  - `/scripts`: scripts para compilar y ejecutar los ejemplos (uso del equipo; los estudiantes no necesitan instalar nada)
- **Todas las actividades prácticas**:

| Número de lección | Actividad | Empezar a programar |
|----------|----------|-------------|
| 1 | Hola mundo | [OnlineGDB](https://onlinegdb.com/LINK-PRACTICA-1) |
| 2 | Tarjeta de presentación con variables | [OnlineGDB](https://onlinegdb.com/LINK-PRACTICA-2) |
| 3 | Calculadora de promedio | [JDoodle](https://www.jdoodle.com/LINK-PRACTICA-3) |
| 4 | Aprobado/desaprobado y tabla de multiplicar | [JDoodle](https://www.jdoodle.com/LINK-PRACTICA-4) |
| 5 | Saludo personalizado con métodos y Scanner | [OnlineGDB](https://onlinegdb.com/LINK-PRACTICA-5) |
| 6 | Clase Mascota | [OnlineGDB](https://onlinegdb.com/LINK-PRACTICA-6) |
| 7 | Mascota encapsulada | [Replit](https://replit.com/LINK-PRACTICA-7) |
| 8 | Lista de mascotas con arrays | [OnlineGDB](https://onlinegdb.com/LINK-PRACTICA-8) |
| 9 | Registro de Estudiantes (proyecto final) | [Replit](https://replit.com/LINK-PRACTICA-9) |

- Cuestionario: [Prueba de conocimientos](https://forms.gle/LINK-CUESTIONARIO)
- Compartir: #JavaBeginners

**¡Gracias por completar el curso!**

---

## 👥 Elaboración

Universidad Peruana de Ciencias Aplicadas<br>
Carrera de Ingeniería de Software<br>
Período 202620<br>
1ASI0729 Desarrollo de Aplicaciones Open Source<br>
NRC 7793<br>
**Nombre del equipo**: ParkShare<br>
**Líder del equipo**: [Nombres y Apellidos]<br>
**Integrantes del equipo**: Tello Palacios, Fabrizio Rafael<br>
**Fecha de entrega**: [Fecha]
