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