/******************************************************************************
 lECCION 7: Encapsulación con getters y setters
 *******************************************************************************/
class Mascota{
    private String nombre;
    private int edad;

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
        Mascota mascota1 = new Mascota();
        mascota1.setNombre("gaturro");

        mascota1.setEdad(11);
        System.out.print("\nEl nombre de la mascota 1 es: "+mascota1.getNombre());
        System.out.print("\nLa edad de la mascota 1 es: "+ mascota1.getEdad());



    }
}
