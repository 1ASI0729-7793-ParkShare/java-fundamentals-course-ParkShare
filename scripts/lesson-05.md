
# Lección 5: Métodos, parámetros y Entrada/Salida

**Duración aproximada:** 7 minutos

**Herramienta:** OnlineGDB

**Objetivo:** Comprender qué son los métodos, los parámetros y la entrada/salida de datos en Java, aplicándolo en un programa interactivo en OnlineGDB que saluda al usuario y calcula una suma.

---

## 0:00 – 0:30 | Introducción

¡Buenas tardes! En esta lección 5 vamos a ver tres herramientas fundamentales en Java: los **métodos**, los **parámetros** y la **entrada y salida de datos**.

Primero repasaremos de forma rápida qué hace cada concepto y luego pasaremos directamente a OnlineGDB para construir un programa paso a paso que lea tu nombre por teclado, te salude y calcule una suma.

```text
Escribe tu nombre: Juan
¡Hola, Juan!
El resultado de la suma es: 7

```

---

## 0:30 – 2:15 | Teoría: Métodos, parámetros y Entrada/Salida

Antes de escribir código, veamos cómo funciona cada parte:

* **1. Métodos (`void` y `return`):** Un método es un bloque de código diseñado para cumplir una sola tarea. Lo escribes una única vez y puedes reutilizarlo todas las veces que quieras sin tener que repetir instrucciones.
* Si el método lleva la palabra **`void`** (como `saludar`), significa que solo ejecuta una acción interna en pantalla y no devuelve ningún dato al terminar.
* Si en lugar de `void` lleva un tipo de dato (como `int` en `sumar`), el método usará la palabra **`return`** para devolver un resultado al programa principal (como una calculadora que recibe dos números y te entrega el resultado).


* **2. Parámetros:** Son los datos obligatorios que un método necesita recibir desde afuera para poder trabajar. Por ejemplo, en `public static void saludar(String nombre)`, el método sabe que debe saludar, pero exige el parámetro `String nombre` para saber a quién dirigirse.
* **3. Entrada y Salida (`Scanner`):** Para que el programa lea lo que el usuario escribe en la consola, usamos la clase `Scanner`. Primero encendemos esa herramienta conectándola al teclado y luego capturamos el texto escrito para guardarlo en una variable.



---

## 2:15 – 3:45 | Práctica: Preparar la clase y capturar datos (`Scanner`)

Ahora pasamos a OnlineGDB. Borramos el código por defecto, verificamos que el lenguaje esté en **Java** y comenzamos importando `Scanner` en la primera línea para traer la herramienta de lectura desde la librería de Java:

```java
import java.util.Scanner;

```

Luego creamos el contenedor principal `Voz` (en Java todo código va dentro de una clase) y el método `main`, que es la puerta de entrada donde el programa empieza a ejecutarse línea por línea al presionar **Run**:

```java
public class Voz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = sc.nextLine();
    }
}

```

* **`Scanner sc = new Scanner(System.in);`** crea y enciende la herramienta `sc` conectada al teclado (`System.in`).
* **`System.out.print(...)`** muestra el mensaje en pantalla. Usamos `print` sin `ln` para que el cursor se quede en la misma línea al escribir.
* **`String nombre = sc.nextLine();`** pausa el programa hasta que el usuario escriba su nombre y presione *Enter*, guardando ese texto en la variable `nombre`.



---

## 3:45 – 4:50 | Llamar a los métodos dentro de `main`

Con el nombre ya guardado, llamamos dentro de `main` a los dos métodos que vamos a utilizar y cerramos el `Scanner`:

```java
saludar(nombre);

int resultado = sumar(3, 4);
System.out.println("El resultado de la suma es: " + resultado);

sc.close();

```

* **`saludar(nombre);`** llama al método `saludar` y le envía como parámetro el nombre que el usuario escribió antes.
* **`int resultado = sumar(3, 4);`** llama al método `sumar` enviándole los números `3` y `4`. Como este método devuelve un resultado, lo atrapamos y lo guardamos en la variable `resultado` para luego mostrarlo en pantalla.
* **`sc.close();`** apaga el `Scanner` al terminar de usarlo para liberar memoria del programa.



---

## 4:50 – 6:15 | Definir los métodos fuera de `main`

Debajo del cierre de `main` (pero dentro de `public class Voz`), escribimos la estructura de ambos métodos:

```java
public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre + "!");
}

public static int sumar(int a, int b) {
    return a + b;
}

```

* En **`saludar`**, usamos `void` porque solo realiza la acción de imprimir el saludo uniendo el texto con el parámetro `nombre`, sin devolver ningún valor.


* En **`sumar`**, ponemos `int` en lugar de `void` para indicar que devolverá un número entero al terminar. Recibe los parámetros `a` y `b`, los suma y con **`return a + b;`** devuelve el resultado hacia la línea donde fue llamado dentro de `main`.



---

## 6:15 – 7:00 | Ejecutar en OnlineGDB y conclusión

Presionamos **Run** en OnlineGDB. En la consola inferior aparece `Escribe tu nombre: `, ingresamos **Juan** y presionamos *Enter*:

```text
Escribe tu nombre: Juan
¡Hola, Juan!
El resultado de la suma es: 7

```

Como vemos, el método externo `saludar` imprimió `¡Hola, Juan!` usando el dato capturado por `Scanner`, y el método `sumar` devolvió `7` mediante `return`.

Con esto cerramos la Lección 5: ya sabes cómo leer datos del usuario, enviar parámetros y diferenciar métodos `void` de métodos que devuelven resultados.

---

## Código final

```java
import java.util.Scanner;

public class Voz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = sc.nextLine();

        saludar(nombre);

        int resultado = sumar(3, 4);
        System.out.println("El resultado de la suma es: " + resultado);

        sc.close();
    }

    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
}

```

## Conceptos reforzados

* Importación y cierre de `Scanner` (`import java.util.Scanner;` y `sc.close()`).
* Lectura de datos por consola con `nextLine()` y salida con `print` / `println`.
* Creación y llamada de métodos fuera de `main`.
* Envío de parámetros (`String nombre`, `int a, int b`).
* Diferencia entre métodos de acción (`void`) y métodos con retorno (`return`).