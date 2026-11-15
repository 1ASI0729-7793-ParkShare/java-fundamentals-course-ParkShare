/******************************************************************************
 lECCION 8: Arrays y cadenas con objetos
 *******************************************************************************/
class Mascota{
    private String nombre;
    private int edad;

    public Mascota (String nombre, int edad){
        this.nombre = nombre;
        setEdad(edad);
    }
    //Metodos setters
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    public void setEdad( int _edad){
        if(_edad >=0){
            this.edad = _edad;
        }else{
            System.out.print("Error! Se rechazo el dato. No se realizaron cambios.\n");
        }
    }
    //Metodos getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
}


public class Main
{
    public static void main(String[] args) {
        // 0
        int[] numeros ={10,50,12,9,11};

        for(int i= 0; i < numeros.length; i++){
            System.out.print("\nIndice "+i+": "+numeros[i]);
        }

        Mascota[] misMascotas = new Mascota[3];

        misMascotas[0] = new Mascota("sultan",7);
        misMascotas[1] = new Mascota("Karla",5);
        misMascotas[2] = new Mascota("Manchas",9);

        for (Mascota m : misMascotas) {
            System.out.println("\n- Nombre: " + m.getNombre() + " | Edad: " + m.getEdad() + " años");
        }

        String texto = "Aprender java es divertido";
        String perro = "Sultan";
        String perro2 = "Sultan";

        System.out.print("\nLa cantidad de caracteres de este texto es: "+ texto.length());

        System.out.print("\nNombre en mayusculas: "+perro.toUpperCase());

        System.out.print("\nComparando si son iguales: "+perro.equals(texto));
        System.out.print("\nComparando si son iguales: "+perro.equals(perro2));
    }
}