# Lección 2: Variables y tipos de datos

**Duración aproximada:** 15 minutos

**Herramienta:** OnlineGDB

**Objetivo:** Declarar variables en Java con los tipos de datos `int`, `double`, `char`, `boolean` y `String`, y mostrarlas en consola con `System.out.println` y concatenación para crear una tarjeta de presentación.

---

## 0:00 – 0:16 | Introducción

¡Hola y bienvenido a la lección 2! En la lección anterior hicimos que tu computadora mostrara el mensaje "Hola mundo". Ahora le vamos a enseñar a **recordar datos** como tu nombre, tu edad y tu estatura.

Al final de esta lección crearás una **tarjeta de presentación**, como si fuera tu propia página personal pero dentro de la consola. Este será el resultado final:

```text
==========================
Mi tarjeta de presentación
==========================
Nombre: Ana
Mi edad es: 15 años.
Estatura: 1.65 m
¿Me gusta programar? true
Sección: A

```

---

## 0:16 – 2:38 | Teoría: ¿Qué es una variable y qué tipos de datos existen?

Antes de escribir código, veamos qué es una variable y qué tipos de datos podemos guardar en ella:

* **1. ¿Qué es una variable?** Imagina una **caja** a la que le pones una etiqueta llamada `edad` y dentro colocas el número `15`. Eso es una variable: un espacio con nombre donde se guarda un valor. Más adelante puedes cambiar el contenido de la caja por el número `16`; por eso se llama *variable*, porque su valor puede **variar** según el uso que le des.
* **2. Estructura de una variable:** Siempre sigue el mismo orden: **tipo**, **nombre** y **valor**, y **cada línea de código termina con punto y coma (`;`)**. Por ejemplo, `int edad = 15;` significa: una variable de tipo entero (`int`), llamada `edad`, con el valor `15`.
* **3. Tipos de datos en Java:**
  * **`int`:** guarda solo números **enteros** (por ejemplo `15`). No admite decimales, pero sí números negativos.
  * **`double`:** guarda números **decimales**. El decimal se escribe con **punto** y no con coma (`1.65`); si usas coma, Java no lo reconoce como número y dará error.
  * **`char`:** guarda **un solo carácter** (una letra) y se escribe entre **comillas simples**, por ejemplo `'B'`.
  * **`boolean`:** solo guarda dos valores, `true` (verdadero) o `false` (falso). Se usa sobre todo para validaciones y condiciones.
  * **`String`:** guarda **texto**, una palabra completa o una oración, como `"Ana"`. Se escribe con **S mayúscula** y entre **comillas dobles**.

---

## 2:38 – 3:44 | Práctica: Estructura base y mensaje en consola

Pasamos a OnlineGDB y verificamos que el lenguaje esté en **Java**. Todo programa en Java tiene una estructura principal: una clase `Main` con su método `main` (el punto de arranque donde Java empieza a ejecutar las instrucciones, de arriba hacia abajo):

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```

* **`System.out.println(...)`** imprime un mensaje en la consola. Al presionar el botón verde **Run**, aparece `Hello World`.
* Todo lo que va **entre comillas dobles** es un `String` (un conjunto de caracteres).

---

## 3:44 – 6:39 | Declarar una variable y concatenar mensajes

Declaramos nuestra primera variable `edad` de tipo `int` con el valor `15`. Si solo la declaramos y ejecutamos, no veremos nada nuevo: para **mostrarla** hay que imprimirla escribiendo su nombre **sin comillas**, porque es una variable y no un texto:

```java
        int edad = 15;
        System.out.println(edad);

```

Para que el mensaje sea más natural, usamos la **concatenación**: unimos textos y variables con el operador `+` dentro del `println`:

```java
        System.out.println("Mi edad es: " + edad + " años.");

```

* **`"Mi edad es: "`** es el texto inicial; deja un **espacio** al final, porque Java muestra el valor justo después de las comillas.
* **`+ edad +`** inserta el valor de la variable (`15`) dentro de la oración.
* **`" años."`** cierra la oración; también lleva un espacio al inicio. Sin esos espacios, todo saldría pegado.

Con esto ya no necesitamos el mensaje `Hello World`, así que lo borramos.

---

## 6:39 – 9:43 | Nombre y estatura: `String`, `double` y `println`

Declaramos las otras dos variables de nuestra tarjeta. El nombre es un conjunto de caracteres, por eso usa `String` y **comillas dobles**; la estatura es un número decimal, por eso usa `double` y se escribe **con punto**:

```java
        String nombre = "Ana";
        double estatura = 1.65;

        System.out.println("Nombre: " + nombre);
        System.out.println("Estatura: " + estatura + " m");

