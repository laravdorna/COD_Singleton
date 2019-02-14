/*
 * Si el objeto Singleton lo metes en un array puedes decidir cuantos objetos 
puedes instanciar.
 */
package cod_singleton;

/**
 *
 * @author lvazquezdorna
 */
public class ArraySingleton {
 
    private String nombre;
    private int edad;
    private static final ArraySingleton [] aInstancia= new ArraySingleton[3];
    private byte bandera;
    private ArraySingleton() {
    }

    public static Singleton getInstance() {
        if (bandera<aInstancia.length) {
            aInstancia = new aSingleton();
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
}
