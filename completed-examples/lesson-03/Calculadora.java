public class Calculadora {
    public static void main(String[] args) {
        // Paso 2: Operadores aritméticos y la trampa del int
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

        // Paso 3: Calcular el promedio de notas
        double nota1 = 15.0;
        double nota2 = 12.0;
        double nota3 = 18.0;

        double suma = nota1 + nota2 + nota3;
        double promedio = suma / 3;

        System.out.println("\nTu promedio es: " + promedio);

        // Paso 4: Operadores de comparación (>, ==, !=, <)
        boolean aprobo = promedio > 10.5;
        boolean notaPerfecta = promedio == 20.0;
        boolean noEsCero = promedio != 0;
        boolean necesitaRefuerzo = promedio < 11.0;

        System.out.println("¿Aprobó? (> 10.5): " + aprobo);
        System.out.println("¿Sacó 20? (== 20): " + notaPerfecta);
        System.out.println("¿Nota distinta de 0? (!= 0): " + noEsCero);
        System.out.println("¿Necesita refuerzo? (< 11): " + necesitaRefuerzo);

        // Paso 5: Operadores lógicos (&&, ||)
        boolean buenaAsistencia = true;
        boolean ganaDiploma = (promedio > 14.0) && buenaAsistencia;
        boolean pasaDeAnio = aprobo || (nota3 > 17.0);

        System.out.println("\n¿Gana diploma? (&&): " + ganaDiploma);
        System.out.println("¿Pasa de año? (||): " + pasaDeAnio);
    }
}