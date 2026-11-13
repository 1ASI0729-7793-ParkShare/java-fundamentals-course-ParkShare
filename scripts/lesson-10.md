# Lección 10: Buenas prácticas, errores comunes y próximos pasos

**Duración aproximada:** 5 minutos  
**Formato:** Presentación PPT + narración  
**Objetivo:** Reconocer errores frecuentes al comenzar a programar en Java, aplicar buenas prácticas básicas y conocer posibles temas para continuar aprendiendo.

## Diapositiva 1 — Buenas prácticas, errores comunes y próximos pasos

**Tiempo aproximado: 0:00 – 0:20**

¡Bienvenido a la última lección del curso!

Durante estas lecciones hemos aprendido diferentes conceptos fundamentales de Java y ya somos capaces de construir pequeños programas utilizando Programación Orientada a Objetos.

Antes de terminar, veremos algunos errores muy comunes al comenzar a programar, buenas prácticas que nos ayudarán a escribir mejor código y algunos temas que podemos aprender después.

## Diapositiva 2 — Lo que ya aprendimos

**Tiempo aproximado: 0:20 – 0:45**

Antes de continuar, recordemos rápidamente todo lo que hemos aprendido.

Comenzamos con variables y tipos de datos, después utilizamos operadores, condicionales y bucles.

También aprendimos a crear métodos, recibir información con `Scanner` y trabajar con clases, objetos, encapsulación y arrays.

En la lección anterior combinamos varios de estos conceptos para construir nuestro registro de estudiantes.

Ahora veremos cómo evitar algunos errores comunes cuando trabajemos en nuestros propios programas.

## Diapositiva 3 — Error común: olvidar el punto y coma

**Tiempo aproximado: 0:45 – 1:20**

Uno de los errores más comunes al comenzar con Java es olvidar el punto y coma al final de una instrucción.

En el primer ejemplo podemos ver:

```java
int edad = 15
```

Aquí falta el punto y coma.

La forma correcta sería:

```java
int edad = 15;
```

Aunque parece un detalle pequeño, Java necesita saber dónde termina cada instrucción.

Si olvidamos el punto y coma, nuestro programa no podrá compilar correctamente.

Por eso, cuando aparezca un error, revisa primero elementos simples como puntos y comas, paréntesis y llaves.

## Diapositiva 4 — Error común: olvidar una llave

**Tiempo aproximado: 1:20 – 1:55**

Otro error frecuente es olvidar cerrar una llave.

Las llaves nos permiten definir dónde comienza y dónde termina un bloque de código.

Por ejemplo:

```java
if (edad >= 18) {
    System.out.println("Mayor de edad");
```

Aquí abrimos una llave después del `if`, pero no la cerramos.

La versión correcta sería:

```java
if (edad >= 18) {
    System.out.println("Mayor de edad");
}
```

Una buena indentación también nos ayuda a detectar este tipo de problemas mucho más rápido.

## Diapositiva 5 — Comparar Strings correctamente

**Tiempo aproximado: 1:55 – 2:35**

Veamos ahora un error que puede ser un poco más difícil de identificar.

Cuando trabajamos con números, podemos utilizar operadores como doble igual para realizar comparaciones.

Sin embargo, cuando queremos comparar el contenido de dos `String`, debemos utilizar el método `equals`.

Por ejemplo, debemos evitar esto:

```java
if (nombre == "Ana") {
    System.out.println("Hola Ana");
}
```

Y utilizar esto:

```java
if (nombre.equals("Ana")) {
    System.out.println("Hola Ana");
}
```

Lo importante es recordar que `equals` nos permite comparar el contenido de los textos.

Así que si estás trabajando con `String` y quieres saber si dos textos contienen lo mismo, utiliza `equals`.

## Diapositiva 6 — Usa nombres claros

**Tiempo aproximado: 2:35 – 3:10**

Una buena práctica muy importante es utilizar nombres que expliquen qué representa cada elemento de nuestro programa.

Por ejemplo:

```java
int x = 15;
double y = 17;
```

Este código puede funcionar, pero al leerlo no sabemos qué significan `x` o `y`.

Podemos hacerlo mucho más claro:

```java
int edadEstudiante = 15;
double notaFinal = 17;
```

Ahora podemos entender inmediatamente qué información contiene cada variable.

Esta práctica también se aplica a métodos y clases.

Un buen nombre puede hacer que nuestro código sea mucho más fácil de entender, tanto para nosotros como para otras personas.

## Diapositiva 7 — Mantén tu código ordenado y pruébalo constantemente

**Tiempo aproximado: 3:10 – 3:50**

También debemos mantener nuestro código organizado.

Por ejemplo, este código:

```java
if (nota >= 11) {
System.out.println("Aprobado");
}
```

puede funcionar, pero resulta más difícil de leer.

Es mejor mantener una indentación consistente:

```java
if (nota >= 11) {
    System.out.println("Aprobado");
}
```

También es recomendable probar nuestro programa frecuentemente.

No esperes a escribir muchas líneas de código antes de comprobar si todo funciona.

Puedes seguir un proceso sencillo:

escribe una pequeña parte, ejecuta el programa, comprueba el resultado y después continúa.

De esta forma, cuando aparezca un error, será mucho más fácil encontrarlo.

## Diapositiva 8 — ¿Qué puedes aprender después?

**Tiempo aproximado: 3:50 – 4:25**

Aunque este curso termina aquí, Java tiene muchos otros conceptos que podemos seguir aprendiendo.

Algunos buenos próximos pasos son `ArrayList`, herencia, interfaces, excepciones y manejo de archivos.

Más adelante también podemos utilizar Java para construir aplicaciones mucho más grandes.

No necesitas aprender todo de inmediato.

Lo más importante es practicar los conceptos que ya conoces y agregar poco a poco nuevas herramientas.

Cada pequeño programa que construyas te ayudará a comprender mejor cómo funciona Java.

## Diapositiva 9 — Cierre del curso

**Tiempo aproximado: 4:25 – 5:00**

¡Felicidades por llegar hasta el final del curso!

Comenzamos escribiendo instrucciones muy sencillas en Java y terminamos construyendo un programa utilizando Programación Orientada a Objetos.

Durante el camino aprendimos a trabajar con variables, decisiones, bucles, métodos, objetos, arrays y muchos otros conceptos fundamentales.

Recuerda que cometer errores es una parte normal de aprender programación.

Lee los mensajes de error con calma, mantén tu código ordenado, prueba constantemente y divide los problemas grandes en partes más pequeñas.

Continúa experimentando con los ejemplos del curso y trata de crear tus propios programas.

La mejor manera de aprender programación es practicando.

¡Gracias por acompañarnos durante este curso y nos vemos en tu próximo proyecto!

## Ideas principales de la lección

- Revisar puntos y comas, paréntesis y llaves.
- Utilizar `equals` para comparar el contenido de `String`.
- Utilizar nombres descriptivos.
- Mantener una indentación consistente.
- Probar el programa frecuentemente.
- Leer los mensajes de error.
- Dividir problemas grandes en partes pequeñas.
- Continuar practicando con nuevos proyectos.
