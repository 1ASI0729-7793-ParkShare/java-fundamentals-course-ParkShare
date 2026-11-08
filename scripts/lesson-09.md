# Lección 9: Proyecto Final — Registro de Estudiantes con POO

**Duración aproximada:** 7 minutos  
**Herramienta:** JDoodle  
**Objetivo:** Integrar los conceptos aprendidos durante las lecciones anteriores mediante un programa sencillo de registro de estudiantes utilizando Programación Orientada a Objetos.

---

## 0:00 – 0:35 | Introducción

¡Bienvenido a la lección 9!

Hasta ahora hemos aprendido diferentes conceptos de Java por separado. En esta lección vamos a combinarlos para construir nuestro primer programa completo utilizando Programación Orientada a Objetos.

Crearemos un pequeño registro de estudiantes.

Nuestro programa permitirá ingresar el nombre y la nota de tres estudiantes. Después mostrará si cada estudiante aprobó o desaprobó y, finalmente, calculará el promedio de todo el grupo.

Para construirlo utilizaremos clases, objetos, encapsulación, arrays, métodos, bucles, condicionales y entrada de datos con `Scanner`.

```text
Registro de Estudiantes

Estudiante 1
Nombre: Ana
Nota: 17

Estudiante 2
Nombre: Luis
Nota: 9

Estudiante 3
Nombre: Carla
Nota: 14

Resultados
Ana - Nota: 17.0 - Aprobado
Luis - Nota: 9.0 - Desaprobado
Carla - Nota: 14.0 - Aprobado

Promedio del grupo: 13.333333333333334
```

---

## 0:35 – 1:20 | Crear la clase Estudiante

Comencemos creando una clase llamada `Estudiante`.

Recuerda que una clase funciona como un molde que nos permite crear objetos.

En este caso, cada estudiante tendrá dos datos: su nombre y su nota.

```java
class Estudiante {

    private String nombre;
    private double nota;
}
```

Para almacenar el nombre utilizamos `String`, mientras que para la nota utilizamos `double`, ya que de esta manera también podemos trabajar con notas que tengan decimales.

Además, declaramos ambos atributos como `private`.

Esto aplica el concepto de encapsulación que vimos anteriormente. Los datos pertenecen al objeto y no queremos modificarlos directamente desde cualquier parte del programa.

---

## 1:20 – 2:05 | Constructor y métodos

Ahora necesitamos una forma de proporcionar un nombre y una nota cada vez que creemos un estudiante.

Para eso utilizamos un constructor.

```java
public Estudiante(String nombre, double nota) {
    this.nombre = nombre;
    this.nota = nota;
}
```

El constructor recibe los datos y los almacena en los atributos del objeto.

La palabra `this` nos permite indicar que nos estamos refiriendo a los atributos de este estudiante.

Ahora agregaremos dos getters.

```java
public String getNombre() {
    return nombre;
}

public double getNota() {
    return nota;
}
```

Estos métodos nos permiten obtener el nombre y la nota sin acceder directamente a los atributos privados.

Finalmente, añadiremos un método llamado `estaAprobado`.

```java
public boolean estaAprobado() {
    return nota >= 11;
}
```

Este método devuelve `true` cuando la nota es mayor o igual a 11 y `false` cuando es menor.

De esta forma, cada objeto `Estudiante` puede determinar por sí mismo si aprobó o desaprobó.

---

## 2:05 – 2:45 | Scanner y array de estudiantes

Ahora vamos a trabajar dentro del método `main`.

Primero creamos un objeto `Scanner`.

```java
Scanner scanner = new Scanner(System.in);
```

Como vimos anteriormente, `Scanner` nos permite leer los datos que una persona escribe en la consola.

Después necesitamos un lugar donde guardar nuestros estudiantes.

Para ello utilizaremos un array.

```java
Estudiante[] estudiantes = new Estudiante[3];
```

Este array tiene espacio para tres objetos de tipo `Estudiante`.

Por ahora estos espacios están vacíos. Los iremos llenando mientras el usuario introduce los datos.

---

## 2:45 – 4:05 | Registrar estudiantes

Queremos registrar tres estudiantes.

En lugar de escribir el mismo código tres veces, podemos utilizar un bucle `for`.

```java
for (int i = 0; i < estudiantes.length; i++) {
```

El bucle comenzará en cero y continuará mientras `i` sea menor que la cantidad de espacios disponibles en nuestro array.

Dentro del bucle mostramos qué estudiante estamos registrando.

```java
System.out.println("\nEstudiante " + (i + 1));
```

Después pedimos su nombre.

```java
System.out.print("Nombre: ");
String nombre = scanner.nextLine();
```

Y hacemos lo mismo con la nota.

```java
System.out.print("Nota: ");
double nota = scanner.nextDouble();
scanner.nextLine();
```

Después de utilizar `nextDouble`, escribimos también `nextLine`.

