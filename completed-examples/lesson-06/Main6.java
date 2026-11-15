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