```

* **`String nombre = "Ana";`** guarda un texto. Puedes poner tu propio nombre.
* **`double estatura = 1.65;`** guarda un decimal. Con una coma (`1,65`) el código daría error.

Si usamos solo `print`, todos los mensajes salen **en una sola línea** y no se leen bien. Al añadir **`ln`** (de *line*, línea) al final, es decir `println`, cada mensaje se imprime en su propia línea y el siguiente empieza en una línea nueva.

---

## 9:43 – 11:03 | Título y separadores de la tarjeta

Para darle aspecto de tarjeta, imprimimos un título con un marco de signos `=` del mismo ancho del título, arriba y abajo. Recuerda que Java imprime **siempre en orden, de arriba hacia abajo**:

```java
        System.out.println("==========================");
        System.out.println("Mi tarjeta de presentación");
        System.out.println("==========================");

```

* Estas tres líneas deben ir **antes** de los datos para que el título aparezca primero.

---

## 11:03 – 12:45 | Variable `boolean`

Ahora usamos una variable `boolean`, que solo puede ser `true` o `false` y se usa sobre todo en condiciones (más adelante la veremos en detalle). La utilizamos para indicar si te gusta programar:

```java
        boolean programar = true;
        System.out.println("¿Me gusta programar? " + programar);

```

* **`boolean`** se escribe completo (no `bool`); si lo escribes mal, Java muestra un error al ejecutar.
* Los valores `true` y `false` se escriben en minúscula y **sin comillas**.

---

## 12:45 – 14:07 | Variable `char`

Por último usamos `char`, que guarda **un solo carácter**. Va entre **comillas simples**, a diferencia de `String`, que usa comillas dobles. Lo usamos para indicar tu sección:

```java
        char seccion = 'A';
        System.out.println("Sección: " + seccion);

```

* **`char seccion = 'A';`** guarda una única letra.
* `String` guarda varios caracteres seguidos (como un nombre); `char` solo guarda uno.

---

## 14:07 – 14:21 | Ejecutar en OnlineGDB

Presionamos **Run** y en la consola inferior veremos la tarjeta de presentación completa:

```text
==========================
Mi tarjeta de presentación
==========================
Nombre: Ana
Mi edad es: 15 años.
Estatura: 1.65 m
¿Me gusta programar? true
Sección: A

```

Si cambias los valores de las variables (por ejemplo tu nombre, tu edad o tu sección), la tarjeta se actualizará automáticamente.

---

## 14:21 – 14:40 | Conclusión

¡Listo! Con esto cerramos la Lección 2: ya sabes qué es una variable, cómo declararla con su **tipo**, **nombre** y **valor**, cómo elegir entre `int`, `double`, `char`, `boolean` y `String`, y cómo mostrar tus datos en consola con `println` y concatenación. En las próximas lecciones veremos operadores, funciones y validaciones, donde usaremos las variables `boolean`.

---

## Código final

```java
public class Main {
    public static void main(String[] args) {
        int edad = 15;
        String nombre = "Ana";
        double estatura = 1.65;
        boolean programar = true;
        char seccion = 'A';

        System.out.println("==========================");
        System.out.println("Mi tarjeta de presentación");
        System.out.println("==========================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Mi edad es: " + edad + " años.");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("¿Me gusta programar? " + programar);
        System.out.println("Sección: " + seccion);
    }
}

```

## Conceptos reforzados

* Una variable es un espacio con nombre que guarda un valor que puede cambiar.
* Estructura de una variable: tipo, nombre y valor, terminando siempre en punto y coma (`;`).
* Tipos de datos: `int` (enteros), `double` (decimales con punto), `char` (un carácter entre comillas simples), `boolean` (`true` o `false`) y `String` (texto entre comillas dobles).
* Mostrar variables con `System.out.println` escribiendo su nombre sin comillas.
* Concatenación con `+` para unir texto y variables, cuidando los espacios.
* Diferencia entre `print` (misma línea) y `println` (salto de línea).
