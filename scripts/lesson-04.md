# Leccion 4:  Estructuras de control: Decisiones y bucles 

**Duración aproxiamda:** 8 minutos

**Herramienta**: JDoodle / OnlineGDB (Java)   

1. Introducción y Contexto (0:00 - 1:30 min)

"¡Hola de nuevo! Hasta ahora nuestros programas hacían una sola cosa de principio a fin y terminaban. Pero, ¿qué pasa si el programa necesita tomar decisiones, como evaluar si aprobaste un examen? O, ¿si necesitas repetir una tarea 10 veces sin escribir el código 10 veces? Para eso existen las estructuras de control: los if-else para tomar decisiones y los bucles for y while para repetir tareas automáticamente."

2. Decisiones con if-else y Bucles (for y while) (1:30 - 4:30 min)

"Primero, el if-else actúa como un vigilante: evalúa una condición. Por ejemplo, si tu nota es mayor o igual a 11, el programa te dirá que aprobaste; si no (else), te dirá que debes esforzarte un poco más. Por otro lado, cuando queremos repetir algo de forma exacta —como calcular una tabla de multiplicar— usamos el bucle for. Y si queremos repetir algo mientras una condición se cumpla, usamos el bucle while."

3. Demostración Práctica en Línea (4:30 - 7:00 min)

Narración:
"Haz clic en el enlace de práctica que dejamos en la descripción para abrir el entorno en línea sin instalar nada. Vamos a analizar este código juntos:"   


Java
public class Main {
    public static void main(String[] args) {
        // 1. Ejemplo de Decisiones con if-else
        int nota = 14;
        System.out.println("Tu nota es: " + nota);
        
        if (nota >= 11) {
            System.out.println("¡Felicitaciones, aprobaste el curso!");
        } else {
            System.out.println("Estás desaprobado, ¡a repasar más!");
        }
        
        // 2. Ejemplo de Bucle for (Tabla de multiplicar del 5)
        System.out.println("\n--- Tabla de multiplicar del 5 ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

"Al ejecutar el código, verás cómo el programa evalúa automáticamente la variable nota usando el if-else y luego genera la tabla del 5 paso a paso gracias al bucle for. ¡Es sumamente útil y ahorra muchísimo tiempo de programación!"

4. Conclusiones Clave y Cierre (7:00 - 8:00 min)

"Conclusiones clave de hoy: usa if-else para tomar decisiones lógicas en tus programas y los bucles for o while para automatizar tareas repetitivas. No olvides probar y modificar este código en el enlace de práctica de la descripción. ¡Nos vemos en la siguiente lección!"