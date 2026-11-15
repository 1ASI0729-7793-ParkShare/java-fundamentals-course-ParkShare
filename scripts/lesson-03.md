# Lección 3: Operadores y expresiones

**Duración aproximada:** 5 minutos

**Herramienta:** OnlineGDB

**Objetivo:** Realizar cálculos matemáticos, comparaciones y combinaciones lógicas en Java utilizando operadores aritméticos, comparativos y lógicos para calcular el promedio de notas.

---

## 0:00 – 0:30 | Introducción

¡Hola a todos! En lecciones anteriores vimos cómo guardar datos en variables, pero un programa sirve de poco si no puede calcular ni tomar decisiones. En esta lección 3 vamos a aprender sobre **operadores y expresiones**, las herramientas que convierten a Java en una calculadora inteligente capaz de comparar valores y sacar conclusiones.

Primero repasaremos de forma clara los tres grupos de operadores con un ejemplo sencillo y luego pasaremos directamente a OnlineGDB para construir paso a paso un programa que calcule el **promedio de tus notas**.

```text
Resta (20 - 5): 15
Multiplicación (4 * 3): 12
7 / 2 con int da: 3
7.0 / 2 con double da: 3.5
Lo que sobra (7 % 2) es: 1

Tu promedio es: 15.0
¿Aprobó? (> 10.5): true
¿Sacó 20? (== 20): false
¿Nota distinta de 0? (!= 0): true
¿Necesita refuerzo? (< 11): false

¿Gana diploma? (&&): true
¿Pasa de año? (||): true

```

---

## 0:30 – 1:50 | Teoría: Operadores aritméticos, comparativos y lógicos

Antes de escribir código, veamos cómo funciona cada grupo de operadores:

* **1. Operadores aritméticos (`+`, `-`, `*`, `/`, `%`) y el cuidado con `int`:** Sirven para hacer operaciones matemáticas: suma (`+`), resta (`-`), multiplicación (`*`), división (`/`) y **módulo (`%`)**, que devuelve el residuo (lo que sobra) de una división. Es igual que repartir **7** rebanadas de pizza entre **2** amigos: a cada uno le tocan **3** rebanadas enteras (`7 / 2 = 3`) y sobra **1** (`7 % 2 = 1`). **¡Mucho cuidado!** En Java, `int` solo guarda enteros y corta los decimales (`7 / 2` da `3`), por eso para promedios y divisiones exactas usamos `double` (`7.0 / 2` da `3.5`).
* **2. Operadores comparativos (`==`, `!=`, `>`, `<`):** Sirven para comparar dos valores y siempre devuelven verdadero (`true`) o falso (`false`). El símbolo `>` es mayor que, `<` es menor que, `!=` significa "diferente de" y `==` compara si dos valores son iguales (recuerda que un solo `=` sirve para asignar valores).
* **3. Operadores lógicos (`&&`, `||`):** Sirven para unir dos condiciones. El operador **`&&` (Y)** exige que *ambas* condiciones se cumplan para devolver `true` (como tener permiso **y** haber hecho la tarea para salir); el operador **`||` (O)** solo necesita que *al menos una* sea verdadera (como pagar el bus con tarjeta **o** con monedas).

---

## 1:50 – 2:45 | Práctica: Estructura base, operadores aritméticos y el cuidado con `int`

Pasamos a OnlineGDB, borramos el código que aparezca por defecto y verificamos que el lenguaje esté en **Java**. Creamos nuestra clase `Main3` con su método `main` (el punto de arranque donde Java empieza a ejecutar las instrucciones) y escribimos las primeras operaciones aritméticas:

```java
public class Calculadora {
    public static void main(String[] args) {
        int resta = 20 - 5;
        int multiplicacion = 4 * 3;
        int divisionEntera = 7 / 2;
        double divisionDecimal = 7.0 / 2;
        int residuo = 7 % 2;

        System.out.println("Resta (20 - 5): " + resta);
        System.out.println("Multiplicación (4 * 3): " + multiplicacion);
        System.out.println("7 / 2 con int da: " + divisionEntera);
        System.out.println("7.0 / 2 con double da: " + divisionDecimal);
        System.out.println("Lo que sobra (7 % 2) es: " + residuo);
    }
}

```

* **`int divisionEntera = 7 / 2;`** demuestra que al dividir enteros con `int` se pierden los decimales y el resultado es `3`.
* **`double divisionDecimal = 7.0 / 2;`** conserva los decimales y entrega `3.5`.
* **`int residuo = 7 % 2;`** usa el operador módulo (`%`) para obtener el `1` que sobra de la división.

---

## 2:45 – 3:30 | Calcular el promedio de notas

Debajo de las impresiones anteriores (dentro de `main`), guardamos tres notas en variables `double` para no perder decimales, las sumamos con `+` y dividimos el total entre `3` con `/`:

```java
        double nota1 = 15.0;
        double nota2 = 12.0;
        double nota3 = 18.0;

        double suma = nota1 + nota2 + nota3;
        double promedio = suma / 3;

        System.out.println("\nTu promedio es: " + promedio);

```

* **`double suma = nota1 + nota2 + nota3;`** acumula el total de las tres calificaciones (`45.0`).
* **`double promedio = suma / 3;`** divide ese total entre la cantidad de notas para obtener `15.0`.