Esto permite consumir el salto de línea que queda después de introducir el número y evita problemas cuando intentemos leer el nombre del siguiente estudiante.

Ahora que tenemos ambos datos podemos crear nuestro objeto.

```java
estudiantes[i] = new Estudiante(nombre, nota);
```

Con `new Estudiante` estamos utilizando el constructor que creamos anteriormente.

Después guardamos ese objeto en la posición correspondiente del array.

El bucle repetirá este proceso hasta registrar a los tres estudiantes.

---

## 4:05 – 5:25 | Mostrar los resultados

Ahora que tenemos nuestros tres estudiantes registrados, vamos a mostrar sus resultados.

Primero creamos una variable llamada `sumaNotas`.

```java
double sumaNotas = 0;
```

La utilizaremos para sumar las notas y calcular posteriormente el promedio.

Ahora recorremos nuevamente el array.

```java
for (Estudiante estudiante : estudiantes) {
```

Esta forma del bucle `for` nos permite trabajar directamente con cada objeto almacenado en el array.

Primero añadimos la nota del estudiante a nuestra suma.

```java
sumaNotas += estudiante.getNota();
```

Luego mostramos el nombre y la nota utilizando nuestros getters.

```java
System.out.print(
    estudiante.getNombre()
    + " - Nota: "
    + estudiante.getNota()
);
```

Ahora utilizaremos el método `estaAprobado` junto con un `if-else`.

```java
if (estudiante.estaAprobado()) {
    System.out.println(" - Aprobado");
} else {
    System.out.println(" - Desaprobado");
}
```

Cuando `estaAprobado` devuelve `true`, mostramos que el estudiante aprobó.

De lo contrario, mostramos que desaprobó.

---

## 5:25 – 6:05 | Calcular el promedio

Ya tenemos la suma de todas las notas.

Para calcular el promedio simplemente dividimos esa suma entre la cantidad de estudiantes.

```java
double promedio = sumaNotas / estudiantes.length;
```

Finalmente mostramos el resultado utilizando `System.out.println`.

```java
System.out.println(
    "\nPromedio del grupo: " + promedio
);
```

De esta manera no necesitamos aprender ninguna instrucción nueva para mostrar nuestro resultado.

---

## 6:05 – 6:35 | Ejecutar el programa

Nuestro programa ya está terminado.

Vamos a ejecutarlo y registrar tres estudiantes para comprobar su funcionamiento.

Ejecutar en JDoodle e ingresar:

```text
Ana
17
Luis
9
Carla
14
```

Después mostrar:

```text
Resultados
Ana - Nota: 17.0 - Aprobado
Luis - Nota: 9.0 - Desaprobado
Carla - Nota: 14.0 - Aprobado

Promedio del grupo: 13.333333333333334
```

Podemos observar que Ana y Carla aprobaron, mientras que Luis desaprobó.

Además, el programa utilizó las tres notas para calcular automáticamente el promedio del grupo.

---

## 6:35 – 7:00 | Conclusión

¡Y listo! Hemos creado nuestro primer programa combinando Programación Orientada a Objetos con diferentes conceptos que vimos durante el curso.

Utilizamos una clase para representar a un estudiante, objetos para almacenar sus datos, encapsulación para protegerlos, un array para guardar varios estudiantes, `Scanner` para recibir información, bucles para repetir tareas y condicionales para tomar decisiones.

Recuerda que no necesitas resolver todo un programa al mismo tiempo. Puedes dividir un problema grande en partes pequeñas y resolverlas una por una.

En nuestra siguiente y última lección veremos buenas prácticas, algunos errores comunes al comenzar a programar y qué puedes aprender después de terminar este curso.

---

## Código final

```java
import java.util.Scanner;

class Estudiante {

    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public boolean estaAprobado() {
        return nota >= 11;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Estudiante[] estudiantes = new Estudiante[3];

        System.out.println("Registro de Estudiantes");

        for (int i = 0; i < estudiantes.length; i++) {

            System.out.println("\nEstudiante " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Nota: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            estudiantes[i] = new Estudiante(nombre, nota);
        }

        double sumaNotas = 0;

        System.out.println("\nResultados");

        for (Estudiante estudiante : estudiantes) {

            sumaNotas += estudiante.getNota();

            System.out.print(
                estudiante.getNombre()
                + " - Nota: "
                + estudiante.getNota()
            );

            if (estudiante.estaAprobado()) {
                System.out.println(" - Aprobado");
            } else {
                System.out.println(" - Desaprobado");
            }
        }

        double promedio = sumaNotas / estudiantes.length;

        System.out.println(
            "\nPromedio del grupo: " + promedio
        );

        scanner.close();
    }
}
```

## Conceptos reforzados

- Clases y objetos.
- Atributos privados.
- Encapsulación.
- Constructores.
- Getters.
- Métodos.
- Arrays de objetos.
- Entrada de datos con `Scanner`.
- Bucles `for`.
- Condicionales `if-else`.
- Operaciones matemáticas básicas.
