# Lección 6: Introducción a la POO: Clases, objetos y constructores

**Duración aproximada:** 7 minutos

**Herramienta:** OnlineGDB

**Objetivo:** Comprender los fundamentos de la Programación Orientada a Objetos (clases, constructores y objetos) y aplicarlos en OnlineGDB creando una clase `Mascota` y un objeto funcional.

---

## 0:00 – 0:35 | Introducción

¡Hola a todos! En esta lección 6 vamos a dar el salto a la **Programación Orientada a Objetos (POO)** en Java, enfocándonos en tres pilares: **clases**, **constructores** y **objetos**.

Primero repasaremos de forma clara qué significa cada concepto con un ejemplo sencillo y luego pasaremos directamente a OnlineGDB para construir paso a paso una clase `Mascota` y darle vida a un objeto llamado `"Juan"`.

```text
¡Guau! Soy Juan y tengo 3 años.

```

---

## 0:35 – 2:15 | Teoría: Clases, constructores y objetos

Antes de escribir código, veamos cómo se conecta cada pieza:

* **1. Clases (El molde o plano):** Una clase es la plantilla base de lo que vas a programar; define qué características (*atributos*) y qué acciones (*métodos*) tendrán los elementos que crees con ella. Es igual que el **plano de un arquitecto**: el plano en papel no es una casa real donde puedas vivir, pero define exactamente la estructura que tendrán todas las casas construidas con ese diseño.

* **2. Constructores (Valores iniciales):** Es un bloque especial dentro de la clase que se activa una sola vez en el momento exacto en que se crea un elemento nuevo. Su función es recibir datos desde afuera y asignar los valores iniciales con los que arrancará ese elemento.

* **3. Objetos (La cosa real):** Si la clase era el plano del arquitecto, el objeto es la **casa ya terminada**. Se fabrica a partir de la clase, guarda sus propios datos en memoria y puede ejecutar sus propios métodos.



---

## 2:15 – 3:30 | Práctica: Crear la clase `Mascota` y sus atributos

Pasamos a OnlineGDB, borramos el código anterior de la lección 5 y verificamos que el lenguaje esté en **Java**. Comenzamos creando el molde `Mascota` con sus dos características principales:

```java
class Mascota {
    String nombre;
    int edad;
}

```

* **`String nombre;`** es el primer atributo: indica que todas las mascotas que fabriquemos tendrán un nombre en formato de texto.
* **`int edad;`** es el segundo atributo: indica que todas las mascotas tendrán una edad en número entero.



---

## 3:30 – 4:45 | Agregar el constructor y el método `ladrar()`

Dentro de `class Mascota`, escribimos primero el **constructor** (que lleva exactamente el mismo nombre que la clase) y luego la acción que nuestra mascota sabe hacer:

```java
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void ladrar() {
        System.out.println("¡Guau! Soy " + nombre + " y tengo " + edad + " años.");
    }

```

* En el **constructor**, recibimos los datos externos `nombre` y `edad` y los guardamos dentro de los atributos propios del objeto usando **`this.nombre`** y **`this.edad`**.
* En el **método `ladrar()**`, definimos una acción propia de la clase `Mascota` que imprime un saludo usando los datos que tiene guardados esa mascota.



---

## 4:45 – 5:55 | Crear el objeto en `Main6`

Debajo del cierre de `class Mascota`, escribimos la clase principal `Main6` con su método `main`, que es la puerta de entrada donde Java empieza a ejecutar el programa:

```java
public class Main6 {
    public static void main(String[] args) {
        Mascota m = new Mascota("Juan", 3);
        m.ladrar();
    }
}

```

* **`Mascota m = new Mascota("Juan", 3);`** usa el molde para fabricar el objeto real. La palabra **`new`** llama al constructor, le entrega `"Juan"` y `3`, y guarda la mascota terminada dentro de la variable `m`.
* **`m.ladrar();`** le da la orden al objeto `m` de ejecutar su acción en la consola.



---

## 5:55 – 6:35 | Ejecutar en OnlineGDB

Presionamos **Run** en OnlineGDB y en la consola inferior veremos el resultado:

```text
¡Guau! Soy Juan y tengo 3 años.

```

Si quisiéramos crear otra mascota distinta (por ejemplo, `"Lucas"` de `4` años), no tendríamos que volver a programar toda la clase; bastaría con reutilizar el molde creando un nuevo objeto con `new`.

---

## 6:35 – 7:00 | Conclusión

¡Listo! Con esto cerramos la Lección 6: ya sabes cómo diseñar una **clase** como plantilla, entregarle datos de arranque mediante un **constructor**, programar lo que sabe hacer con **métodos** y crear **objetos** reales con `new`.

---

## Código final

```java
class Mascota {
    String nombre;
    int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void ladrar() {
        System.out.println("¡Guau! Soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class Main6 {
    public static void main(String[] args) {
        Mascota m = new Mascota("Juan", 3);
        m.ladrar();
    }
}

```

## Conceptos reforzados

* Definición de clases y atributos (`String` e `int`).
* Analogía de clase como molde/plano y objeto como elemento terminado.
* Creación de constructores y uso de la palabra clave `this`.
* Métodos propios de una clase (`ladrar()`).
* Instanciación de objetos con `new` y llamada a sus métodos.



-