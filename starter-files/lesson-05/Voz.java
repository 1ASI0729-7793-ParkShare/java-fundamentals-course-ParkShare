import java.util.Scanner;

public class Voz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = sc.nextLine();

        saludar(nombre);

        int resultado = sumar(3, 4);
        System.out.println("El resultado de sumar(3, 4) es: " + resultado);

        sc.close();
    }

    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
}