---

## 3:30 – 4:20 | Operadores de comparación y lógicos

Ahora utilizamos variables `boolean` (que solo almacenan `true` o `false`) para que Java evalúe el promedio obtenido y combine condiciones:

```java
        boolean aprobo = promedio > 10.5;
        boolean notaPerfecta = promedio == 20.0;
        boolean noEsCero = promedio != 0;
        boolean necesitaRefuerzo = promedio < 11.0;

        System.out.println("¿Aprobó? (> 10.5): " + aprobo);
        System.out.println("¿Sacó 20? (== 20): " + notaPerfecta);
        System.out.println("¿Nota distinta de 0? (!= 0): " + noEsCero);
        System.out.println("¿Necesita refuerzo? (< 11): " + necesitaRefuerzo);

        boolean buenaAsistencia = true;
        boolean ganaDiploma = (promedio > 14.0) && buenaAsistencia;
        boolean pasaDeAnio = aprobo || (nota3 > 17.0);

        System.out.println("\n¿Gana diploma? (&&): " + ganaDiploma);
        System.out.println("¿Pasa de año? (||): " + pasaDeAnio);

```

* En las **comparaciones**, `promedio > 10.5` devuelve `true` porque `15.0` es mayor que `10.5`, mientras que `promedio == 20.0` devuelve `false`.
* En los **operadores lógicos**, `(promedio > 14.0) && buenaAsistencia` devuelve `true` porque se cumplen ambas condiciones a la vez, y `aprobo || (nota3 > 17.0)` devuelve `true` porque basta con que una se cumpla.

---

## 4:20 – 4:45 | Ejecutar en OnlineGDB

Presionamos **Run** en OnlineGDB y en la consola inferior veremos el resultado de cada bloque:

```text
Resta (20 - 5): 15
Multiplicación (4 * 3): 12
7 / 2 con int da: 3
7.0 / 2 con double da: 3.5
Lo que sobra (7 % 2) es: 1

Tu promedio es: 15.0
¿Aprobó? (> 10.5): true
¿Sacó 20? (== 20): false
¿Nota distinta de 0? (!= 0): true
¿Necesita refuerzo? (< 11): false

¿Gana diploma? (&&): true
¿Pasa de año? (||): true

```

Si cambias el valor de alguna de las notas (por ejemplo, bajas `nota1` y `nota3`), el promedio se recalculará automáticamente y los valores `true` o `false` se actualizarán solos.

---

## 4:45 – 5:00 | Conclusión

¡Listo! Con esto cerramos la Lección 3: ya sabes cómo realizar cálculos matemáticos con `+`, `-`, `*`, `/` y `%`, evitar la pérdida de decimales usando `double` en lugar de `int`, comparar valores con `==`, `!=`, `>`, `<` y unir condiciones lógicas con `&&` y `||`.

---

## Código final

```java
public class Calculadora {
    public static void main(String[] args) {
        int resta = 20 - 5;
        int multiplicacion = 4 * 3;
        int divisionEntera = 7 / 2;
        double divisionDecimal = 7.0 / 2;
        int residuo = 7 % 2;

        System.out.println("Resta (20 - 5): " + resta);
        System.out.println("Multiplicación (4 * 3): " + multiplicacion);
        System.out.println("7 / 2 con int da: " + divisionEntera);
        System.out.println("7.0 / 2 con double da: " + divisionDecimal);
        System.out.println("Lo que sobra (7 % 2) es: " + residuo);

        double nota1 = 15.0;
        double nota2 = 12.0;
        double nota3 = 18.0;

        double suma = nota1 + nota2 + nota3;
        double promedio = suma / 3;

        System.out.println("\nTu promedio es: " + promedio);

        boolean aprobo = promedio > 10.5;
        boolean notaPerfecta = promedio == 20.0;
        boolean noEsCero = promedio != 0;
        boolean necesitaRefuerzo = promedio < 11.0;

        System.out.println("¿Aprobó? (> 10.5): " + aprobo);
        System.out.println("¿Sacó 20? (== 20): " + notaPerfecta);
        System.out.println("¿Nota distinta de 0? (!= 0): " + noEsCero);
        System.out.println("¿Necesita refuerzo? (< 11): " + necesitaRefuerzo);

        boolean buenaAsistencia = true;
        boolean ganaDiploma = (promedio > 14.0) && buenaAsistencia;
        boolean pasaDeAnio = aprobo || (nota3 > 17.0);

        System.out.println("\n¿Gana diploma? (&&): " + ganaDiploma);
        System.out.println("¿Pasa de año? (||): " + pasaDeAnio);
    }
}

```

## Conceptos reforzados

* Operadores aritméticos (`+`, `-`, `*`, `/`) y módulo o residuo (`%`).
* Diferencia entre división entera (`7 / 2 == 3` con `int`) y división con decimales (`7.0 / 2 == 3.5` con `double`).
* Cálculo de promedios utilizando variables `double`.
* Operadores de comparación (`==`, `!=`, `>`, `<`) y almacenamiento en variables `boolean`.
* Operadores lógicos (`&&` y `||`) para evaluar múltiples condiciones.