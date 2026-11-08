# Lección 10: Buenas prácticas, errores comunes y próximos pasos

**Duración aproximada:** 5 minutos  
**Herramienta:** JDoodle  
**Objetivo:** Reconocer errores frecuentes al comenzar a programar en Java, aplicar buenas prácticas básicas y conocer posibles temas para continuar aprendiendo.

---

## 0:00 – 0:30 | Introducción

¡Bienvenido a la última lección del curso!

Ya hemos aprendido a utilizar variables, operadores, condicionales, bucles, métodos, clases, objetos, encapsulación y arrays.

Incluso construimos nuestro propio registro de estudiantes.

Antes de terminar, veremos algunos errores muy comunes cuando comenzamos a programar y varias buenas prácticas que pueden ayudarte a escribir código más claro y fácil de entender.

---

## 0:30 – 1:10 | Error 1: olvidar el punto y coma

Uno de los errores más comunes en Java es olvidar el punto y coma al final de una instrucción.

Observa este ejemplo.

```java
int edad = 15
System.out.println(edad);
```

Si intentamos ejecutar este código, Java mostrará un mensaje de error porque falta el punto y coma después del número 15.

La versión correcta es esta:

```java
int edad = 15;
System.out.println(edad);
```

Cuando tu programa no pueda ejecutarse, lee con calma el mensaje de error y revisa las líneas cercanas a la ubicación que Java te indique.

Muchas veces se trata de un pequeño detalle como este.

---

## 1:10 – 1:50 | Error 2: olvidar una llave

Otro error frecuente es olvidar cerrar una llave.

Por ejemplo:

```java
if (edad >= 18) {
    System.out.println("Mayor de edad");
```

Abrimos una llave después del `if`, pero nunca la cerramos.

La versión correcta sería:

```java
if (edad >= 18) {
    System.out.println("Mayor de edad");
}
```

Las llaves nos ayudan a indicar dónde comienza y termina un bloque de código.

Una buena indentación también hace mucho más fácil detectar este tipo de errores.

---

## 1:50 – 2:35 | Error 3: comparar String con ==

Veamos ahora un error que puede ser un poco más difícil de identificar.

Cuando queremos comparar el contenido de dos textos en Java, debemos utilizar el método `equals`.

No es recomendable hacer algo como esto:

```java
if (nombre == "Ana") {
    System.out.println("Hola Ana");
}
```

Para comparar el contenido de un `String`, utilizamos `equals`.

```java
if (nombre.equals("Ana")) {
    System.out.println("Hola Ana");
}
```

Recuerda esta diferencia:

para comparar valores numéricos podemos utilizar operadores como doble igual, pero para comparar el contenido de un `String` utilizamos `equals`.

---

## 2:35 – 3:15 | Utilizar nombres claros

Una buena práctica muy importante es utilizar nombres que expliquen qué representa cada elemento de nuestro programa.

Por ejemplo, observa estas variables:

```java
int x = 15;
double y = 17;
```

El código funciona, pero no sabemos qué significan `x` o `y`.

Podemos mejorarlo utilizando nombres más descriptivos.

```java
int edadEstudiante = 15;
double notaFinal = 17;
```

Ahora podemos entender el propósito de cada variable simplemente leyendo su nombre.

Lo mismo se aplica a clases y métodos.

Un buen nombre puede hacer que nuestro código sea mucho más fácil de entender.

---

## 3:15 – 3:50 | Mantener el código ordenado

También debemos mantener una indentación consistente.

Compara estos dos ejemplos.

```java
if (nota >= 11) {
System.out.println("Aprobado");
}
```

Cambiar a:

```java
if (nota >= 11) {
    System.out.println("Aprobado");
}
```

Ambos pueden funcionar, pero el segundo es mucho más fácil de leer.

Mientras tus programas crezcan, mantener el código organizado será cada vez más importante.

También recuerda dividir problemas grandes en partes pequeñas utilizando clases y métodos.

---

## 3:50 – 4:20 | Probar el programa constantemente

Otra recomendación es ejecutar tu programa frecuentemente mientras estás trabajando.

No esperes a escribir decenas de líneas antes de comprobar si funcionan.

Puedes escribir una pequeña parte, ejecutarla y comprobar el resultado.

Si todo funciona, continúa con la siguiente parte.

Así será mucho más sencillo encontrar un error cuando aparezca.

Mostrar:

```text
Escribe una parte
      ↓
Ejecuta
      ↓
Comprueba el resultado
      ↓
Continúa
```

---

## 4:20 – 4:50 | ¿Qué aprender después?

Aunque este curso termina aquí, Java tiene muchos conceptos que todavía puedes explorar.

Después de dominar estos fundamentos, algunos temas que podrías aprender son:

```text
ArrayList
Herencia
Interfaces
Excepciones
Archivos
Aplicaciones más grandes
```

No necesitas aprenderlos todos al mismo tiempo.

Lo importante es seguir practicando y construir programas pequeños que te permitan aplicar cada concepto nuevo.

---

## 4:50 – 5:00 | Cierre del curso

¡Felicidades por llegar hasta el final!

Durante este curso pasaste de escribir tus primeras instrucciones en Java a construir un programa utilizando Programación Orientada a Objetos.

Continúa experimentando, modifica los ejemplos y trata de crear tus propios proyectos.

La mejor manera de aprender programación es practicando.

¡Nos vemos en tu próximo proyecto!

---

## Resumen de buenas prácticas

- Lee los mensajes de error con calma.
- Revisa puntos y comas, paréntesis y llaves.
- Usa `equals` para comparar el contenido de `String`.
- Utiliza nombres descriptivos.
- Mantén una indentación consistente.
- Divide problemas grandes en partes pequeñas.
- Ejecuta y prueba tu programa frecuentemente.
- Practica modificando y creando tus propios ejemplos.

## Errores comunes vistos

### Falta de punto y coma

Incorrecto:

```java
int edad = 15
```

Correcto:

```java
int edad = 15;
```

### Falta de llave de cierre

Incorrecto:

```java
if (edad >= 18) {
    System.out.println("Mayor de edad");
```

Correcto:

```java
if (edad >= 18) {
    System.out.println("Mayor de edad");
}
```

### Comparación de String

Evitar:

```java
nombre == "Ana"
```

Utilizar:

```java
nombre.equals("Ana")
```

### Nombres poco descriptivos

Evitar:

```java
int x = 15;
double y = 17;
```

Preferir:

```java
int edadEstudiante = 15;
double notaFinal = 17;
```
