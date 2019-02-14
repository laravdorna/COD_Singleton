/*
 * 
 */
package cod_singleton;

/**
 *
 * @author lvazquezdorna
 */
public class Singleton {

    private String nombre;
    private int edad;
    private static Singleton instancia;

    Singleton() {
    }

    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Singleton{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

}
