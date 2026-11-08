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

        System.out.println("\nPromedio del grupo: " + promedio);

        scanner.close();
    }
}