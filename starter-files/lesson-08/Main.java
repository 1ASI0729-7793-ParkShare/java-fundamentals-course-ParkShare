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

    }
}